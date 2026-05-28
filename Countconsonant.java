import java.util.Scanner;

public class Countconsonant {
    public static void main(String[] args){
    int count=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string: ");
String a=sc.next();

for(int i=0;i<a.length();i++){
    char ch=a.charAt(i);

    if(ch>='a'&& ch<='z' || ch>='A' && ch<='Z'){
        if(ch!='a'&& ch!='A'&& ch!='e'&& ch!='E'&& ch!='i'&& ch!='I'&& ch!='o'&& ch!='O'&& ch!='u'&& ch!='U'){
          count++;
    }
}
    }
    System.out.print("Number of Consonants = "+count);
    sc.close();
}
}
