public class Lesson19 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(18);
        human1.setName("Tom");
        human1.getInfo();

        Human human2 = new Human();
        human2.setAge(20);
        human2.setName("Bob");
        human2.getInfo();
    }
}
class Human{
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void getInfo(){
        System.out.println(name+", "+age);
    }
}
