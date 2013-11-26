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
public class Specialite implements Comparable<Specialite>{
    private String nom;
    private Collection<Med> lesMeds=new TreeSet<Med>();

    public Specialite(String nom) {
        this.nom = nom;
    }

    public Collection<Med> getLesMeds() {
        return lesMeds;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public int compareTo(Specialite s) {      
            return nom.compareTo(s.nom);
    }

    void addUnMed(Med unMed) {
       this.lesMeds.add(unMed); 
    }
}
