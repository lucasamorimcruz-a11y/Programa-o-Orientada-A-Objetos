package udesc.poo.aula_pratica2;

import java.util.Arrays;
import java.util.Comparator;

public class exercicio1 {
    
    class Person {
        private String name;
        private int age;
        private double height;
        private double weight;

        public String getName(){
            return this.name;
        }
        public int getAge(){
            return this.age;
        }
        public double getHeight(){
            return this.height;
        }
        public double getWeight(){
            return this.weight;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public void setHeight(double height){
            this.height = height;
        }
        public void setWeight(double weight){
            this.weight = weight;
        }

        public double calculateIMC() {
            double IMC = this.weight / (this.height * this.height);
            return IMC;
        }
    }

    class GroupOfPeople {
        Person[] groupOfPeople = new Person[10];

        public void sort() {
            Arrays.sort(groupOfPeople, new Comparator<Person>() {
                public int compare(Person p1, Person p2) {
                    return Double.compare(p2.calculateIMC(), p1.calculateIMC());
                }
            });
        }

        public void printOrder() {
            sort();
            for (int i = 0; i < 10; i++) {
                if (groupOfPeople[i] != null){
                    System.out.println(groupOfPeople[i].name);
                    System.out.println(groupOfPeople[i].age);
                    System.out.println(groupOfPeople[i].height);
                    System.out.println(groupOfPeople[i].weight);
                }
            }
        }
    }

    public static void main(String[] args) {
    }

}
