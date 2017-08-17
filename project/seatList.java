/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Aldwin Jerome Cabebe
 */
import acm.graphics.*;
import java.util.*;

public class seatList  {

	/* Private instance variables*/
	private String Title = "";
	private GImage Image = null;
	private MyList <Boolean> seats = new  MyList <Boolean>() ;
    

	private	ArrayStack <Integer> ratings = new ArrayStack<>();
	private double ratingAve = 0;
	private int ratingcounter = 0;
	public void MovieDexMovie (String name) {
		Title = name;
                
                seats.createList();
		for(int i = 1; i<= 24; i++ )
			seats.add(i, false); //not yet empty

	}
	public String getTitle() {
		return Title;
	}

	public GImage getImage() {
		if(Image == null) {
			return null;
		}
		else{
			return Image;
		}
	}

	public void setImage(GImage image) {
		Image = image;
	}



	public void AddRating(int rating) {
		ratings.push(rating);
		ratingAve = (ratingAve*ratingcounter + rating)/(ratingcounter+1);
		ratingcounter ++;
	}

	public double getRating(){
		return ratingAve;
	}

	public void reserveSeats(int seatNumber){
		if ( !seats.get(seatNumber) ){
			seats.replace(seatNumber, true);
		}
	}
	public boolean checkseat(int seatNumber ){
		return seats.get(seatNumber);
	}


}
