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
                Collection<Med> lesMeds = new TreeSet<Med>();
                Statement req2;
                req2 = con.createStatement();
                ResultSet rs2 = req2.executeQuery("select * from medecin where departement =" + rs.getString("departement"));
                while (rs2.next()) {
                    Med m = new Med(rs2.getString("nom"), rs2.getString("prenom"), rs2.getString("adresse"), rs2.getString("tel"),
                            rs2.getString("specialitecomplementaire"), rs2.getString("id"));
                    lesMeds.add(m);
                }
                Dep d = new Dep(rs.getString("departement"), lesMeds);
                lesDeps.add(d);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesDeps;


    }
}
