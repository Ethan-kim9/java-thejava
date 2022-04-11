package me.ethan.thejava;

import me.ethan.first.thejava.Moim;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class MoimTest {
    // 테스트 커버리지 - 나의 테스트 코드가 위 코드를 얼마나
    @Test
    public void isFull(){
        Moim moim = new Moim();
        moim.maxNumberOfAttendees=100;
        moim.numberOfEnrollment=10;
        assertFalse(moim.isEnrollmentFull());
    }
}