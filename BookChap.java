/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assig02;


public class BookChap extends Text {
    
    //two datafields
    private String title;
    private int chapNo;
    
    //constructor
    public BookChap(String title, int chapNo, String p)
    {
        super(p);
        this.title= title;
        this.chapNo= chapNo;
        
    }
    
    public void settitle(String title){
        this.title=title;
    }
    public String gettitle(){
        return title;
    }
     public void setchapNo(int chapNo){
        this.chapNo=chapNo;
    }
    public int getChapNo(){
        return chapNo;
    }
    
    @Override
   public String toString(){
       return ("Title of the book is" +title + " \n Chapter number is " +chapNo);
   }
    
}
