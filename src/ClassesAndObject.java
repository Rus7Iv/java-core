public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Roman", 13);

        String s1 = "Vladimir";
        Person person2 = new Person();
        person2.setNameAndAge(s1, 20);

        person1.speak();
        person2.speak();
    }
}

class Person{
    //У класса могут быть
    //1. Данные (поля)
    //2. Действия, которые он может соыершать (методы)
    String name;
    int age;

    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }

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
