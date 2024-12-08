package hu.petrik.bankiszolgaltatasok;

public class Kartya extends BankiSzolgaltatas{
    private String kartyaSzam;
    private Szamla szamla;
    public Kartya(Tulajdonos t,Szamla sz,String kartyaSzam) {
        super(t);
        this.kartyaSzam = kartyaSzam;
        this.szamla = sz;
    }
    public String getKartyaSzam() {
        return kartyaSzam;
    }
    public boolean vasarlas(int osszeg){
        return szamla.kivesz(osszeg);
    }
}
