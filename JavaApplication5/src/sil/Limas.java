package sil;

public class Limas {
     public double Volume(double a, double ta, double t){
        double lalas = (a*ta)/2;
        return (lalas*t)/3;
    }
    public double Luas(double a, double ta, double tm){
        double lalas = (a*ta)/2;
       return lalas+(3*tm);
    }
}
