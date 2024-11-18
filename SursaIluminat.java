
package com.mycompany.proiecttest;


public class SursaIluminat {
    public double putere;// 60W 100W
    public int durataViata;// 1000-25000 ore
    public String clasaEnergetica;//A+ A B C
    public String producator;// Philips GeneralElectric Panasonic Toshiba
    public int fluxLumina;

    //Constructor fara parametrii
    public SursaIluminat(){}

    //Constructori cu toti parametrii
    public SursaIluminat(double putere, int durataViata, String clasaEnergetica, String producator, int fluxLumina){
        this.putere=putere;
        this.durataViata=durataViata;
        this.clasaEnergetica=clasaEnergetica;
        this.producator=producator;
        this.fluxLumina=fluxLumina;
    }

    //Constructor de copiere
    public SursaIluminat(SursaIluminat other){
        this.putere= other.putere;
        this.durataViata= other.durataViata;
        this.clasaEnergetica= other.clasaEnergetica;
        this.producator= other.producator;
        this.fluxLumina= other.fluxLumina;
    }

    //toString

    @Override
    public String toString() {
        return "SursaIluminat{" +
                "putere=" + putere +
                ", durataViata=" + durataViata +
                ", clasaEnergetica='" + clasaEnergetica + '\'' +
                ", producator='" + producator + '\'' +
                ", fluxLumina=" + fluxLumina + '}';}
}
