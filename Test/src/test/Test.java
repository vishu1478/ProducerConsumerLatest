package test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException {
		Test t=new Test();
		Long epoch2=null;
		//epoch2=t.findEpoch("2018-07-13 08:06");
		epoch2=t.findEpoch("13/07/2018 08:06");
		System.out.println(epoch2);

		
	}
	public long findEpoch(String userTime) throws ParseException {
		String userTime2=userTime+":00.000";
		//SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	  SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
		Date date=sdf.parse(userTime2);
		Long epoch=date.getTime();
		return epoch;
	}
	


}
