package hu.petrik.bankiszolgaltatasok;

public class Main {
    public static void main(String[] args) {
        Bank bank= new Bank();
        Tulajdonos tulajdonos= new Tulajdonos("Feri");
        Szamla szamla= bank.szamlaNyitas(tulajdonos, 0);
        Kartya k = szamla.ujKartya("12345-6789");
        szamla.befizet(70000);
        k.vasarlas(10000);
        System.out.println(szamla.getAktualisEgyenleg());
    }
}
