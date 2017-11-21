public class CetakTruck{

    public static void main(String arg[]){
        Truck truck=new Truck(1000);
        System.out.println("Muatan maksimal : " + truck.getMuatanMaks());
        truck.tambahMuatan(500.0);
        System.out.println("Tambah Muatan : 500");
        truck.tambahMuatan(350.0);
        System.out.println("Tambah Muatan : 350");
        truck.tambahMuatan(100.0);
        System.out.println("Tambah Muatan : 100");
        truck.tambahMuatan(150.0);
        System.out.println("Tambah Muatan : 150");
        System.out.println("Muatan Sekarang = " + truck.getMuatan());
    }
}