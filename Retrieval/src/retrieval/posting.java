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
public class posting {
    private  retrieval document;

    public posting(retrieval document) {
        this.document = document;
    }

    public retrieval getDocument() {
        return document;
    }

    public void setDocument(retrieval document) {
        this.document = document;
    }
    
}
