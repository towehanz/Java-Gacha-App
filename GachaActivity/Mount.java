package GachaActivity;

import java.util.LinkedList;
import java.util.*;

public class Mount{

    static Weapons weapons = new Weapons();
    static Foods foods = new Foods();
    static Clothes clothes = new Clothes();

    static Scanner scan = new Scanner(System.in);

    public static void randomizer(){
        int min = 0;
        int max = 3;
        int random;

        System.out.println("Congratulations! Your daily rewards are: ");
        random = min+(int)(Math.random()*((max-min))+1);

     
        if (random == 1) {
    
    
            Weapons.addWeaponsList();
    
           
        } else if (random == 2){
    
            Clothes.addClothesList();
    
            
           
        } else if (random == 3){
         
            Foods.addFoodsList();
    
           
        } else {
            System.out.println("Invalid Input");
        }
    }

    public static void bonusReward(){
        LinkedList<String> mountList = new LinkedList<String>();
        mountList.add("Wolf");
        mountList.add("Tiger");
       
    
    
        
    
        System.out.println("Choose a bonus reward!\nType 1 or 2: ");
        int userInput = scan.nextInt();
        if (userInput == 1){
            System.out.println("Your bonus reward is: "+ mountList.getFirst());
        } else if (userInput == 2) {
    
            System.out.println("Your bonus reward is: "+mountList.getLast());
    
        } else {
            System.out.println("Invalid Input");
    
        }

    }
    
   

    


  
    }

