package me.ethan.second.fromjava8;

/*
// 디폴트 메서드, 스테틱 메서드를 함께 정의를 해두어도, 추상 메서드는 하나이므로 함수형 인터페이스가 맞다.
public interface RunSomething {

    void doIt(); // 추상 메서드가 하나만 있어야 함

    //void doItAgain();

    static void printName(){  // 스테틱 메서드 정의
        System.out.println("Ethan");
    }

    default void printAge(){ // 디폴트 메서드
        System.out.println("31");
    }
}
*/


@FunctionalInterface
public interface RunSomething {
    void doIt();
    // 자바에서 순수하게 함수형 프로그래밍을 사용하기 위해선, 항상 같은 파라미터가 들어갈 때 같은 값이 나와야함 (메서드 외부 값을 참조하면 안된다. - 상태값이 있으면 안된다.)
}