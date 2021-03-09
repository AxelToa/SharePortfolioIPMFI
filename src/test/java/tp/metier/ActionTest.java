/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package tp.metier;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 *
 * @author axelt
 */
public final class ActionTest {

    /**
     * Constructor.
     */
    private ActionTest() { }

    /**
     * Test of getNom method with same assertion, of class Action.
     */
    @Test
    public static void testGetNomSameNom() {
        String name = "TOTO";

        Action action = new Action(name) {
            @Override
            public float valeur(final Jour j) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };

        Assertions.assertSame(name, action.getNom());
    }

    /**
     * Test of getNom method with failed assertion, of class Action.
     */
    @Test
    public static void testGetNomNullParameterNullPointerException() {
        Assertions.assertThrows(NullPointerException.class, () -> {
                new Action(null) {
                    @Override
                    public float valeur(final Jour j) {
                        throw new UnsupportedOperationException(
                            "Not supported yet.");
                    }
                };
            });
    }
    
    /**
     * Test of valeur method, of class Action.
     */
    @Test
    public static void testValeur() {
        System.out.println("valeur");
        Jour j = null;
        Action instance = null;
        float expResult = 0.0F;
        float result = instance.valeur(j);
        Assertions.assertEquals(expResult, result, 0.0);
    }
}
