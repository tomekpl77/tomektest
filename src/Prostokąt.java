/**
 * ..... comment class...
 *
 * @autor szymon.olucha@gmail.com
 * @since 07.12.2019
 */
public final class Prostokąt {


    private final double dł;
    private final double sz;

    public Prostokąt(double dł, double sz) {
        this.dł = dł;
        this.sz = sz;
    }


    public void pole (){
        double pole = dł*sz;
        System.out.println(pole);
    }

    public void ob(){
        double ob =2*dł +2*sz;
        System.out.println(ob);

    }
    public  void prz(){
        double prz = Math.sqrt(dł*dł + sz*sz);
        System.out.println(prz);
    }

}
