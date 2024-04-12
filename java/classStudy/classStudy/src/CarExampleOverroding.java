public class CarExampleOverroding
{
    public static void main(String[] args)
    {
        CarOverroding carOverroding = new CarOverroding();
        System.out.println("carOverroding.company :" + carOverroding.company);
        System.out.println();

        CarOverroding car2=new CarOverroding("자가용");
        System.out.println(car2.company);
        System.out.println(car2.model);
        System.out.println();

        CarOverroding car3=new CarOverroding("자가용","빨강");
        System.out.println(car3.company);
        System.out.println(car3.model);
        System.out.println(car3.color);
        System.out.println();

        CarOverroding car4=new CarOverroding("자가용","파랑",200);
        System.out.println(car4.company);
        System.out.println(car4.model);
        System.out.println(car4.color);
        System.out.println(car4.maxSpeed);
    }
}
