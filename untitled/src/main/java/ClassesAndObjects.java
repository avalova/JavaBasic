public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Jack";
        person1.age = 23;
        person1.speak();

        Person person2 = new Person();
        person2.name = "Jason";
        person2.age = 43;
        person2.sayHello();
    }
}

class Person{
    String name;
    int age;

    void speak(){
        System.out.println("My name is "+name+","+" I am "+age+" years old");
    }
    void sayHello(){
        System.out.println("Hello");
    }
}