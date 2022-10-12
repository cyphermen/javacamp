public class BaseKrediManager {
    public double hesapla(double tutar){//final keyword'ü ile metodun ovveride edilmesini engelleyebiliriz.    public final double hesapla
        return tutar * 1.25;
    }
}
