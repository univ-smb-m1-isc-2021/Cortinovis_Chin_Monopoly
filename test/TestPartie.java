import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

import monop.*;

public class TestPartie {
    @Test
    public void TestJoueur(){
        Partie p = new Partie();
        p.connexion("Paul");        
	    p.connexion("Luc");
        assertTrue("Paul" == p.liste.get(0).nom);
        assertTrue("Luc" == p.liste.get(1).nom);
        p.lancerPartie();
        //assertTrue(p.liste.get(0).getCaseC() == p.listeCases.get(0));
        //assertTrue(p.liste.get(1).getCaseC() == p.listeCases.get(0));

    }
    
}
