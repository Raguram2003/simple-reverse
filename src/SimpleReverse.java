import java.util.Scanner;

public class SimpleReverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = sc.next();
        System.out.println(doingReverseAString(str));
    }
    public static String doingReverseAString(String str){
        char ch[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        char temp;
        for(int i=0;i<str.length()/2;i++){
            temp = ch[i];
            ch[i] = ch[str.length()-1-i];
            ch[str.length()-1-i]=temp;
        }
        String sf="";
        for(int i=0;i<ch.length;i++){
            sf +=ch[i];
        }
        return sf;
    }
}
