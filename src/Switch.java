import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int age = scanner.nextInt();
        switch (age){
            case 0:
                System.out.println("Ты родился");
                break;
            case 7:
                System.out.println("Ты пошёл в школу");
                break;
            case 18:
                System.out.println("Ты закончил школу");
            default:
                System.out.println("Ни одно из предыдущих условий не подошло");
        }

        System.out.println("Введите возраст буквами: \n");
        String ageStr = scanner.next();
        switch (ageStr){
            case "ноль":
                System.out.println("Ты родился");
                break;
            case "семь":
                System.out.println("Ты пошёл в школу");
                break;
            case "восемнадцать":
                System.out.println("Ты закончил школу");
            default:
                System.out.println("Ни одно из предыдущих условий не подошло");
        }
    }
}
