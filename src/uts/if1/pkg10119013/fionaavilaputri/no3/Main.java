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



public class Main {

    public static void main(String[] args) {
        Rnb r = new Rnb();
        r.genreBlues("Jimy Hendrik");
        r.genreJazz("Chad Baker");
        Folk f = new Folk();
        f.genreFolk("Bob Dylan");
        Rockabilly ro = new Rockabilly();
        ro.genreRockabilly("Elvis Presley");
        HardRock h = new HardRock();
        h.genreProgressiveRock("DreamTheater");
        h.genrePsycehedellic("The Doors");
        h.genrePopRock("Kiss");
        Metal m = new Metal();
        m.genrePunk("MXPX");
        m.genreHeavyMetal("METALLICA");
        Grindcore g = new Grindcore();
        g.genreGrindCore("Mesin Tempur");
    }
    
}
