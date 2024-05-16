/**
 * The Dog class represents a dog with a name and age.
 */
public class Dog {
    // The name of the dog
    private String name;
    // The age of the dog
    private int age;

    /**
     * Constructs a new Dog object with the given name and age.
     * @param name The name of the dog
     * @param age The age of the dog
     */
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Returns the name of the dog.
     * @return The name of the dog
     */
    public String getName() { return name; }

    /**
     * Sets the name of the dog.
     * @param name The new name of the dog
     */
    public void setName(String name) { this.name = name; }

    /**
     * Returns the age of the dog.
     * @return The age of the dog
     */
    public int getAge() { return age; }

    /**
     * Sets the age of the dog.
     * @param age The new age of the dog
     */
    public void setAge(int age) { this.age = age; }

    /**
     * Returns a string representation of the dog, including its name and age.
     * @return A string representation of the dog
     */
    @Override
    public String toString() {
        return name  + ": age = " + age;
    }
}
