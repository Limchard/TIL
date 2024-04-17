public class CarOverloading
{
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    CarOverloading()
    {
    }

    CarOverloading(String model)
    {
        this.model = model;
    }

    CarOverloading(String model, String color)
    {
        this.model = model;
        this.color = color;
    }

    CarOverloading(String model, String color, int maxSpeed)
    {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
