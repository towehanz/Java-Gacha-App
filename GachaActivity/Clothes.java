package GachaActivity;

import java.util.ArrayList;

public class Clothes extends Mount{

  public static void addClothesList(){
    ArrayList<String> clothesList = new ArrayList<String>();
    clothesList.add("Circlet");
    clothesList.add("Helm");
    clothesList.add("Boots");

    System.out.println(clothesList);
  }

}
