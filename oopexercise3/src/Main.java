/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class Main {
     public static void main(String[] args) {
		Bag colour = new Bag("Pink.");
		Bag size = new Bag("The bag's zipper is opened.");
		
		System.out.println("" + colour.getcolour() + " " +  size.getcolour());
	}
}
