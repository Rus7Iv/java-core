public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Roman";
        person1.age = 13;
        person1.sayHello();
        person1.speak();

        Person person2 = new Person();
        person2.name = "Vladimir";
        person2.age = 20;
        person2.speak();
    }
}

class Person{
    //У класса могут быть
    //1. Данные (поля)
    //2. Действия, которые он может соыершать (методы)
    String name;
    int age;
    void speak(){
        for(int i = 0; i<3; i++) {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет");
        }
    }
    void sayHello(){
        System.out.println("Hello!");
    }
}
