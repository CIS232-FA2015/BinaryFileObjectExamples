package cis232.example;

import java.io.Serializable;

public class Rectangle implements Serializable{
	private static final long serialVersionUID = 1L;
	int length;
	int width;
	
	public Rectangle(int l, int w){
		this.length = l;
		this.width = w;
	}
}
