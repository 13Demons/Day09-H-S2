package com.tian.dao.impl;

import com.tian.dao.HomeDao;
import com.tian.domain.Department;
import com.tian.domain.Post;
import com.tian.domain.Staff;
import com.tian.utils.QueryUtil;

import java.util.List;

/**
 * Created by dllo on 17/11/2.
 */
public class HomeDaoImpl implements HomeDao {

    public List<Department> getDepartments() {
        return QueryUtil.findAll(Department.class);
    }

    public List<Post> getPostByDeptId(int deptId) {
        return QueryUtil.queryByEqual(Post.class,"dept",deptId);
    }

    public List<Staff> getStaffByDeptIDAndPostId(int deptId, int postId) {
        String [] fields = {"dept","post"};
        Object [] values = {deptId,postId};

        return QueryUtil.queryByEquals(Staff.class,fields,values);
    }

    public List<Staff> getStaffByDeptId(int deptId) {
        return QueryUtil.queryByEqual(Staff.class,"dept",deptId);
    }

    public List<Staff> getStaffs() {
        return QueryUtil.findAll(Staff.class);
    }
}
