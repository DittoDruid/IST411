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
    
    public void TextBoxSearch(){
        
    }
    
    public void MaterialSearch(){
        String material = null;
        
        if(material.equals("Book")){   //Book selected
            
        }
        else if(material.equals("Video")){  //Video selected
            
        }
        else if(material.equals("Article")){  //Article selected
            
        }
        else{   //All is selected.
            
        }        
    }
    
    public String readFromKeyboard() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line = input.readLine();
        return line;
    }    
    
}
