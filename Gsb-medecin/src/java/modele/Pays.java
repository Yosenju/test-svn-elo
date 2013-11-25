/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.Collection;

/**
 *
 * @author elo
 */
public class Pays {
    private Collection<Dep> lesDeps;
    private Collection<Specialite> lesSpe;

    public Pays() {
        lesDeps=DAO.getLesDeps();
        lesSpe=DAO.getLesSpe();
    }

    public Collection<Dep> getLesDeps() {
        return lesDeps;
    }
    
    public Collection<Dep> getLesSpe() {
        return lesSpe;
    }
    
    public Dep getLeDep(String num) {
        for (Dep d : lesDeps) {
            if (d.getNum().equals(num)) {
                return d;
            }
        }
        return null;
    }
    
}
