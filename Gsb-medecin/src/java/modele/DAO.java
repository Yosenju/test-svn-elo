/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elo
 */
public class DAO {

    static Collection<Dep> getLesDeps() {

        Collection<Dep> lesDeps = new TreeSet<Dep>();

        try {
            Connection con = Connect.get();
            Statement req;
            req = con.createStatement();
            ResultSet rs = req.executeQuery("Select distinct departement from medecin;");

            while (rs.next()) {

                Dep d = new Dep(rs.getString("departement"));
                lesDeps.add(d);

//                Collection<Med> lesMeds = new TreeSet<Med>();
//                Statement req2;
//                req2 = con.createStatement();
//                ResultSet rs2 = req2.executeQuery("select * from medecin where departement =" + rs.getString("departement"));
//                while (rs2.next()) {
//                    Med m = new Med(rs2.getString("nom"), rs2.getString("prenom"), rs2.getString("adresse"), rs2.getString("tel"),
//                            rs2.getString("specialitecomplementaire"), rs2.getString("id"));
//                    lesMeds.add(m);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesDeps;
    }

    static Collection<Specialite> getLesSpe() {
        Collection<Specialite> lesSpe = new TreeSet<Specialite>();
        try {
            Connection con = Connect.get();
            Statement req;
            req = con.createStatement();
            ResultSet rs = req.executeQuery("Select distinct specialitecomplementaire from medecin"
                    + " where specialitecomplementaire is not null;");
            while (rs.next()) {
                Specialite s = new Specialite(rs.getString("specialitecomplementaire"));
                lesSpe.add(s);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lesSpe;

    }

    static Collection<Med> getLesMeds() {
        Collection<Med> lesMeds = new TreeSet<Med>();
        try {
            Connection con = Connect.get();
            Statement req;
            req = con.createStatement();
            ResultSet rs = req.executeQuery("select * from medecin ;");
            while (rs.next()) {
                Med m = new Med(rs.getString("nom"), rs.getString("prenom"), rs.getString("adresse"), rs.getString("tel"),
                        rs.getString("specialitecomplementaire"), rs.getString("id"), rs.getString("departement"));
                lesMeds.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesMeds;
    }
}
