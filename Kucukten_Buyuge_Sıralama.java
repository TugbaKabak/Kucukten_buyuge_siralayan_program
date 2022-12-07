import java.util.Scanner;

public class Kucukten_Buyuge_Sıralama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a,b,c;

        System.out.println("Sıralamak istediğiniz 1. sayıyı giriniz: ");
        a=input.nextInt();

        System.out.println("Sıralamak istediğiniz 2. sayıyı giriniz: ");
        b=input.nextInt();

        System.out.println("Sıralamak istediğiniz 3. sayıyı giriniz: ");
        c=input.nextInt();

        if((a<b) && (a<c)){
            if(b<c){
                System.out.println("Küçükten büyüğe sıralama:  "+a+"<"+b+"<"+c);
            }
            else{
                System.out.println("Küçükten büyüğe sıralama:  "+a+"<"+c+"<"+b);
            }
        } else if ((b<a) && (b<c)) {
            if(a<c){
                System.out.println("Küçükten büyüğe sıralama:  "+b+"<"+a+"<"+c);
            }
            else{
                System.out.println("Küçükten büyüğe sıralama:  "+b+"<"+c+"<"+a);
            }
        }
        else if((c<a) && (c<b)){
            if(a<b){
                System.out.println("Küçükten büyüğe sıralama:  "+c+"<"+a+"<"+b);
            }
            else{
                System.out.println("Küçükten büyüğe sıralama:  "+c+"<"+b+"<"+a);
            }
        }
    }
}
