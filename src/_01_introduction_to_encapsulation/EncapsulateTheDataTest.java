package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;

import org.junit.Test;

public class EncapsulateTheDataTest {
@Test
public void testGettersAndSetters() {
	EncapsulateTheData data = new EncapsulateTheData();
	Robot r = null;
	try {
		r = new Robot();
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	data.setMemberObj(r);
	data.setNomenclature("");
	data.setItemsReceived(0);
	try {
		data.setDegreesTurned(-50);
		assertEquals(data.getDegreesTurned(),90);
	} catch (IllegalStateException e) {
		e.printStackTrace();
	}
	assertEquals(data.getItemsRecieved(),0);
	assertEquals(data.getNomenclature()," ");
	
}
}
