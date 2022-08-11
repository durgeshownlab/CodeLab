public class Dog
{
    String name;
    String breed;
    int age;
    String color;

    //constructer
    public Dog(String name, String breed, int age, String color)
    {
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.color=color;
    }

    //method1
    public String getName()
    {
        return name;
    }

    //method2
    public String getBreed()
    {
        return breed;
    }

    //method3
    public int getAge()
    {
        return age;
    }

    //method4
    public String getColor()
    {
        return color;
    }

    @Override
    public String toString()
    {
        return "Hii, My name is "+this.name+"\nBreed : "+this.breed+"\nAge : "+this.age+"\nColor : "+this.color;
    }

    public static void main(String[] args) {
        Dog d1=new Dog("Tomy", "GermanSuffr", 7, "Black");
        System.out.println(d1.toString());
        System.out.println(d1.getColor());
        System.out.println(d1.getAge());
    }
}