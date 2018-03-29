package stny;

import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leepe
 */
public class Search {
    
    public String TextBoxSearch() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line = input.readLine();
        return line;
    } 
    
    public void MaterialSearch(){
        String material = null;
        
        if(material.equals("Books")){   //Book selected
            
        }
        else if(material.equals("Videos")){  //Video selected
            
        }
        else if(material.equals("Articles")){  //Article selected
            
        }
        else{   //All is selected.
            
        }        
    }    
}
