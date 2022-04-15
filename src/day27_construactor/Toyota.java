package day27_construactor;

public class Toyota {
    String marka="Toyota";
    int tekerAdedi=4;
    boolean motoruVarMi=true;
    String model;
    String yakit;
    int yil;


    public  void  maxHiz(){
        if (yakit.equals("Benzin")){
            System.out.println("Benzinli araclar max 249 km hiz yapar");
        }else if (yakit.equals("Mazot")){
            System.out.println("Dizel araclar max 250 km hız yapar");
        }

    }
    public void renkTercihleri(){
        if (model.equals("Corolla")){
            System.out.println("Corolla renk secenekleri kırmızı ve beyaz");
        }else if (model.equals("yaris")){
            System.out.println("yaris renk secenekleri mavi ve sari");
        }


    }
}

