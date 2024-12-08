package hu.petrik.bankiszolgaltatasok;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Szamla> szamlak = new ArrayList<Szamla>();
    public Szamla szamlaNyitas(Tulajdonos t, int hitelKeret){
        if(hitelKeret<0) throw new IllegalArgumentException("nem lehet negativ");
        if(hitelKeret==0) {
            MegtakaritasiSzamla msz = new MegtakaritasiSzamla(t);
            szamlak.add(msz);
            return msz;
        } else {
            HitelSzamla hsz= new HitelSzamla(t, hitelKeret);
            szamlak.add(hsz);
            return hsz;
        }
    }
    public int getOsszEgyenleg(Tulajdonos t){
        int osszEgyenleg = 0;
        for(Szamla szamla : szamlak){
            if(szamla.getTulajdonos() == t) osszEgyenleg+= szamla.getAktualisEgyenleg();
        }
        return osszEgyenleg;
    }
    public Szamla getLegnagyobbEgyenleguSzamla(Tulajdonos t){
        Szamla legnagyobb = null;
        for(Szamla szamla : szamlak){
            if(szamla.getTulajdonos() == t)
                if (legnagyobb == null || szamla.getAktualisEgyenleg() > legnagyobb.getAktualisEgyenleg()) {
                        legnagyobb = szamla;
                }
        }
        return legnagyobb;
    }
    public int getOsszHitelkeret(){
        int osszHitelKeret = 0;
        for(Szamla szamla : szamlak) {
        if (szamla instanceof HitelSzamla) {
            osszHitelKeret+= ((HitelSzamla) szamla).getHitelKeret();

        }
        }
        return osszHitelKeret;
    }
}
