package com.green.day27.ioc;

import com.green.day27.*;

import java.lang.reflect.TypeVariable;

public class TvFactory {
    //SingleTon 패턴, 싱글톤 패턴
    //객체는 딱 하나만 만들어서 돌려쓴다.
    private static TvFactory tvFactory;

    public static TvFactory getInstance() { //static이라서 한곳밖에없으므로 null값이 들어갈수가없다.
        if(tvFactory == null) {
            tvFactory = new TvFactory();
        }
        return tvFactory;
    }
    private TvFactory() {} //private을 붙여서 외부에서 더이상 객체화 할 수 없게 만들었다.

    public Tv factory(String tvName, String speakerName, String wooferName) {
        Woofer woofer = switch(wooferName) {
            case "hanil" -> new HanilWoofer();
            case "marten" -> new MartenWoofer();
            default -> null;
        };

        Speaker speaker = switch (speakerName) {
            case "bose" -> new BoseSpeaker(woofer);
            case "genelec" -> new GenelecSpeaker(woofer);
            default -> null;
        };

        return switch(tvName) {
            case "lg" -> new LgTv(speaker);
            default -> null;
        };
    }
}

