package instanceMember;

public class CarExample
{
    public static void main(String[] args)
    {
        Car myCar = new Car("뽀르쉬~");
        Car yourCar = new Car("벤쓰");

        myCar.run();
        yourCar.run();
    }
}
