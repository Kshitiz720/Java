import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.*;

//Ques 1:
/*import java.util.Map;
import java.util.HashMap;

public class DuplicateWords{

    public static void main(String []args){
        Map<String,Integer> map = new HashMap<String,Integer>();
        String org ="this is original string of words to find  original duplicate words";
        String[] words = org.split(" ");
        //map.put(words[0],1);
        //System.out.println(map.get("this"));
        for(int i=0; i<words.length; i++)
        {
            if(map.containsKey(words[i]))
            {
                //System.out.println("true");
                int temp=0;
                temp=map.get(words[i]);
                temp++;
                map.put(words[i],temp);
            }
            else
            {
                map.put(words[i],1);
            }
        }
        System.out.println(map);
        for(Map.Entry<String,Integer> entry: map.entrySet())
        {
            if(entry.getValue() > 1)
            {
                System.out.println("duplicate value:  "+entry.getKey());
            }
        }
    }
}*/
//Ques 2:
/*public class replaceSubstring{

    public static void main(String []args){
        String org ="this is original string";
        System.out.println(org);
        String replaced=org.replace("original","replaced");
        System.out.print(replaced);
    }
}*/
/*public class occurenceOfCharacter{
    public static void main(String[] args)
    {
        String str ="this is original string of words to find  original duplicate words";
        System.out.println("We are finding number occurence of character a in string");
        System.out.println();
        int count = str.length() - str.replace("a","").length();
        System.out.println("Occurence of a are: "+count);
    }
}*/
//Ques 4
/*import java.util.*;
public class occurenceOfCharacter{
    public static void main(String[] args)
    {
        String str ="This is OrigInal  @@@stRin6g of Words98 to 78find  original duplicate words";
        String specialcharacter="[!@#$%&*()_+=|<>?{}\\\\[\\\\]~-]";
        Set<Character> set = new HashSet<Character>();
        for(int i=0; i<specialcharacter.length();i++){
            set.add(specialcharacter.charAt(i));
        }
        //System.out.println(set);
        int lower=0,upper=0,digit=0,specialch=0,white=0;
        int length=str.length();
        for(int i=0; i<length; i++)
        {
            char ch =str.charAt(i);
            if(Character.isUpperCase(ch)){
                upper++;
            }
            else if(Character.isLowerCase(ch))
            {
                lower++;
            }
            else if(Character.isDigit(ch)){
                digit++;
        }
            else if(set.contains(ch))
            {
                specialch++;
            }
            else if(Character.isWhitespace(ch))
            {
                white++;
            }
        }
        length=length-white;  // to remove number of whitespaces
        double upper1=(upper*100.0)/length;
        double lower1=(lower*100.0)/length;
        double digit1=(digit*100.0)/length;
        double specialch1=(specialch*100.0)/length;
        System.out.println("Number of Lowercase "+lower+" lowercase percentage "+lower1);
        System.out.println("Number of Uppercase "+upper+" Uppercase percentage "+upper1);
        System.out.println("Number of Digit "+digit+" Digit percentage "+digit1);
        System.out.println("Number of special character "+specialch+" special character percentage "+specialch1);
    }
}*/
/*import java.util.*;
public class commonelements{
    public static void main(String[] args){
        int[] arr1 = new int[]{25,35,45,55,25,23};
        int[] arr2 = new int[]{22,35,25,56,46,67};
        for(int i=0; i<arr1.length;i++){
            for(int j=0; j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}*/
