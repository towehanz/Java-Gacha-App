package GachaActivity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;




public class Spin {

        public static void main(String[] args){
         System.out.println("--------------------------------");
         Mount.randomizer();
         System.out.println("--------------------------------");
         Mount.bonusReward();
         System.out.println("--------------------------------");
        
        LocalDateTime myDateTimeObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, dd-MM-yyyy HH:mm:ss");
        String formattedDateTime  = myDateTimeObj.format(myFormatObj);
        System.out.println("Date and Time Claimed: " + formattedDateTime);
        


    }


}
