package variableLength;

public class ComputerExample
{
    public static void main(String[] args)
    {
        Computer myCom = new Computer();

        int result1 = myCom.sum(1, 2, 3);
        System.out.println(result1);

        int result2=myCom.sum(1,2,34,5);
        System.out.println(result2);

        int [] values={1,2,3,4,5,6,7,8,9,10};
        int result3=myCom.sum(values);
        System.out.println(result3);

        int result4=myCom.sum(new int [] {1,2,3,4,5,6});
        System.out.println(result4);
    }
}
