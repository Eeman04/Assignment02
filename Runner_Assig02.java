/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assig02;

public class Runner_Assig02 {

    public static void main(String[] args) {
     
        EmailAdress from = new EmailAdress("from@abc.def.com");
        EmailAdress to = new EmailAdress("to@abc.def.edu");
        String subj = "Subject of email";
        String p = "These are the contents of email";

        Email e1= new Email (from,to,subj,p);
        System.out.println(e1);
        BookChap bookChapter = new BookChap("Inheritance", 11,"These are the contents of email" );         
        System.out.println(bookChapter);
    
        
    }
    
}
