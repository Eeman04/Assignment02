/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assig02;
public class EmailAdress {
    
    private String email;
    
    public EmailAdress(String email){
        this.email=email;
        
    }
    
    @Override
    public String toString(){
        return email;
    }
}
