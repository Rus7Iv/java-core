public class Lesson20 {
    public static void main(String[] args) {
        HumanLes20 human1 = new HumanLes20("Vlad", 13);

    }
}
class HumanLes20 {
    private String name;
    private int age;

    public HumanLes20(){
        this.name = "Какое-то имя";
        this.age = 1;
    }
    public HumanLes20(String name){
        System.out.println("Привет из 2-ого конструтора");
        this.name = name;
    }
    public HumanLes20(String name, int age){
        System.out.println("Привет из 3-его конструктора");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}