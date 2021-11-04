import java.text.DecimalFormat;

public class Dog implements Comparable
{
    //1) Instance Var
    private String name;
    private int age;
    private String breed;
    private double pounds;
    private static int count;

    //2) Constructors
    public Dog(String name, int age, String breed, double pounds)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.pounds = pounds;
        count++;
    }//end full constructor

    public Dog()
    {
        name = "";
        age = 0;
        breed = "";
        pounds = 0.0;
        count++;
    }//end default constructor

    //4)Getters
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getBreed()
    {
        return breed;
    }
    public double getPounds()
    {
        return pounds;
    }
    public static int getCount()
    {
        return count;
    }

    //5)setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setBreed(String breed)
    {
        this.breed = breed;
    }
    public void setPounds(double pounds)
    {
        this.pounds = pounds;
    }

    //6) Brain Methods
    public String weightKg(double pounds)
    {
        double kg = pounds / 2.205;
        DecimalFormat fmt = new DecimalFormat("0.##");
        return fmt.format(kg);
    }

    //3) ToString
    public String toString()
    {
        String output = "Name: " + name +
                "\nAge: " + age +
                "\nBreed: " + breed +
                "\nPounds: " + pounds;
        return output;
    }

    @Override
    public int compareTo(Object dog)
    {
        int output = 0;
        if(this.age < ((Dog)dog).getAge())
        {
            output = -1;
        }
        else if(this.age > ((Dog)dog).getAge())
        {
            output = 1;
        }
        return output;
    }
}
