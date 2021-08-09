public class Client {
    public static void main(String[] args) {
        Dengen dengen = new AcAdapter();
        int denatsu = dengen.kyuuden();
        System.out.println( denatsu + "V で給電されています" );
    }
}

abstract class Dengen { // Targetクラス
    public abstract int kyuuden(); // request()メソッド
}

class JapaneseConsent {
    public int power() {
    return 100;
    }
}

class AcAdapter extends Dengen {
    private JapaneseConsent consent;

    public AcAdapter(){
        this.consent = new JapaneseConsent();
    }

    public int kyuuden(){
        return (int)(consent.power() * 0.16);
    }
}
    