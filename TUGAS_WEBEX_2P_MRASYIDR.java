package tugas_webex_bgk_mrasyidr;
import java.util.Scanner;
import java.util.Random;
public class TUGAS_WEBEX_2P_MRASYIDR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
       int player1, player2;
        System.out.println("Kterangan");
        System.out.println("1.Batu\n2.Gunting\n3.Kertas");
        System.out.println("pilihan(PLAYER1)");
        player1= input.nextInt();
        System.out.println("pilihan(PLAYER 2)");
        player2= input.nextInt();
        
        //1.Batu 2.Gunting 3.Kertas
        
        if(player1==1){
        if(player2==1){
            System.out.println("Seri");
        } else if(player2==2){ 
            System.out.println("Menang");
        } else if(player2==3){
            System.out.println("Kalah");
        }
      } else if(player1==2){
          if(player2==1){
              System.out.println("Kalah");
        }else if(player2==2){
              System.out.println("Seri");
        }else if(player2==3){
              System.out.println("Menang");
       }
      } else if(player1==3){
          if(player2==1){
              System.out.println("Menang");
       } else if(player2==2){
              System.out.println("Kalah");
       }else if(player2==3){
              System.out.println("Seri");
       }
      }
    }
}
