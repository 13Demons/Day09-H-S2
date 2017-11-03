package com.tian.service;

import com.tian.domain.Department;
import com.tian.domain.Post;
import com.tian.domain.Staff;

import java.util.List;

/**
 * Created by dllo on 17/11/2.
 */
public interface HomeService {


    /**
     * 查询所有的部门信息
     * @return
     */
    List<Department> getDepartments();


    /**
     * 根据部门id,查询所有对应职位
     * @param deptId
     * @return 职位的集合
     */
    List<Post> getPostByDeptId(int deptId);


    /**
     * 根据部门和职位的id,查询所有对应的员工
     * @param deptId 部门id
     * @param postId 职位id
     * @return 员工集合
     */
    List<Staff> getStaffByDeptIDAndPostId(int deptId, int postId);


    /**
     * 查询某个部门所有员工
     * @param deptId 部门id
     * @return
     */
    List<Staff> getStaffByDeptId(int deptId);


    /**
     * 查询所有员工
     * @return
     */
    List<Staff> getStaffs();


}
