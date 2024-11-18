
package com.mycompany.proiecttest;

/*
vor fi definiti constructorul fara argumente, cel cu toate argumentele
si cel de copiere si va fi rescrisa metoda toString
*/
public class BecClasic extends SursaIluminat {
    
    public String tipSoclu; // E27, E14, E40, E26
    public String material; //sticla, metal
    public String destinatie; // interior, exterior
    public int Garantie; // in mediu 15 zile
    public int inaltime; //cod individul pentru fiecare bec
    
    
    public BecClasic(){}

    /*public BecClasic(String tipSoclu, String material, String destinatie, int zileGarantie, int codUnic) {
        this.tipSoclu = tipSoclu;
        this.material = material;
        this.destinatie = destinatie;
        this.zileGarantie = zileGarantie;
        this.codUnic = codUnic;
    }*/

           
    
    
    public BecClasic(String tipSoclu, String material, String destinatie,
            int Garantie, int inaltime, double putere, int durataViata, 
            String clasaEnergetica, String producator, int fluxLumina) {
        super(putere, durataViata, clasaEnergetica, producator, fluxLumina);
        this.tipSoclu = tipSoclu;
        this.material = material;
        this.destinatie = destinatie;
        this.Garantie = Garantie;
        this.inaltime = inaltime;
    }
    
    
    
    BecClasic(BecClasic c){
        
    
    putere=c.putere;
    durataViata=c.durataViata;
    clasaEnergetica=c.clasaEnergetica;
    producator=c.producator;
    fluxLumina=c.fluxLumina;
    tipSoclu = c.tipSoclu;
    material = c.material;
    destinatie = c.destinatie;
    Garantie = c.Garantie;
    inaltime = c.inaltime;
    }
    
    
    @Override
    public String toString(){
    
        return "Becul are soclu de tip "+tipSoclu+"\n"+
                "Confectionat din" +material+"\n"
                +"Becul este folosit pentru "+destinatie+"\n"+
                " Are o garantie de "+ Garantie+" zile\n"
                +" Becul are  "+inaltime+" mm\n"+
                "Are o putere de "+putere+" W\n"+
                "Durata de viata este "+ durataViata+"\n"+
                "Face parte din clasa energetica "+clasaEnergetica+"\n"+
                "Producatorul "+producator+"\n"+
                "Fluxul de lumina este "+fluxLumina;
            
    }
    
    
    
   
    
    
}
 