package Manager;

import Junior_dev.CarModel;
import Junior_dev.Speedlimit;
import Senior_dev.*;

public class Authority {

	public static void main(String[] args) {
		
		CarModel cr = new CarModel();
		Speedlimit sl = new Speedlimit();
		Benz_Car bz = new Benz_Car();
		cr.model();
		sl.speed();
		bz.demo();
	}

}
