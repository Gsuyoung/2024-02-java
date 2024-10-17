package com.green.day07.ch11;

public class MissionExt {
    public static void main(String[] args) {
        String fileNm = "nice_V.ery.Nice.jpg";
        //.의위치를 리터럴 사용 금지
        //fileNm에서 jpg문자열을 뽑아내주세요.

        //String ext = fileNm.substring(fileNm.indexOf("j"),fileNm.lastIndexOf(""));

        String ext = fileNm.substring(fileNm.lastIndexOf(".") + 1);


        System.out.println(ext); //jpg
    }
}
