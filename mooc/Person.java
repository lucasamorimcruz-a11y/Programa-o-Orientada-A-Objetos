package udesc.poo.mooc;

public class Person {
    private String name;
    private int age;

    public Person (String initialName, int initialAge){
        this.name = initialName;
        this.age = initialAge;
    }
    public void printPerson(){
        System.out.println(this.name + " has the age of : " + this.age + " years old ");
    }
}
