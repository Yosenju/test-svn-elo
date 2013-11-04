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
public class Dep {
    
    private String num;
    private Collection<Med> lesMeds;

    public Dep(String num, Collection<Med> lesMeds) {
        this.num = num;
        this.lesMeds = lesMeds;
    }

    public Collection<Med> getLesMeds() {
        return lesMeds;
    }

    public String getNum() {
        return num;
    }
    
    
    
}
