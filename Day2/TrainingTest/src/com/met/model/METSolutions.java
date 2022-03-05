package com.met.model;

public class METSolutions implements TrainingCompany{

	private Trainer trainer;

	public METSolutions(Trainer trainer) {
		super();
		this.trainer = trainer;
		System.out.println("METSolutions paramtererized constructor invoked");
	}

	public METSolutions() {
		super();
		System.out.println("METSolutions default constructor invoked");
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	@Override
	public void conductTraining() {
		
		System.out.println("METSolutions :: conductTraining");
		trainer.train();
		
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "METSolutions is a Training Company";
	}
}
