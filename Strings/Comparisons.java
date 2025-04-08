public class Comparisons {
    public static void main(String[] args) {
        String a  ="Himanshu";
        String b = "Himanshu";
        String c = a;
        System.out.println(c ==a);

       // System.out.println(a == b);

       // "==" checks both value and if the ref variable are pointing towrods the same object
       String name1= new String("Kunal");
       String name2 = new String("Kunal");
       //System.out.println(name1 ==name2);

       //".equals()" checks only value of the string

       System.out.println(name1.equals(name2));


       //"== " is a comparator and where as ".eqauls() is a method"





    }
}
