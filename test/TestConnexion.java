import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

import monop.*;

public class TestConnexion {
    @Test
    public void TestJoueur(){
        Partie p = new Partie();
        p.connexion("Paul");        
	    p.connexion("Luc");
        assertTrue("Paul" == p.liste.get(0).nom);
        assertTrue("Luc" == p.liste.get(1).nom);

    }
    
}
