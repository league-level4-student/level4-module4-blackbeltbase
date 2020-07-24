package _04_hospital;

import java.util.ArrayList;

public class Doctor extends Hospital{
	ArrayList <Patient>pats = new ArrayList <Patient>();
	int numPats = 0;
	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		// TODO Auto-generated method stub
		if(numPats<3) {
		pats.add(patient);
		numPats++;
		}
		else {
			throw new DoctorFullException();
		}
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		
	}
	public ArrayList getPatients() {
		return pats;
	}
}
