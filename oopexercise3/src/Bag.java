/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class Bag {
    private String colour;//attribute
		private final Zipper zipper; //component or part

		//constructor
		public Bag(String colour){
			this.colour = colour;
			zipper = new Zipper ();
		}
		
		//accessor
		public String getcolour () {
			return colour;
		}

		//mutator
		public void setcolour(String colour){
			this.colour = colour;
		}  
}
