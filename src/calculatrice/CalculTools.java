/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculatrice;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class CalculTools {

    public CalculTools() {
    }
    public boolean isDouble(String n){
        try{
           Double.parseDouble(n);
           return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
   /* public boolean ajoutOperation(ArrayList l){
        if(l.get(l.size()-1)!="+" && l.get(l.size()-1)!="-" && l.get(l.size()-1)!="*" && l.get(l.size()-1)!="/"){
            return true;
        }
        return false;
    }*/
    public Double operation(ArrayList<String> l){
        int i=1;
        Double resultat;
        while(i<(l.size()-1)){
            String val=l.get(i);
            switch (val) {
                case "+":
                    if(l.size()-1>=i+2 && "*".equals(l.get(i+2))){
                        resultat=Double.parseDouble(l.get(i+1))*Double.parseDouble(l.get(i+3));
                        l.remove(i+3);
                        l.remove(i+2);
                        l.set(i+1, resultat.toString());
                    }else if(l.size()-1>=i+2 && "/".equals(l.get(i+2))){
                        resultat=Double.parseDouble(l.get(i+1))/Double.parseDouble(l.get(i+3));
                        l.remove(i+3);
                        l.remove(i+2);
                        l.set(i+1, resultat.toString());
                    }else{
                        resultat=Double.parseDouble(l.get(i-1))+Double.parseDouble(l.get(i+1));
                        l.remove(i+1);
                        l.remove(i);
                        l.set(i-1, resultat.toString());
                    }
                     
                    break;
                case "-":
                    if(l.size()-1>=i+2 && "*".equals(l.get(i+2))){
                        resultat=Double.parseDouble(l.get(i+1))*Double.parseDouble(l.get(i+3));
                        l.remove(i+3);
                        l.remove(i+2);
                        l.set(i+1, resultat.toString());
                    }else if(l.size()-1>=i+2 && "/".equals(l.get(i+2))){
                        resultat=Double.parseDouble(l.get(i+1))/Double.parseDouble(l.get(i+3));
                        l.remove(i+3);
                        l.remove(i+2);
                        l.set(i+1, resultat.toString());
                    }else{
                        resultat=Double.parseDouble(l.get(i-1))-Double.parseDouble(l.get(i+1));
                        l.remove(i+1);
                        l.remove(i);
                        l.set(i-1, resultat.toString());
                    }
                     
                    break;
                case "*":
                    resultat=Double.parseDouble(l.get(i-1))*Double.parseDouble(l.get(i+1));
                    l.remove(i+1);
                    l.remove(i);
                    l.set(i-1, resultat.toString());
                     
                    break;
                case "/":
                    resultat=Double.parseDouble(l.get(i-1))/Double.parseDouble(l.get(i+1));
                    l.remove(i+1);
                    l.remove(i);
                    l.set(i-1, resultat.toString()); 
                    
                    break;
            }
            i=1;
        }
        return Double.parseDouble(l.get(0));
        
    }

    /* private void affiche(ArrayList L) {
    for (int i = 0; i < L.size(); i++) {
    System.out.print(L.get(i));
    }
    System.out.println("");
    } */
    public void changeOperator(ArrayList<String> l, String operation){
        if("+".equals(l.get(l.size()-1)) || "-".equals(l.get(l.size()-1)) || "*".equals(l.get(l.size()-1)) || "/".equals(l.get(l.size()-1))){
            l.set(l.size()-1, operation);
        }
    }
    public String writeDoubleinInt(String s){
        StringBuilder result=new StringBuilder(s);
        int index=result.indexOf("."),i;
        i=index+1;
        boolean trouver=true;
        while(i<result.length() && trouver){
            if('0'==result.charAt(i)){
                i++;
            }else{
                trouver=false;
            }            
        }
        if(trouver){
            for (int j =result.length()-1; j >= index; j--) {
                result.deleteCharAt(j);
            }
        } 
        return result.toString();
    }
}
