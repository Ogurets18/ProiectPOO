
package com.mycompany.proiecttest;

/*
    2.
1 pct. Structura de clase. Se vor definitiva datele membre pentru cele trei clase. 
In fiecare clasa vor fi definiti constructorul fara argumente, cel cu toate argumentele
si cel de copiere si va fi rescrisa metoda toString.  

1 pct. Se va face un fisier de test care sa cuprinda cel putin cate 3 instante 
din cele 3 clase, folosind toti constructorii. Pentru fiecare instanta vor fi
afisate datele membre.

    3.
1 pct. Sa se creeze un vector cu cel putin 10 instante din fiecare clasa si sa 
se afiseze instantele pentru fiecare clasa.

    4.
2 pct. Sa se afiseze instante ale celor 3 clase introduse in vectori in functie
de doua conditii combinate aplicate asupra datelor membre, impuse in codul sursa.

    5.
2 pct. Sa se creeze interfeta grafica pentru aplicatie.Sa se seteze ascultatori 
pe componentele grafice si sa se testeze acesti ascultatori (sa afiseze ceva, sa
seteze ceva, etc.).  Sa se citeasca din Gui (cel putin doua) conditii impuse pentru 
cel putin 3 date membre si sa se afiseze in Gui instantele care satisfac cerintele citite din Gui. 
    6.
2 pct. Sa se scrie si sa se citeasca intr-un fisier instante ale celor 3 clase.
*/
public class ProiectTest {

    public static void main(String[] args) {
        
        BecEconomic becEconom1= new BecEconomic();
       
        becEconom1.clasaEnergetica="A";
        becEconom1.durataViata=10000;
        becEconom1.forma="lumanare";
        becEconom1.greutate=25;
        becEconom1.producator="Philips";
        becEconom1.putere=12;
        becEconom1.unghiDispersieLumina=360;
        becEconom1.tipLumina="calda";
        becEconom1.culoare="alb";
        becEconom1.fluxLumina=610;

        
            System.out.println(becEconom1.toString());
            System.out.println("\n");
        
       
    BecEconomic becEconom2= new BecEconomic(360, "alb",
            300, "rece", "spiralata",
            75, 10000,"A", "Philips",5550);
    System.out.println(becEconom2.toString());
        
    System.out.println("\n");
    
    BecEconomic becEconom3= new BecEconomic(becEconom1);
    System.out.println(becEconom3.toString());
    
    
    System.out.println("\n");
    System.out.println("\n");
    
    BecClasic becClasic1=new BecClasic();
    
    
    becClasic1.Garantie=15;
    becClasic1.clasaEnergetica="G";
    becClasic1.inaltime=57;
    becClasic1.destinatie="cuptor";
    becClasic1.tipSoclu="E14";
    becClasic1.putere=26;
    becClasic1.producator="Philips";
    becClasic1.fluxLumina=172;
    becClasic1.durataViata=1000;
    becClasic1.material="sticla";
    
     System.out.println(becClasic1.toString());
    
    System.out.println("\n");
    
    BecClasic becClasic2= new BecClasic ("E14", "plastic ", "frigider",30, 57, 15, 1000,"G", "Total Green", 100);
    System.out.println(becClasic2.toString());
    
    System.out.println("\n");
    
    
    BecClasic becClasic3= new BecClasic(becClasic1);
    System.out.println(becClasic3.toString());
    
    
    
    
    
    
    
    
        
        
    }
}
