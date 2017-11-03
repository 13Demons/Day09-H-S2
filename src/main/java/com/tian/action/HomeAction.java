package com.tian.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tian.domain.Department;
import com.tian.domain.Post;
import com.tian.domain.Staff;
import com.tian.service.HomeService;
import com.tian.service.impl.HomeServiceImpl;
import org.apache.struts2.ServletActionContext;

import java.util.List;

/**
 * Created by dllo on 17/11/2.
 */
public class HomeAction extends ActionSupport {


    private HomeService service;
    //用来接收jsp传递过来的部门id
    private int deptId;
    private List<Department> departments;
    private List<Post> posts;
    private List<Staff> staffs;

    public HomeAction() {
        service = new HomeServiceImpl();
    }

    public String home(){

        //获取所有部门信息
        departments = service.getDepartments();
        return SUCCESS;

    }


    public String getPostByDeptId(){
        //根据部门id获取对应的职位
        posts = service.getPostByDeptId(deptId);
        return SUCCESS;

    }



    public String getStaffByDeptIdAndPostID(){

        String[] s1 = ServletActionContext.getRequest().getParameterValues("s1");
        int deptId1 = Integer.parseInt(s1[0]);
        String[] s2 = ServletActionContext.getRequest().getParameterValues("s2");
        int postId1 = Integer.parseInt(s2[0]);
        if (deptId1 == -1){
            staffs = service.getStaffs();
        }else if (postId1 == -1){
            staffs = service.getStaffByDeptId(deptId1);
        }else {
            staffs = service.getStaffByDeptIDAndPostId(deptId1, postId1);
        }
        return SUCCESS;

    }





    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(List<Staff> staffs) {
        this.staffs = staffs;
    }
}
