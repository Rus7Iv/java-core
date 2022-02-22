public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Roman";
        person1.age = 13;
        //person1.sayHello();
        //person1.speak();

        Person person2 = new Person();
        person2.name = "Vladimir";
        person2.age = 20;
       //person2.speak();

        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();

        System.out.println("Количество лет до пенсии первому человеку - "+year1);
        System.out.println("Количество лет до пенсии второму человеку - "+year2);
    }
}

class Person{
    //У класса могут быть
    //1. Данные (поля)
    //2. Действия, которые он может соыершать (методы)
    String name;
    int age;
    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
        //System.out.println("Количество лет до пенсии - "+years);
    }

    void speak(){
        for(int i = 0; i<3; i++) {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет");
        }
    }
    void sayHello(){
        System.out.println("Hello!");
    }
}
