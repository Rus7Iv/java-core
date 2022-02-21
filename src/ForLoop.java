public class ForLoop {
    public static void main(String[] args){
        for(int i = 0; i<=10;i+=5){
            System.out.println("Hello "+i);    //i++ == i=i+1 (true)
        }
        for(int i = 10; i>=0;i-=5){
            System.out.println("Bye "+i);
        }
    }
}
