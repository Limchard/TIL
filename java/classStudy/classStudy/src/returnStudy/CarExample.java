package returnStudy;

public class CarExample
{
    public static void main(String[] args)
    {
        // 객체 생성
        Car myCar=new Car();

        // return 값이 없는 setGas() 호출
        myCar.setGas(7);

        // isLeftGas() 메소드를 호출해서 받은 리턴값이 true일 경우 if 블록 실행
        if (myCar.isLeftGas())
        {
            System.out.println("출발합니다.");
            myCar.run();
        }
        System.out.println("gas를 주입해주세요.");
    }
}
