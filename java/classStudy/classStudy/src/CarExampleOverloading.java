public class CarExampleOverloading
{
    public static void main(String[] args)
    {
        CarOverloading carOverroding = new CarOverloading();
        System.out.println("carOverroding.company :" + carOverroding.company);
        System.out.println();

        CarOverloading car2=new CarOverloading("자가용");
        System.out.println(car2.company);
        System.out.println(car2.model);
        System.out.println();

        CarOverloading car3=new CarOverloading("자가용", "빨강");
        System.out.println(car3.company);
        System.out.println(car3.model);
        System.out.println(car3.color);
        System.out.println();

        CarOverloading car4=new CarOverloading("자가용", "파랑", 200);
        System.out.println(car4.company);
        System.out.println(car4.model);
        System.out.println(car4.color);
        System.out.println(car4.maxSpeed);
    }
}
