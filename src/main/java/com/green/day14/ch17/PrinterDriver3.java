package com.green.day14.ch17;
    /*
        class가 class를 상속받을 때 키워드 : extends
        interface가 interface를 상속받을 때 키워드 : extends
        calss가 interface를 상속받을 때 키워드 : implements
        interface는 calss를 상속받을 수 없다.
     */
public class PrinterDriver3 {
    public static void main(String[] args) {
        //자식타입이 부모객체 주소값 담은 경우
        //Prn204Drv가 상속을 어디까지 받았는지 확인하면 Printable까지 상속받았고
        //Printable은 ColorPrintable보다 부모타입이기 때문에 담을 수 없다.
        //ColorPrintable cp = (ColorPrintable)new Prn204Drv();
        //cp.printCMYK("ddd");
        //ColorPrintable cp = new Prn204Drv(); //cp는 printCMYK 메소드를 알고있지만 prn204Drv는 CMYK 메소드 내용을 모르므로
    }
}

interface ColorPrintable extends Printable {
    void printCMYK(String doc);
}

//Prn909Drv 객체의 주소값 담을 수 있는 타입
//Printable, Prn909Drv, ColorPrintable
//Prn909Drv 타입을 호출할 수 있는 메소드 : PrintCMYK,print
//ColorPrintable 타입으로 호출할 수 있는 메소드 : PrintCMYK, print
//Printable 타입으로 호출할 수 있는 메소드 : print

class Prn909Drv implements ColorPrintable {

    @Override
    public void printCMYK(String doc) {
        System.out.println("From MD-909 CMYK ver");
        System.out.println(doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("From MD-090 black & white ver");

    }
}

//빛의 3원소(RGB) - Red, Green, Blue
//CMYK : 인쇄를 위한 색상 모드

//이미지표현방식 : 비트맵방식, 벡터방식