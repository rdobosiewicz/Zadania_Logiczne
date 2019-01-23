
package zadania.logiczne;

import java.util.Scanner;

/**
 * <code>Prezentacja wybranych zadań logicznych</code>
 * @author Rafał Dobosiewicz
 * @version 1.0.0.1 23/01/2019
 */
//public class ZadaniaLogiczne {
//    /**
//    * Zadanie logiczne prezentujące zmianę wielkości liter
//    */
//    public static void main(String[] args) {
//      //Change the size of letters
//        
//        Scanner sc= new Scanner (System.in);
//        System.out.println("Wprowadz ciag znakow: ");
//        String text = sc.nextLine();
//        String sp =" ";
//        
//        char space =sp.charAt(0);
//        
//        //eliminuje spacje na początku i na końcu
//        text = text.trim();
//        //zamienia wszystkie litery na małe
//        text = text.toLowerCase();
//        
//        char[] letters = text.toCharArray();
//        
//        
//       
//        for (int i=0; i<text.length(); i++)
//        {   
//            if (i==0)
//            {
//                //Zamienia pierwszą literę na dużą
//                char litera = letters[i];
//                String n = ""+litera;
//                System.out.print(n.toUpperCase());
//            }else if (letters[i]== space)
//            {
//               //zamienia pierwszą literę po spacji na dużą
//               char litera2 = letters[i+1];
//               String n2 = " "+litera2;
//               System.out.print(n2.toUpperCase());
//               i++;
//            }else if(i==text.length()-1)
//            {
//               System.out.println(letters[i]+"\n");
//            } 
//            else{
//               System.out.print(letters[i]);
//            }
//            
//     
//            
//    }
//    
//}


public class ZadaniaLogiczne {

    /**
    * Zadanie logiczne wykorzystujące statyczną klasę "Nowa" zwracającą "prawdę" jeżeli wpisana w konsoli liczba jest liczbą doskonałą
    * lub fałsz, gdy podana liczba nie jest liczbą doskonałą.
    * Liczba doskonała charakteryzuje się tym, że suma jej dzielników jest równa liczbie. 
    */


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita: ");
        int liczba = sc.nextInt();
        
        if(Nowa.LiczbaDoskonala(liczba))
        {
            System.out.println("Podana przez Ciebie liczba "+liczba+" jest doskonala");
        }else
        {
            System.out.println("Twoja liczba "+liczba+" nie jest doskonala");
        }
        
        
     }
}

class Nowa {
    
    public static boolean LiczbaDoskonala(int l){
        
        int[] tabela = new int[l];
        int[] dzielniki = new int[l];
        int x = 1;
        int y = 1;
        int z = 0;
        int liczba = 0;
        
        if(l>0)
        {
            for(int i=0; i<l;i++)
            {
                tabela[i] = x;
                x++;
            }
            for(int j=0; j<l; j++)
            {
                if(l%y==0)
                {
                    dzielniki[z] = tabela[j];
                    z++;
                }
                y++;
            }
            for(int k=0; k<z-1;k++)
            {
                liczba += dzielniki[k];
               
            }
            if(liczba==l)
            {
                return true;
            }
            
        }
        
        return false;
    }


}
    