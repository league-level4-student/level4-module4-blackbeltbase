package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
ArrayList <Doctor> docs = new ArrayList <Doctor>();
ArrayList <Patient> pats = new ArrayList <Patient>();
int numPats = 0;
	void addDoctor(Doctor doc) {
		docs.add(doc);
	}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return docs;
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		pats.add(patient);
	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return pats;
	}

	public void assignPatientsToDoctors() throws DoctorFullException {
		// TODO Auto-generated method stub
		for(int i = 0; i<pats.size();i++) {
		if(docs.get(numPats).numPats<3) {
		}
		else {
			numPats++;
		}
		docs.get(numPats).assignPatient(pats.get(i));
		}
	}

}
