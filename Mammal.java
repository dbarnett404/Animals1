/**
 * The Mammal class represents a mammal with a name and age.
 */
public class Mammal {
    // The name of the mammal
    private String name;
    // The age of the mammal
    private int age;

    /**
     * Constructs a new Mammal object with the given name and age.
     * @param name The name of the mammal
     * @param age The age of the mammal
     */
    public Mammal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Returns the name of the mammal.
     * @return The name of the mammal
     */
    public String getName() { return name; }

    /**
     * Sets the name of the mammal.
     * @param name The new name of the mammal
     */
    public void setName(String name) { this.name = name; }

    /**
     * Returns the age of the mammal.
     * @return The age of the mammal
     */
    public int getAge() { return age; }

    /**
     * Sets the age of the mammal.
     * @param age The new age of the mammal
     */
    public void setAge(int age) { this.age = age; }

    /**
     * Returns a string representation of the mammal, including its name and age.
     * @return A string representation of the mammal
     */
    @Override
    public String toString() {
        return name  + ": age = " + age;
    }
}
