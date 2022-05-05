package me.ethan;

public class StringTest {
    public static void main(String[] args) {
        String a ="/imom/01/board/boardView.do";
        if(a.contains("boardView.do")){
            System.out.println("Bang!");
        }

        String[] split = a.split("/");
        System.out.println(split[2]);
    }
}
