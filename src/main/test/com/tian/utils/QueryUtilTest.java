package com.tian.utils;

import com.tian.domain.Department;
import com.tian.domain.Post;
import com.tian.domain.Staff;
import org.junit.Test;

import java.util.List;

/**
 * Created by dllo on 17/11/2.
 */
public class QueryUtilTest {
    @Test
    public void queryTest(){
        System.out.println(QueryUtil.findAll(Department.class));
        System.out.println(QueryUtil.findAll(Post.class));
        System.out.println(QueryUtil.findAll(Staff.class));
    }

    @Test
    public void queryTest2(){
        //查询部门id为1的所有员工
        List<Staff> list1 = QueryUtil.queryByEqual(Staff.class, "dept", 1);
        System.out.println(list1);
        List<Staff> list2 = QueryUtil.queryByEqual(Staff.class, "gender", "女");
        System.out.println(list2);
    }

    @Test
    public void queryTest3(){
        //多条件查询
        //忍术中所有男性忍者
        String[]fields = {"dept","gender"};
        Object[]values = {1,"女"};

        List<Staff> staffs = QueryUtil.queryByEquals(Staff.class, fields, values);
        System.out.println(staffs);

    }

}