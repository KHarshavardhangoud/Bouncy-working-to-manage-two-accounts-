import java.util.Scanner;

public class Bouncy {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
    System.out.println("enter a positive num");    
    int num=in.nextInt();
    int c=num;
    int Reversednum=0;
    while (num!=0) {
        int digit=num%10;
        Reversednum=Reversednum*10+digit;
        num/=10;
    }
    int b=-1;
    int Numdigit=0;
    for(int i=0; b<Numdigit; i++){
        b=Numdigit;
        Numdigit=c%10;
        c/=10;
        { 
            while(num==0){
                break;
            }
        }

    }

        }
    
}
