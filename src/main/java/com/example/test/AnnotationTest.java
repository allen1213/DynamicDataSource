package com.example.test;

import com.example.service.impl.SwitchToTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class AnnotationTest {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testAnnotation() {
        new SwitchToTest().testDBKey();
    }

}
