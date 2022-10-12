public abstract class GameCalculator {
    public abstract void hesapla();//GameCalculator'u inherit eden , abstract'tan dolayı hesapla'yı kullanmak ve override ederek kullanmak zorunda

    public final void gameOver(){ // gameOver'ı kullanan override edemeyecek
        System.out.println("Oyun bitti");
    }
}