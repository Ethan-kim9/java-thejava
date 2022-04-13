package me.ethan.first.refactoring;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Book> bookClass = Book.class;

        Book book = new Book();
        Class<? extends Book> aClass = book.getClass();

        Class<?> aClass1 = Class.forName("me.ethan.first.refactoring.Book");

    //    Arrays.stream(bookClass.getFields()).forEach(System.out::println); // d 만 출력됨 -getFields 는 public 한 것들만 출력해줌
    //    Arrays.stream(bookClass.getDeclaredFields()).forEach(System.out::println); // 모든 필드가 다 출력됨


//        Arrays.stream(bookClass.getDeclaredFields()).forEach(f -> {
//            try {
//                f.setAccessible(true); // 모두에 접근할 수 있게 하는 방법
//                System.out.printf("%s %s \n", f,f.get(book)); // 필드의 값을 가져오라고 할 때, 접근이 불가능한 필드가 있어서 오류가 난다.
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }

//        });
//            Arrays.stream(bookClass.getMethods()).forEach(System.out::println); // d 만 출력됨 -getFields 는 public 한 것들만 출력해줌

        Arrays.stream(Book.class.getAnnotations()).forEach(System.out::println); // 바로 뽑아냈을 때는 아무것도 출력이 안됨
        Arrays.stream(MyBook.class.getAnnotations()).forEach(System.out::println); // 바로 뽑아냈을 때는 아무것도 출력이 안됨

        System.out.println("--------------------------------");
        Arrays.stream(Book.class.getDeclaredFields()).forEach(f-> {
            Arrays.stream(f.getAnnotations()).forEach(System.out::println);
        });

        System.out.println("--------------------------------");
        Arrays.stream(Book.class.getDeclaredFields()).forEach(f-> {
            Arrays.stream(f.getAnnotations()).forEach(a -> {
                if(a instanceof MyAnnotation){
                    MyAnnotation myAnnotation = (MyAnnotation) a;
                    System.out.println("myAnnotation.value() = " + myAnnotation.value());
                    System.out.println("myAnnotation.name() = " + myAnnotation.name());
                }
            });
        });

    }

    // 리플렉션이 제공하는 여러 기능들로, 클래스의 정보를 조회하고 순회할 수 있다.
}
