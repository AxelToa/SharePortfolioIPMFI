/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp10.metier;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import tp.metier.Action;
import tp.metier.Jour;

/**
 *
 * @author axelt
 */
public class ActionTest {
    
    public ActionTest() {
    }

    @Test
    public void testConstructorGetNomSame() {
        final String nom = "Starbucks";

        Action action = new Action(nom) {
            @Override
            public float valeur(Jour j) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };

        assertSame(nom, action.getNom());
    }
}
