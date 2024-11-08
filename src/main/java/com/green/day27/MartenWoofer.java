package com.green.day27;

import com.green.day01.ch01.SystemOutPrintLn;

public class MartenWoofer implements Woofer{

    @Override
    public void baseSound() {
        System.out.println("Marten Woofer: 웅~ 웅~ 웅~");
    }
}
