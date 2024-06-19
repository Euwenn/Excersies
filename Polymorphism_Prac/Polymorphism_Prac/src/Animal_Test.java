public class Animal_Test
{
    /*
    Create an array of Animal objects that includes instances of Dog, Cat, and Cow.
    Use a loop to iterate through the array and call the makeSound() and superclassType() method on each Animal object.
     */


    public static void main(String[] args)
    {
        Dog dog1 = new Dog();
        Animal cat1 = new Cat();

        dog1.makeSound();
        cat1.makeSound();


        dog1.superclassType();
        cat1.superclassType();

        dog1.woof();
    }
}