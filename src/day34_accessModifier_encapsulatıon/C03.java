package day34_accessModifier_encapsulatıon;

public class C03 {
    //encapsule edecegımız 2 varıable olsun

    private  int sayi;
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public int getSayi() {
        return sayi;
    }


    @Override
    public String toString() {
        return "C03{" +
                "sayi=" + sayi +
                ", str=" + str ;
    }
}
