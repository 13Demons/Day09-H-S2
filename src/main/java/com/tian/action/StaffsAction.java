package com.tian.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tian.domain.Staff;
import com.tian.service.HomeService;
import com.tian.service.impl.HomeServiceImpl;

import java.util.List;

/**
 * Created by dllo on 17/11/3.
 */
public class StaffsAction extends ActionSupport {

    //接收表单传递过来的数据
    private int deptId;
    private int postId;

    private HomeService homeService;
    private List<Staff> staffs;

    public StaffsAction() {
        homeService = new HomeServiceImpl();
    }

    public String staffs(){
        //查询所有结果
        staffs = homeService.getStaffByDeptIDAndPostId(deptId, postId);
        return SUCCESS;

    }

    public String staffsJson(){
        //查询所有结果
        staffs = homeService.getStaffByDeptIDAndPostId(deptId, postId);
        return SUCCESS;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public List<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(List<Staff> staffs) {
        this.staffs = staffs;
    }
}
