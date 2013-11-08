/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author elo
 */
public class Med implements Comparable<Med>{

    private String nom;
    private String prenom;
    private String adresse;
    private String tel;
    private String spe;
    private String id;

    public Med(String nom, String prenom, String adresse, String tel, String spe, String id) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.spe = spe;
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSpe() {
        return spe;
    }

    public String getTel() {
        return tel;
    }

    @Override
    public int compareTo(Med t) {
        if (nom.compareTo(t.nom) == 0 ) {
            return prenom.compareTo(t.prenom);
        }
        else {
            return nom.compareTo(t.nom);
        }
    }
    
    
}
