package _14_Encapsulation.Q01;

public class Araba {//POJO planing old java object->modal class
    private String model;
    private String renk;
    private int motor;
    private int yil;


    public Araba() {//p'siz cons

    }
    public Araba(String model, String rnk, int motor, int yil) {//p'li cons
        this.model = model;
        this.renk = renk;
        this.motor = motor;
        this.yil = yil;


        setMotor(motor);
        setYil(yil);
    }

    public Araba(int motor, int yil) {//p'li cons
         setMotor(motor);
        setYil(yil);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String rnk) {

        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if (motor<1000){
            System.out.println("agam bizimle eglenir bu cc de motor mu olur");
            this.motor =motor+500;
        }else
        this.motor = motor;

    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if (yil<0){
            this.yil=(-1)*yil;
            System.out.println("agam nisledingg milattan once araba mı vardı");

        }else
        this.yil = yil;
    }
    @Override
    public String toString() {//bu method bu classtan creat edilen objelerin fieldlarını stringe cevirir
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }
}
