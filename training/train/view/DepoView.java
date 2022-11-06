package com.training.train.view;

import java.util.List;

import com.training.exproject.entity.MainTrain;
import com.training.train.bean.Train;

public class DepoView {

	public void print(List<Train> trains) {
		for (Train tr : trains) {
			System.out.print("\nTrain Number: " + tr.getNumberOfTrain()
					+ "\nDeparture Time = " + tr.getDastinationOfTrain() + "\nTime = " + tr.getTrainDate());
			System.out.println();
		}
	}
}