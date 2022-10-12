public class OgrenciKrediManager extends BaseKrediManager{
    public double hesapla(double tutar){//overriding. BaseKrediManager'ın hesapla fonk'u üzerine OgrenciKrediManager'ın hesaplasını yazdık
        return tutar * 1.05;
    }
}

//Javada metodlar default olarak overridable'dır.

