/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assig02;


public class Email extends Text{
    private EmailAdress from;
    private EmailAdress to;
    private String subj;

    public Email(EmailAdress from, EmailAdress to, String subj, String p){
        super(p);
        this.from=from;
        this.to=to;
        this.subj=subj;
       
     }
    
    @Override
    public String toString(){
        return "\nFrom: " + from + " \nTo: " + to + " \nSubject: " + subj + "\n" + super.toString();
    }
    
    }
    
