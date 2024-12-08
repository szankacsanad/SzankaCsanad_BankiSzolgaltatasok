package hu.petrik.bankiszolgaltatasok;

public class MegtakaritasiSzamla extends Szamla {
    public static double alapKamat = 0.1;
    private double kamat;
    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        kamat = alapKamat;

    }
    public double getKamat() {
        return kamat;
    }
    public void setKamat(double kamat) {
        this.kamat = kamat;
    }
    public void kamatJovairas(){
        aktualisEgyenleg *= kamat;
    }
    @Override
    public boolean kivesz(int osszeg){
        if(aktualisEgyenleg -osszeg >= 0){
            aktualisEgyenleg -= osszeg;
            return true;
        }
        return false;
    }
}
