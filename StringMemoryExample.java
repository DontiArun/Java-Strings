public class StringMemoryExample{

    public static void main(String[] args) {
        
        String s1="hello";
        String s2="hello";
        String s3=new String("hello");
        
        System.out.println(s1==s2);   //it checks whether they both s1 & s2 pointing to same memory or not.
        
        System.out.println(s1.equals(s2));   //it checks whether content in s1 and s2 equal or not.
        
        System.out.println(s1==s3);    //it checks whether they both s1 & s3 pointing to same memory or not.
        
        System.out.println(s1.equals(s3));   //it checks whether content in s1 and s3 equal or not.
    }
}
