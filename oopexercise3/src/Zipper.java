/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class Zipper {
    private String size; // Attribute
	
	//Constructor
	public Zipper(){
		size="Large zipper in front";
	}
	
	//Accessor
	public String getZipper(){
		return size;
	}
	
	//mutator
	public void setSize(String size){
		this.size=size;
	}
	
	public String openzipper() {
		return"The bag's zipper is opened.";
	}
	
	public String closezipper(){
		return"The bag's zipper is closed.";
	}  
}
