package _14_Encapsulation.Q01;

public class ArabaMain {
    public static void main(String[] args) {

        Araba honda=new Araba();
        honda.setModel("accord");
        honda.setYil(-2018);
        honda.setMotor(90);
        honda.setRenk("kırmızı");


        Araba ford=new Araba("fiesta","elektrik kırmızı",1400,2011);
        Araba toyota=new Araba("avensis","beyaz",300,-2020);
        Araba volvo=new Araba("s80","fume",2400,2010);
        Araba haciMurat=new Araba(400,1974);

        System.out.println("honda ne ararsan var onda"+honda);//toString methodu olmazsa bu obje referans degeri print eder
        System.out.println("volvo araci "+volvo);
        System.out.println("sectiginiz arac toyota->"+"model:"+toyota.getModel()+" Renk:"+toyota.getRenk()+
                " Motor gucu:"+toyota.getMotor()+" Yil:"+toyota.getYil() );

        System.out.println("haci murat:"+haciMurat);
        System.out.println("ford = " + ford);

    }
}
