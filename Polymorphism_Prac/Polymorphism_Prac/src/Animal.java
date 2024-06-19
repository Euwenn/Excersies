public class Animal
{
    /*
    Create a simple animal hierarchy to demonstrate the use of inheritance and polymorphism.

    Instructions:
    //Create a superclass called Animal:

    //Define a method makeSound() that prints a generic message like "Some generic animal sound".
    //Define a method superclassType() that prints "I am an animal"
    Create three subclasses:

    //Dog: Override the makeSound() method to print "Bark".
    //Cat: Override the makeSound() method to print "Meow".
    Create a test class called AnimalTest with a main method:

    Create an array of Animal objects that includes instances of Dog, Cat, and Cow.
    Use a loop to iterate through the array and call the makeSound() and superclassType() method on each Animal object.
     */

    public void makeSound()
    {
        System.out.println("Some generic animal sound");
    }

    public void superclassType()
    {
        System.out.println("I am an animal");
    }

}
