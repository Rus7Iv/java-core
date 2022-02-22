public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("какое-то имя");
        person1.setAge(13);
        System.out.println("Выводим значения в main-методе: "+person1.getName());
        System.out.println("Выводим значения в main-методе: "+person1.getAge());
    }
}

class Person{
    private String name;
    private int age;

    public void setName(String username) {
        if(username.isEmpty()){
            System.out.println("Ошибка! Ты ввёл пустое имя");
        } else {
            name = username;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userage) {
        if(userage<0){
            System.out.println("Ошибка! Возраст не может быть меньше 0");
        }else {
            age = userage;
        }
    }

    public int getAge() {
        return age;
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
