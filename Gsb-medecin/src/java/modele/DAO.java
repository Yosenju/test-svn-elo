/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author elo
 */
public class DAO {
    static void charge(Pays d) {
        try {
            Connection con = Connect.get();
            Statement req;
            req = con.createStatement();
            ResultSet rs = req.executeQuery("select * from ");
            rs.next();
            d.setNom(rs.getString("nom"));
            d.setLieu(rs.getString("lieu"));
            d.setDate(rs.getDate("dateb"));


            Statement reqT = con.createStatement();
            ResultSet rsT = reqT.executeQuery("select * from type");

            while (rsT.next()) {
                Statement reqE = con.createStatement();
                ResultSet rsE = reqE.executeQuery("select * from emplacement where idtype="
                                                    + rsT.getString("id")  );
                Collection<Emplacement> colEmp = new HashSet<Emplacement>();
                while (rsE.next()) {
                    Emplacement e = new Emplacement(rsE.getString("code"),rsE.getString("nomab"));
                    colEmp.add(e);
                }
                
                Type t = new Type(rsT.getString("id"),rsT.getString("description"),rsT.getDouble( "prix"),colEmp);
                b.addType(t);
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
