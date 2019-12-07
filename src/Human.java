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
        return name + lastName + age + height + weight;
    }
}
