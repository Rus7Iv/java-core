public class Arrays_of_String {
    public static void main(String[] args){
        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "Java";
        strings[2] = "World";

        for(String string:strings){
            System.out.println(string);
        }

        int[] numbers = {1,2,3};
        int sum = 0;
        for(int x: numbers){
            sum +=x;
        }
        System.out.println(sum);

        int value = 0;
        String s = null;
        System.out.println(s);
    }
}
