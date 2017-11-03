package com.tian.domain;

import com.tian.utils.HibernateUtil;
import org.hibernate.Session;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dllo on 17/11/2.
 */
public class DepartmentTest {

    @Test
    public void generateTable() {

        Session session = HibernateUtil.openSession();

        Department d1 = new Department("教学部");
        Department d2 = new Department("职规部");

        Post p1 = new Post("教学总监");
        Post p2 = new Post("教学主管");
        Post p3 = new Post("讲师");
        Post p4 = new Post("职规主管");
        Post p5 = new Post("职业规划师");

        p1.setDept(d1);
        p2.setDept(d1);
        p3.setDept(d1);
        p4.setDept(d2);
        p5.setDept(d2);

        Staff s1 = new Staff("孟宪义", "男", 32);
        s1.setPost(p1);
        s1.setDept(d1);

        Staff s2 = new Staff("大仁哥", "男", 22);
        s2.setPost(p2);
        s2.setDept(d1);

        Staff s3 = new Staff("刘明宇", "男", 18);
        s3.setPost(p2);
        s3.setDept(d1);

        Staff s4 = new Staff("玲姐", "女", 33);
        s4.setPost(p3);
        s4.setDept(d1);

        Staff s5 = new Staff("胖哥", "男", 19);
        s5.setPost(p3);
        s5.setDept(d1);

        Staff s6 = new Staff("马琳", "男", 29);
        s6.setPost(p4);
        s6.setDept(d2);

        Staff s7 = new Staff("欣姐", "女", 26);
        s7.setPost(p5);
        s7.setDept(d2);

        Staff s8 = new Staff("王派", "女", 28);
        s8.setPost(p5);
        s8.setDept(d2);

        session.save(s1);
        session.save(s2);
        session.save(s3);
        session.save(s4);
        session.save(s5);
        session.save(s6);
        session.save(s7);
        session.save(s8);


        HibernateUtil.commit();
    }



}