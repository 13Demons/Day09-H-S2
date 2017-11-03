package com.tian.action;

import com.tian.domain.Staff;
import com.tian.service.HomeService;
import com.tian.service.impl.HomeServiceImpl;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by dllo on 17/11/3.
 */
public class StaffsActionTest {

    @Test
    public void testQuery(){
        HomeService service = new HomeServiceImpl();
        List<Staff> staffs = service.getStaffByDeptIDAndPostId(1, 3);
        for (Staff staff : staffs) {
            System.out.println(staff.getDept().getName());
            System.out.println(staff.getPost().getName());
        }
    }

}