package me.ethan.first.refactoring;

public class Book {
    private String a = "a";
    private static final String B = "Book";
    private static final String C = "Book";
    public String d = "d"; // 메인에서 d 만 출력되는 이유?
    protected String e = "e";

    public Book(String a, String d, String e) {
        this.a = a;
        this.d = d;
        this.e = e;
    }

    public Book() {

    }

    private void f(){
        System.out.println("F");
    }

    public void g(){
        System.out.println("g");
    }

    public int h(){
        return 100;
    }
}
