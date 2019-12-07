/**
 * ... comment class...
 *
 * @author tomekpl77@gmail.com
 * @since 07.12.2019
 */
final class Human {
    int age;
    int weight;
    int height;
    String name;
    String lastName;

    public Human(int age, int weight, int height, String name, String lastName) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.lastName = lastName;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + lastName + " " + "Age: " + age + ", Heigh: " + height + " ,Weigh: " + weight;
    }
}
