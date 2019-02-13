/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retrieval;

/**
 *
 * @author admin
 */
public class term {
    private String term;
    private postingList termList;

    public term(String term, postingList termList) {
        this.term = term;
        this.termList = termList;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public postingList getTermList() {
        return termList;
    }

    public void setTermList(postingList termList) {
        this.termList = termList;
    }
    
}
