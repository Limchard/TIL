package ch06.sec13.exam01.package2; // <- 다른 패키지

import ch06.sec13.exam01.package1.*;
public class C
{
    // 필드 선언
//    A a; // <- A 클래스 접근 불가(컴파일 에러)
    B b; // <- public 이라서 B는 가능함
}
