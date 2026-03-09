
public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String initialName, int initialAge, int initialHeight, int initialWeight) {
        this.name = initialName;
        this.age = initialAge;
        this.height = initialHeight;
        this.weight = initialWeight;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public boolean isOfLegalAge() {
        return (this.age > 18);
    }

    public String toString() {
        return this.name + ", age :" + this.age + " years" + "and my body index is " + this.bodyMassIndex() + "kgs";
    }

    public void growOlder() {
        this.age++;
    }

    public double bodyMassIndex() {
        return this.weight / (this.height * this.height);
    }

}
