/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assig02;


public class Text {
    //private datamembers of type string and int
    
    private String para [];
    private int currentPara;
    
    //constructor
    public Text(String p){
        para= new String [7];
        currentPara=0;          //default val=0
    }
    //getter and setter method to get that para
    public void setcurrentPara(int p){
      currentPara= p;
      
    }
        public int getcurrentPara(){
            return currentPara;
        }

        public void resetcurrentPara( ){
            currentPara=0;
        }

}
