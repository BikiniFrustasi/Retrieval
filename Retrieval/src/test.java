
import retrieval.retrieval;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class test {
    public static void main(String[] args){
        retrieval doc1 = new retrieval();
        String result[]= doc1.getListofTerm();
        for (int i = 0; i < 10; i++) {
            System.out.println("term"+i+" = "+result[i]);
            
        }
        
    }
}
