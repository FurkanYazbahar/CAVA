/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package furkanmetin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Double.parseDouble;

public class FurkanMetin {

    public static void main(String[] args)
    {
        sehir il[]= new sehir[2];
        try{
            File dosya = new File("C:\\Users\\Furkan\\Desktop\\....txt");
            BufferedReader oku = new BufferedReader(new FileReader(dosya));
            String satir ;
                satir = oku.readLine(); 
//            String[] blok ; //split edildikten sonraki satırdaki kelimeleri tutar.
            int i=0;
            while ((satir=oku.readLine())!=null) {
                String[] blok = satir.split(",");
//                System.out.println(blok[0]+" "+blok[1]+" "+blok[2]+" "+blok[3]+" ");
                il[i].enlem = Double.parseDouble(blok[0]);
                il[i].boylam = Double.parseDouble(blok[1]);
                il[i].plaka = Integer.parseInt(blok[2]);
                il[i].yükseklik = Integer.parseInt(blok[3]);
                System.out.println(il[i].toString()); 
                i++;
            }
        }catch(FileNotFoundException e){
            System.out.print("Dosya bulunamadi veya acilamadi.");
        }catch(IOException e){
            System.out.println("Dosya veri girdisinde hata olustu.");
        }
       
//        for(sehir n : il){
//            System.out.println(n.toString());
//        }
        
    }  
}
