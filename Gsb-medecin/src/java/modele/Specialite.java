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
public class Specialite implements Comparable<Specialite>{
    private String nom;
    private Collection<Med> lesMeds;

    public Specialite(String nom, Collection<Med> lesMeds) {
        this.nom = nom;
        this.lesMeds = lesMeds;
    }

    public Collection<Med> getLesMeds() {
        return lesMeds;
    }

    public String getNum() {
        return nom;
    }

    @Override
    public int compareTo(Specialite s) {
        
            return nom.compareTo(s.nom);
    }
}
