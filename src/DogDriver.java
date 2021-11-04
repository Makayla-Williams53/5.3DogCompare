public class DogDriver
{
    public static void main(String[] args)
    {
        //Instantiate
        Dog Fang = new Dog("Fang", 5, "Husky", 80);
        Dog Piper = new Dog("Piper", 3, "Australian Shepherd", 45);
        Dog Jimmy = new Dog("Jimmy", 2, "Golden Retriever", 65);

        //Getters for Fang
        System.out.println("Fang's breed: " + Fang.getBreed() +
                            "\nFang's age: " + Fang.getAge());

        //getters for Piper
        System.out.println("\nPiper's Weight in pounds: " + Piper.getPounds() + " pounds" +
                            "\nPiper's Weight in kilograms: " + Piper.weightKg(Piper.getPounds()) + " kilograms");

        //To string for Jimmy
        System.out.println("\n" + Jimmy.toString());

        //Number of dogs
        System.out.println("\nNumber of Dogs: " + Dog.getCount());

        //compare Piper to Jimmy
        if(Piper.compareTo(Fang) == 0)
        {
            System.out.println("\n" + Piper.getName() + " is the same age as " + Fang.getName());
        }
        else if(Piper.compareTo(Fang) > 0)
        {
            System.out.println("\n" + Piper.getName() + " is older than " + Fang.getName());
        }
        else
        {
            System.out.println("\n" + Piper.getName() + " is younger than " + Fang.getName());
        }

        //Compare Fang to Jimmy
        if(Fang.compareTo(Jimmy) == 0)
        {
            System.out.println("\n" + Fang.getName() + " is the same age as " + Jimmy.getName());
        }
        else if(Fang.compareTo(Jimmy) > 0)
        {
            System.out.println("\n" + Fang.getName() + " is older than " + Jimmy.getName());
        }
        else
        {
            System.out.println("\n" + Fang.getName() + " is younger than " + Jimmy.getName());
        }

    }//end main method
}//end dogDriver class
