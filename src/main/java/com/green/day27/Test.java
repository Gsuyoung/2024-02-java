package com.green.day27;

import com.green.day27.noneioc.HarmanSpeaker;
import com.green.day27.noneioc.SamsungTv;

public class Test {
    public static void main(String[] args) {
        HarmanSpeaker hs = new HarmanSpeaker();
        hs.speakerSound();

        //Harman Speaker : 소리가 웅장하다.
        //Hanil Woofer : 웅!! 웅!! 웅!!

        System.out.println("-------------------------");

        Tv tv = new SamsungTv();
        tv.sound();

        /*
        Samsung Tv : 소ꈰ가 난다.
        JBL Speaker : 소리가 깔끔하다.
        Marten Woofer: 웅~ 웅~ 웅~
        */
    }
}
