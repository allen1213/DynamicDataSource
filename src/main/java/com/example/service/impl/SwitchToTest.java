package com.example.service.impl;

import com.example.annotation.SwitchTo;
import org.springframework.stereotype.Service;

@Service
public class SwitchToTest {

    @SwitchTo(dbKey = "dataSource")
    public void testDBKey() {
        System.out.println("testDBKey : " );
    }

}
