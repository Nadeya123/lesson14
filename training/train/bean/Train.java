package com.training.train.bean;

import java.util.Date;

public class Train {
	
	private int numberOfTrain;
	private String dastinationOfTrain;
	private Date trainDate;
	
	public Train() {
		super();
	}
	
	public Train(int numberOfTrain, String dastinationOfTrain, Date trainDate) {
		super();
		this.numberOfTrain = numberOfTrain;
		this.dastinationOfTrain = dastinationOfTrain;
		this.trainDate = trainDate;
	}

	public int getNumberOfTrain() {
		return numberOfTrain;
	}

	public void setNumberOfTrain(int numberOfTrain) {
		this.numberOfTrain = numberOfTrain;
	}

	public String getDastinationOfTrain() {
		return dastinationOfTrain;
	}

	public void setDastinationOfTrain(String dastinationOfTrain) {
		this.dastinationOfTrain = dastinationOfTrain;
	}

	public Date getTrainDate() {
		return trainDate;
	}

	public void setTrainDate(Date trainDate) {
		this.trainDate = trainDate;
	}

	@Override
	public String toString() {
		return "Train [numberOfTrain=" + numberOfTrain + ", dastonationOfTrain=" + dastinationOfTrain + ", trainDate="
				+ trainDate + ", getNumberOfTrain()=" + getNumberOfTrain() + ", getDastonationOfTrain()="
				+ getDastinationOfTrain() + ", getTrainDate()=" + getTrainDate() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}
