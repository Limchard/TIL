package ch07.sec03.exam02;

public class SmartPhone extends Phone
{
    // 자식 생성자 선언
    public SmartPhone(String model, String color)
    {
        super(model, color); // 반드시 작성해야 함, 부모 생성자에 매개변수가 있으면.. 자식은 무조건 생성자를 호출해야 한다.
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }
    
}
