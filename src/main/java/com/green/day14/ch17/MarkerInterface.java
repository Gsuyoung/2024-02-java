package com.green.day14.ch17;

public class MarkerInterface {
    public static void main(String[] args) {
        Report0 report0 = new Report0("Simple Funny News~");
        Report1 report1 = new Report1();
        Report2 report2 = new Report2();
        Report3 report3 = new Report3();

        //Printer 클래스 아래에 있는 printContents메소드 호출하고 싶어요.
        //호출할 때 report0의 주소값을 보내주세요.
        Printer printer = new Printer();
        printer.printContents(report0);
        printer.printContents(report1);
        printer.printContents(report2);
        printer.printContents(report3);
    }
}

interface Printable2 { //클래스를 상속받을 수 없기 때문에 Object를 상속받을 수 없다.
    //(public abstract)
    String getContents();
}
interface Upper {}
interface Lower {}

class Report0 extends Object implements Printable2 {
    private String contents;
    Report0(String contents) {
        this.contents = contents;
    }

    @Override
    public String getContents() {
        return contents;
    }
}

class Report1 implements Printable2, Lower {
    public String getContents() {
        return "Simple Funny News~";
    }
}

class Report2 implements Printable2, Upper {
    public String getContents() {
        return "Simple Funny News~";
    }
}

class Report3 implements Printable2, Upper, Lower {
    public String getContents() {
        return "Simple Funny News~";
    }
}

class Printer {
    public void printContents(Printable2 doc) {
        if(doc instanceof Upper) { //doc가 Upper로 형변환이 된다면
            System.out.println(doc.getContents().toUpperCase()); //doc로 들어오는 값들 중 대문자로 표현
        } else if(doc instanceof Lower) {
            //아래 두 줄은 66번라인과 같은 의미이다.
            /* String str = doc.getContents();
            System.out.println(str.toLowerCase());*/
            System.out.println(doc.getContents().toLowerCase());
        } else {
            System.out.println(doc.getContents());
        }
    }
}