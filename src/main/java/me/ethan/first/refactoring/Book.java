package me.ethan.first.refactoring;

@MyAnnotation(name = "hello" , number = 23)
public class Book {

    @MyAnnotation private String a = "a";
    private static final String B = "Book";
    private static final String C = "Book";
    public String d = "d"; // 메인에서 d 만 출력되는 이유?
    protected String e = "e";


    @AnotherAnnotation
    public Book(String a, String d, String e) {
        this.a = a;
        this.d = d;
        this.e = e;
    }

    @AnotherAnnotation
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
