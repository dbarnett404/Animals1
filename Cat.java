/**
 * The Cat class represents a cat with a name and age.
 */
public class Cat {
    // The name of the cat
    private String name;
    // The age of the cat
    private int age;

    /**
     * Constructs a new Cat object with the given name and age.
     * @param name The name of the cat
     * @param age The age of the cat
     */
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Returns the name of the cat.
     * @return The name of the cat
     */
    public String getName() { return name; }

    /**
     * Sets the name of the cat.
     * @param name The new name of the cat
     */
    public void setName(String name) { this.name = name; }

    /**
     * Returns the age of the cat.
     * @return The age of the cat
     */
    public int getAge() { return age; }

    /**
     * Sets the age of the cat.
     * @param age The new age of the cat
     */
    public void setAge(int age) { this.age = age; }

    /**
     * Returns a string representation of the cat, including its name and age.
     * @return A string representation of the cat
     */
    @Override
    public String toString() {
        return name  + ": age = " + age;
    }
}
