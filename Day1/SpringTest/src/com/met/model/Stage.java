package com.met.model;

public class Stage {

	private Stage(){
		System.out.println("Default private Stage constructore invoked");
	}
	
	private static Stage stage = null;
	
	public static Stage getStage(){
		
		
		if(stage == null){
			stage = new Stage();
		}
		
		return stage;
	}
	
}
