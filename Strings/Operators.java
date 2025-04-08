import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');//195 --> The Operator is converting into its integer value.
        System.out.println("a" + "b");//Concatanation
        System.out.println(('a' + 3));//'a'+3 wiil we converted into its integer value but you can convert that integer into a character by type casting. it will 'a' + 3 = 100 the value of 100 to character is 'd'
        System.out.println((char)('a' + 3));

        //When an integer is concatanated with a string it is converted to Integer that will call toString();


        //But when you add string value and integer? Integer will be converted intto wrapper class than it will call .toString();
        System.out.println("s"+ 1);//"s1"

        System.out.println("Kunal"+ new ArrayList<>());
        System.out.println("Kunal"+ new int[]{2, 3, 4});
        // System.out.println("Kunal"+ new Integer(56)); ---> kunal56

    //The '+' will be concatanate complex data type only if  one of the datatype is String
        String ans = new Integer(56)+ "" + new ArrayList<>();
        System.out.println(ans);
    }
}
