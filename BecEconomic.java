
package com.mycompany.proiecttest;


public class BecEconomic extends SursaIluminat {
    
    public double unghiDispersieLumina;   //in (mili)secunde
    public String culoare; // mercur, argon, neon
    public int greutate; // 100-300 gr
    public String tipLumina; //calda rece neutra
    public String forma; // spirala, clasica, flacara

    
    public BecEconomic() {
    }



    public BecEconomic(double unghiDispersieLumina, String culoare,
            int greutate, String tipLumina, String forma,
            double putere, int durataViata, String clasaEnergetica, String producator,int fluxLumina) {
        
        
        super(putere, durataViata, clasaEnergetica, producator, fluxLumina);
        
        
        this.unghiDispersieLumina = unghiDispersieLumina;
        this.culoare = culoare;
        this.greutate = greutate;
        this.tipLumina = tipLumina;
        this.forma = forma;
    }
    
    
    
    
    
      BecEconomic(BecEconomic c){
        
    putere=c.putere;
    durataViata=c.durataViata;
    clasaEnergetica=c.clasaEnergetica;
    producator=c.producator;
    fluxLumina=c.fluxLumina;
    unghiDispersieLumina= c.unghiDispersieLumina;
    culoare= c.culoare;
    greutate= c.greutate;
    tipLumina= c.tipLumina;
    forma= c.forma;
    }
    
    
    
    
    @Override
    public String toString(){
    
    return "Unghiu de disperie a luminii este  "+unghiDispersieLumina+" \n"+
            "Becul are culoarea "+culoare+"\n"+
            "Becul cantareste "+greutate+" grame\n"+
            "Are lumina de tip " + tipLumina + "\n"+
            "Are forma "+forma +
            "Are o putere de "+putere+" W\n"+
            "Durata de viata este "+ durataViata+"\n"+
            "Face parte din clasa energetica "+clasaEnergetica+"\n"+
            "Producatorul "+producator+"\n"+
            "Fluxul de lumina este "+fluxLumina;
          }
    
            
    
}
