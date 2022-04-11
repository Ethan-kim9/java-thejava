package me.ethan.second.fromjava8;

public class Foo {
    public static void main(String[] args) {

        // 익명 내부 클래스 (자바 8 이전에 사용하던 방법)
//        RunSomething runSomething = new RunSomething() {
//            @Override
//            public void doIt() {
//                System.out.println("Hello");
//            }
//        };

        // 람다 표현식
        RunSomething runSomething = () -> {
            System.out.println("Hello");
            System.out.println("Lambda");
        };


        runSomething.doIt();
    }
}