/*import java.util.*;
public class commonelements{
    public static void main(String[] args){
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr1.add(25);
        arr1.add(35);
        arr1.add(45);
        arr1.add(55);
        arr1.add(25);
        arr1.add(23);

        arr2.add(22);
        arr2.add(35);
        arr2.add(25);
        arr2.add(56);
        arr2.add(46);
        arr2.add(67);
        System.out.println(arr1);
        System.out.println(arr2);
        arr1.retainAll(arr2);
        System.out.println("Common elements are");
        System.out.println(arr1);
    }
}*/
/*public class commonelements {
    public static void main(String[] args) {
        int[] arr1 = new int[]{25, 35, 45, 55, 25, 23};
        int[] arr2 = new int[]{22, 35, 25, 56, 46, 67};
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<arr1.length;i++){
            for(int j=0; j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    set.add(arr1[i]);
                }
            }
        }
        System.out.println("Common elements are:");
        System.out.println(set);
    }
}*/
//Ques 6
/*public class repeatedElementTwice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int num = sc.nextInt();
        int[] arr = new int[num+1];
        System.out.println("Enter array elements");
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        int result=arr[0];
        for(int i=1; i<num; i++){
            result=result^arr[i];
        }
        System.out.println("Single element is");
        System.out.println(result);
    }
}*/
//Ques 7
/*public class useOfStatic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first name");
        String first=sc.nextLine();
        System.out.println("enter your last name");
        String last =sc.nextLine();
        staticDemo sd = new staticDemo();
        sd.showname(first,last);
    }
}
class staticDemo{
    static int age;
    static String firstname="";
    static  String lastname="";
    static{
        age =22;

    }
    static void showname(String first,String last){
        firstname=first;
        lastname=last;
        System.out.println("Your first name is "+firstname);
        System.out.println("Your Last name"+lastname);
        System.out.println("Your age is "+age);

    }
}*/
//Ques 8
/*public class useOfStringBuffer{
    public static void main(String[] args){
        String value="this is string";
        StringBuffer str = new StringBuffer(value);
        System.out.println("original string: "+str);
        StringBuffer reverse=str.reverse();
        System.out.println("reversed string is: "+reverse);
        System.out.println("character removed from index 4 to index 9: "+reverse.delete(4,9));
    }
}*/
//Ques 9
/*enum house{
    bhk1(100000),
        bhk2(150000),
        bhk3(200000),
    villa(250000);
    int price;
    house(int p){
        price = p;
    }
    int getPrice(){
        return price;
    }
}
public class useOfEnum{
    public static void main(String[] args){
        System.out.println("all house prices");
        for(house h: house.values()){
            System.out.println(h.getPrice());
        }
    }
}*/
//Ques 10
/*class operation{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    float multiply(float a, float b){
        return a*b;
    }
    int multiply(int a, int b){
        return a*b;
    }
    String concate(String a, String b){
        return a+b;
    }
    String concate(String a, String b,String c){
        return a+b+c;
    }
}
public class useOfOverloading{
    public static void main(String[] args){
        operation op = new operation();
        System.out.println("Integer sum: "+op.add(23,22));
        System.out.println("Double sum: "+op.add(23.3434343434,22.68686868686));
        System.out.println("Integer multiply: "+op.multiply(23,22));
        System.out.println("float multiply"+op.multiply(23.34f,22.68f));
        System.out.println("Two String concatenation: "+op.concate("To","The"));
        System.out.println("Three String concatenation: "+op.concate("To","The","New"));


    }
}*/
//Ques 11:
/*class SBI{
    void getdetails(){
        System.out.println("SBI Branch name 23, Himalaya House, Kasturba Gandhi Marg, New Delhi 110001");
        System.out.println("IFSC code SBIN0005943");
        System.out.println("Rate of Intrest 6.25%");
        System.out.println();
    }
}
class BOI extends SBI{
    void getdetails(){
        System.out.println("BOI Branch name NEW DELHI ZONAL OFFICE");
        System.out.println("IFSC code BKID000ZO64");
        System.out.println("Rate of Intrest 6.50%");
        System.out.println();
    }
}
class ICICI extends BOI{
    void getdetails(){
        System.out.println("ICICI Branch name Sahibabad Branch");
        System.out.println("IFSC code  ICIC0000255");
        System.out.println("Rate of Intrest 6.60%");
        System.out.println();
    }
}
public class bank extends ICICI{
    public static void main(String[] args){
        //bank b = new bank();
        ICICI i = new ICICI();
        BOI b = new BOI();
        SBI s = new SBI();
        s.getdetails();
        b.getdetails();
        i.getdetails();

    }
}*/
