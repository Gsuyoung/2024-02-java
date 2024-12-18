package com.green.day15.ch18; //package명은 대문자를 잘 사용하지않는다.

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
//마지막 .class명 (대문자로 시작, 마지막에 적혀있다)

//p.402 예제
public class IOExceptionCase3 {
    public static void main(String[] args) {
        try {
            md1();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("-- 끝 --");
    }
    public static void md1() throws IOException {
        md2();
    }

    public static void md2() throws IOException {
        Path path = Paths.get("D:/Simple.txt"); //절대경로 (full 경로)
        BufferedWriter writer = Files.newBufferedWriter(path);
        //1. newBufferedWriter는 멤버필드, 메소드인가? 메소드
        //2. static 메소드
        //3. 리턴메소드 - 리턴타입은? BufferedWriter
        //4. 파라미터 타입은 Path이다.
        //5. throws 메소드이다.
        writer.write('A');
        writer.write("반갑다");
        writer.close();
    }
}
