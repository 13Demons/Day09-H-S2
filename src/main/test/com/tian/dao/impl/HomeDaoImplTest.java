package com.tian.dao.impl;

import com.tian.dao.HomeDao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dllo on 17/11/2.
 */
public class HomeDaoImplTest {

    private HomeDao dao;

    @Before
    public void setUp() throws Exception {
        dao = new HomeDaoImpl();
    }

    @Test
    public void getDepartments() throws Exception {
        Assert.assertEquals(dao.getDepartments().size(),3);
    }

    @Test
    public void getPostByDeptId() throws Exception {
        Assert.assertEquals(dao.getPostByDeptId(1).size(),3);
    }

    @Test
    public void getStaffByDeptIDAndPostId() throws Exception {
        Assert.assertEquals(dao.getStaffByDeptIDAndPostId(1,1).size(),2);
    }

    @Test
    public void getStaffByDeptId() throws Exception {
        Assert.assertEquals(dao.getStaffByDeptId(1).size(),5);
    }

    @Test
    public void getStaffs() throws Exception {
        Assert.assertEquals(dao.getStaffs().size(),8);
    }


}