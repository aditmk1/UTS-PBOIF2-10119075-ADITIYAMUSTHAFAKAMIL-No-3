/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119075.aditiyamusthafakamil.no.pkg3;

/**
Nama : Aditiya musthafa kamil
Kelas : PBOIF2
NIM : 10119075
Deskripsi Program : Program ini berisi program untuk menampilkan deskripsi gendre musik
 */
public class PBOIF210119075ADITIYAMUSTHAFAKAMILNo3 {

     @SuppressWarnings("empty-statement")
     public static void main(String[] args) {
                
        Rnb rnb1 = new Rnb();
        Rnb rnb2 = new Rnb();
        Folk folk = new Folk();
        Rockability rockability = new Rockability();
        HardRock hr1 = new HardRock();
        HardRock hr2 = new HardRock();
        HardRock hr3 = new HardRock();
        Metal m1 = new Metal();
        Metal m2 = new Metal();
        Grindcore g1 = new Grindcore();
        DeathMetal d1 = new DeathMetal();
        DeathCoreKepiting dck1 = new DeathCoreKepiting();
        BlackMetal bm1 = new BlackMetal();
        NewSkull ns1 = new NewSkull();
        
        rnb1.genreBlues("Jimmy Hendrik");
        rnb2.genreJazz("Chad Baker");
        folk.genreFolk("Bob Dylan");
        rockability.genreRockability("Elvis Presley");
        hr1.genreProgressiveRock("DreamTheater");
        hr2.genrePsycehedellicRock("The Doors");;
        hr3.genrePopRock("Kiss");
        m1.genrePunk("MXPX");
        m2.genreHeavyMetal("METALLICA");
        g1.genreGrindcore("Mesin Tempur");
        d1.genreDeathMetal("JASAD");
        dck1.genreCoreKepiting("Revenge The Fate");
        bm1.genreBlackMetal("Behemoth");
        ns1.genreNewSkull("HATEBREED");
    }
    
}