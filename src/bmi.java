/*Anda dikenhendaki membina satu program mengira
 *BMI (Body Mass Index). Input pengguna adalah tinggi
 *dalam unit meter dan berat dalam unit kilogram. BMI dapat
 *dikira dengan cara BMI=Berat(kg)/[Tinggi(m)]2.Berikut
 *adalah nilai BMI mengikut skala standard.BMI kurang dari 18.5
 *adalah kurang berat badan, BMI kurang dari 25 berada pada tahap normal,
 *BMI kurang dari 30 adalah berat badan berlebihan dan selebihnya adalah gemuk.
 */
/**
 *
 * @author user
 */
import java.util.*;
public class bmi {
public static void main(String[] args){
    
    double bmi;
    String Ulasan;
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukan berat badan anda dalam ukuran kilogram:");
    double berat=input.nextDouble();
    
    System.out.print("Masukkan tinggi anda dalam ukuran Meter: ");
    double tinggi=input.nextDouble();
    
    bmi=berat/(tinggi*tinggi);
    
    if (bmi < 18.5){
        Ulasan=" Jika kurang daripada yang sepatutnya";
       
    }else if (bmi < 25){
        Ulasan="normal";
        
    }else if (bmi <30){
        Ulasan="berlebihan";
        
    }else{
        Ulasan="gemuk perlu kuruskan berat badan";
        
    }
    System.out.println(Ulasan);
    }
}

