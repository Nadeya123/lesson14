package com.training.exproject.entity;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import com.training.train.bean.Depo;
import com.training.train.bean.Month;
import com.training.train.bean.Train;
import com.training.train.logic.DepoLogic;
import com.training.train.view.DepoView;

public class MainTrain {

	public static void main(String[] arg) {

		Date date1 = new Date(2022 - 1900, Month.NOVEMBER, 1, 12, 45);
		Date date2 = new Date(2022 - 1900, Month.NOVEMBER, 5, 10, 24);
		Date date3 = new Date(2022 - 1900, Month.NOVEMBER, 4, 18, 15);
		Date date4 = new Date(2022 - 1900, Month.NOVEMBER, 2, 9, 40);
		Date date5 = new Date(2022 - 1900, Month.NOVEMBER, 1, 4, 10);

		Train t1 = new Train(5426, "Minsk - Berlin", date1);
		Train t2 = new Train(5896, "Berlin - Riga", date2);
		Train t3 = new Train(7456, "Riga - Warsaw", date3);
		Train t4 = new Train(1496, "Berlin - Riga", date4);
		Train t5 = new Train(7115, "Wiena - Praga", date5);

		Depo trains = new Depo();
		trains.addTrains(t1);
		trains.addTrains(t2);
		trains.addTrains(t3);
		trains.addTrains(t4);
		trains.addTrains(t5);

		DepoLogic dl = new DepoLogic();

		dl.bubbleSortByNumber(trains);

		DepoView dv = new DepoView();
		dv.print(trains.getTrains());
System.out.println("===========================================");
		dl.find(7456, trains.getTrains());

		dl.sortByDepartureAndTime(trains.getTrains());
		dv.print(trains.getTrains());

	}
}
