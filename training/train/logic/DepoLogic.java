package com.training.train.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.training.exproject.entity.MainTrain;
import com.training.train.bean.Depo;
import com.training.train.bean.Train;

public class DepoLogic {


	public void  bubbleSortByNumber(Depo trains) {
		List<Train> list = trains.getTrains();
		Train temp;
		boolean sorted = false;

		while (!sorted) {
			sorted = true;
			for (int i = 0; i < list.size() - 1; i++) {
				if (list.get(i).getNumberOfTrain() > (list.get(i + 1).getNumberOfTrain()) ) {
					temp = list.get(i);
					list.set(i, list.get(i + 1));
					list.set(i + 1, temp);
					sorted = false;
				}
			}
		}
	}

	public void sortByDepartureAndTime(List<Train> trains) {
		Collections.sort(trains, new Comparator<Train>() {
			public int compare(Train t1, Train t2) {
				if (t1.getDastinationOfTrain() == t2.getDastinationOfTrain()) {
					return t1.getTrainDate().compareTo(t2.getTrainDate());
				} else {
					return t1.getDastinationOfTrain().compareTo(t2.getDastinationOfTrain());

				}
			}
		});
	}

	public void find(int number, List<Train> trains) {
		for (Train t : trains) {
			if (t.getNumberOfTrain() == number) {
				System.out.print("Departure Place: " + t.getDastinationOfTrain() + ", " + "Train Number: "
						+ t.getNumberOfTrain() + ", " + "Departure Time : " + t.getTrainDate());
				System.out.println();
			}
		}

	}

}