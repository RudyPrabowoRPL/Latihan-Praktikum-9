public class RumusMatematika{

    double a, t;                                        //dekarasi variable
    double l_segitiga;                                  //dekarasi variable

    public static void main(String arg[]){              //method main berjenis static
        RumusMatematika rm = new RumusMatematika();     //deklarasi object dengan nama rm
        rm.luasSegitiga();                              //pemanggilan method luasSegitiga();
    }

    void luasSegitiga(){                                //method void
        a = 7;                                          
        t = 10;
        l_segitiga = 0.5 * 1 * t;
        System.out.println("Luas Segitiga = " +l_segitiga);
    }
}