package com.tian.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dllo on 17/11/2.
 */
//部门
public class Department {
    private int id;
    private String name;
    //部门里有很多职位
    private Set<Post> posts = new HashSet<Post>();
    //部门里面有很多员工
    private Set<Staff>staffs=new HashSet<Staff>();

    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    public Department(int id, String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

    public Set<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(Set<Staff> staffs) {
        this.staffs = staffs;
    }
}
