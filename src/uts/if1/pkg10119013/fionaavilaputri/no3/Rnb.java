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



public class Rnb extends MusicGenre implements Blues, Jazz {
    
    @Override
    public void genreJazz(String artistName){
        System.out.println(artistName + " adalah musisi " + "Jazz");
    }
    
    @Override
    public void genreBlues(String artistName){
        System.out.println(artistName + " adalah musisi " + "Blues");
    }
}
