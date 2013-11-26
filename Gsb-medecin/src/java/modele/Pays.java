/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.Collection;
import java.util.TreeSet;

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
        this.assocMedecins(DAO.getLesMeds());
    }

    public Collection<Dep> getLesDeps() {
        return lesDeps;
    }
    
    public Collection<Specialite> getLesSpe() {
        return lesSpe;
    }
    
    private void assocMedecins(Collection<Med> lesMeds){
        for(Med unMed : lesMeds){
            getLeDep(unMed.getDep()).addUnMed(unMed);
            Specialite uneSpe=getLaSpe(unMed.getSpe());
            if (uneSpe != null){
                uneSpe.addUnMed(unMed);
            }
        }
    }
    
    public Dep getLeDep(String num) {
        for (Dep d : lesDeps) {
            if (d.getNum().equals(num)) {
                return d;
            }
        }
        return null;
    }
    
        public Specialite getLaSpe(String nom) {
        for (Specialite s : lesSpe) {
            if (s.getNom().equals(nom)) {
                return s;
            }
        }
        return null;
    }
}
