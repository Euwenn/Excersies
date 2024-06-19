public class Dog extends Animal{
    // Dog: Override the makeSound() method to print "Bark".

    @Override
    public void makeSound()
    {
        super.makeSound();
        System.out.println("Bark");
    }

    public void woof()
    {
        super.makeSound();
        System.out.println("Woof");
    }

}
