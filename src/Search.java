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
        
        if(material.toLowerCase().equals("books")){   //Book selected
            String book = "book";
        }
        else if(material.toLowerCase().equals("videos")){  //Video selected
            String video = "video";
        }
        else if(material.toLowerCase().equals("articles")){  //Article selected
            String articles = "article";
        }
        else{   //All is selected.
            String all = material;
        }        
    }    
}
