package ch06.sec13.exam03.package2; // <- 패키지가 다름

import ch06.sec13.exam03.package1.A;

public class C
{
    public C()
    {
        A a = new A();

        //필드값 변경
        a.field1 = 3; // O
//        a.field2 = 3; // default 필드 접근 불가(컴파일 에러)
//        a.field3 = 3; // private 필드 접근 불가(컴파일 에러)

        // 메소드 호출
        a.method1(); // o
//        a.method2(); // default 메소드 접근 불가(컴파일 에러)
//        a.method3(); // private 메소드 접근 불가(컴파일 에러)

    }
}
