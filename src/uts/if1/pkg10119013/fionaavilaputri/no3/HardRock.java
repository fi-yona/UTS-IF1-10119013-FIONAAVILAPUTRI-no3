/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package uts.if1.pkg10119013.fionaavilaputri.no3;

/**
 *
 * @author Fiona Avila
 */



public class HardRock extends Rnb implements PopRock, ProgressiveRock, PsychedelicRock{
    
    public void genreHardRock(String artistName){
        System.out.println(artistName + " adalah musisi " + "Hard Rock");
    }
    
    @Override
    public void genrePopRock(String artistName){
        System.out.println(artistName + " adalah musisi " + "Pop Rock");
    }
    
    @Override
    public void genrePsycehedellic(String artistName){
        System.out.println(artistName + " adalah musisi " + "Psycehedellic");
    }
    
    @Override
    public void genreProgressiveRock(String artistName){
        System.out.println(artistName + " adalah musisi " + "ProgressiveRock");
    }
    
}
