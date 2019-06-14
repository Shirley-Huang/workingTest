package com.own.test.annotation;

import org.junit.Test;

public class AuditTest {

    @Audit(actionType = "操作类型", actionCategoryCode = "order Info", actionCategoryName = "工单信息")
    public void testAudit(){
        System.out.println("to use audit annotation");
    }

    @Test
    public void testMain(){
        testAudit();
    }


}
