public class Truck{
    
    double muatan, muatanmaks;

    public Truck(double beratmaks){
        muatanmaks = beratmaks;
    }

    public double getMuatan(){

        return muatan;
    }

    public double getMuatanMaks(){

        return muatanmaks;
    }

    public void tambahMuatan(double berat){

        muatan += berat;

        if(muatan >= muatanmaks){
            muatan -= berat;
        }
    }

    public void tambahMuatan1(double berat){

        if((muatan + berat) <= muatanmaks){
            muatan -= berat;
        }
    }
}