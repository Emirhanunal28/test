package day12_StringManıpulatıon;

public class Deney {
    public static void main(String[] args) {

      //kullanıcıdan bir cumle ve bir harf isteyin
      //harfın cumlede var olup olmadığını yazdırın

      String cumle="Bakışların ruhunun gücünü gösterir";
      String harf="";



      int ilkKullanım=cumle.indexOf(harf);
      int ikiciKullanım=cumle.indexOf(harf,ilkKullanım+1);

      if (ilkKullanım==(-1)){
          System.out.println("Girdiğiniz harf cumlede kullanılmamış");
      }else if (ikiciKullanım==(-1)){
          System.out.println("Girdiğiniz harf cumlede 1 kere kullanılmış");
      }else {
          System.out.println("Girdiğiniz kelime 1 den fazla kullanılmış");
      }



















    }
}
