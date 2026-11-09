
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner girdi = new Scanner(System.in);                      
        
        System.out.println("Kat sayisi 10 olarak belirlendi");
        
        System.out.print("Suan kacinci kattasin: ");
        int mevcut = girdi.nextInt();
        
        if (mevcut > 10 || mevcut <= 0) {
            
            System.out.println("Mevcut katini gecersiz girdin. Program kapatiliyor.");
            
        } else {
            
            System.out.print("Tamam, kaydettim. Peki, kacinci kata gideceksin: ");
            int hedef = girdi.nextInt();
            
            if (hedef > 10 || hedef <= 0) {
                
                System.out.println("Hedef katini gecersiz girdin. Program kapatiliyor.");
                
            } else {
                
                int msf; 
                
                if (mevcut > hedef) {
                    
                    msf = mevcut - hedef;
                    System.out.println("Hedefledigin kata ulasmak icin " + msf + " kat asagi inmen gerekiyor.");
                    
                } else {
                    
                    if (hedef > mevcut) {
                        
                        msf = hedef - mevcut;
                        System.out.println("Hedefledigin kata ulasmak icin " + msf + " kat yukari cikman gerekiyor.");
                        
                    } else {
                        
                        System.out.println("Zaten hedefledigin kattasin. Hareket etmene gerek yok.");
                    }
                }
            }
        }
    }
}
