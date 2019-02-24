package hw1;

import java.util.ArrayList;

public class library {

	ArrayList<P>  pr =new ArrayList();



	public int getNum() {

		// TODO Auto-generated method stub

		int sum=0;

			for (int i =0;i<pr.size();i++){

			sum+=pr.get(i).number;}

		return sum;
		}



	public void add(P p) {

		// TODO Auto-generated method stub

		pr.add(p);

	}



	public int getcost() {

		// TODO Auto-generated method stub

		int sum=0;

		for (int i =0;i<pr.size();i++) {

		

			sum=sum+pr.get(i).cost;}

		return sum;}
	}


