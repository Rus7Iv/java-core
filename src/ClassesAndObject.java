public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Roman";
        person1.age = 13;
        System.out.println("Меня зовут "+person1.name+". Мне "+person1.age+" лет");

        Person person2 = new Person();
        person2.name = "Vladimir";
        person2.age = 20;
        System.out.println("Меня зовут "+person2.name+". Мне "+person2.age+" лет");
    }
}

class Person{
    //У класса могут быть
    //1. Данные (поля)
    //2. Действия, которые он может соыершать (методы)
    String name;
    int age;

}
