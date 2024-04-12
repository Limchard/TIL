public class CarOverroding
{
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    CarOverroding()
    {
    }

    CarOverroding(String model)
    {
        this.model = model;
    }

    CarOverroding(String model, String color)
    {
        this.model = model;
        this.color = color;
    }

    CarOverroding(String model, String color, int maxSpeed)
    {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
