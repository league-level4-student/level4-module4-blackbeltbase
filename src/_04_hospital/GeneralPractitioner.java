package _04_hospital;

import java.util.ArrayList;

public class GeneralPractitioner extends Doctor{
	ArrayList <Patient>pats = new ArrayList <Patient>();
	int numPats = 0;
	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return true;
	}
	public void assignPatient(Patient patient) {
		// TODO Auto-generated method stub
		if(numPats<3) {
		pats.add(patient);
		numPats++;
		}
	}
	public ArrayList getPatients() {
		return pats;
	}
	public void doMedicine() {
		// TODO Auto-generated method stub
		for(int i = 0; i<pats.size();i++) {
			pats.get(i).checkPulse();
		}
	}

}
