package me.ethan.thejava;

public class Moim {

    int maxNumberOfAttendees; // 최대 등록 가능한 참여자수
    int numberOfEnrollment; // 실제 등록 수

    public boolean isEnrollmentFull(){
        if(maxNumberOfAttendees == 0){
            return false;
        }

        if(numberOfEnrollment < maxNumberOfAttendees){
            return false;
        }
        return  true;
    }
}
