package me.ethan.first.thejava.refactoring;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)// 이렇게 해주면 계속 뽑힌다. (런타임 내내 유지함)
@Target({ElementType.TYPE, ElementType.FIELD})// 타입과 필드에만 어노테이션을 붙일 수 있음
@Inherited // 상속이 되는 어노테이션 (상속 받은 클래스에서도 어노테이션을 가져옴
public @interface MyAnnotation {

    String name() default "Ethan"; // 이름을 선언해줌

    int number() default 100;

    String value() default "value"; // value 로 값을 잡으면 그냥 쓰면 써진다. (value 값을 하나만 지정할 경우)
}
