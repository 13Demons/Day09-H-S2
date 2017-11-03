package com.tian.service.impl;

import com.tian.dao.HomeDao;
import com.tian.dao.impl.HomeDaoImpl;
import com.tian.domain.Department;
import com.tian.domain.Post;
import com.tian.domain.Staff;
import com.tian.service.HomeService;

import java.util.List;

/**
 * Created by dllo on 17/11/2.
 */
public class HomeServiceImpl implements HomeService{

    private HomeDao dao;

    public HomeServiceImpl(){
        dao = new HomeDaoImpl();
    }

    public List<Department> getDepartments() {
        return dao.getDepartments();
    }

    public List<Post> getPostByDeptId(int deptId) {
        return dao.getPostByDeptId(deptId);
    }

    public List<Staff> getStaffByDeptIDAndPostId(int deptId, int postId) {
        if (deptId<1){
            return getStaffs();
        }else if (postId<1){
            return getStaffByDeptId(deptId);
        }


        return dao.getStaffByDeptIDAndPostId(deptId,postId);
    }

    public List<Staff> getStaffByDeptId(int deptId) {
        if (deptId<1){
            return dao.getStaffs();
        }
        return dao.getStaffByDeptId(deptId);
    }

    public List<Staff> getStaffs() {
        return dao.getStaffs();
    }
}
