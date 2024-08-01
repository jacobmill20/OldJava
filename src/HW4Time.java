public class HW4Time{
	public static void main(String[] args){

		Time now = new Time();
		System.out.print("Now it is ");
		now.printTime();
		System.out.println();

		Time time1 = new Time(555550000);
		System.out.print("time1 is ");
		time1.printTime();
		Time time2 = new Time(5, 23, 55);
		System.out.print("time2 is ");
		time2.printTime();
	}
}

class Time {

	private int hour;
	private int minute;
	private int second;

	public Time(){
		long elapseTime = System.currentTimeMillis();
		int twelveHourCycles = (int)(elapseTime/43200000);
		int timeNow = (int)(elapseTime-(twelveHourCycles*43200000)); //Subtract away all fully completed twelve hour cycles so that I'm left with only the milliseconds of the current twelve hour cycle

		hour = (int)(timeNow/3600000);		//convert milliseconds to hours, minutes, and seconds
		timeNow = timeNow-(hour*3600000);
		minute = (int)(timeNow/60000);
		timeNow = timeNow-(minute*60000);
		second = (int)(timeNow/1000);
	}

	public Time(long elapseTime){
		int twelveHourCycles = (int)(elapseTime/43200000);
		int timeNow = (int)(elapseTime-(twelveHourCycles*43200000));

		hour = (int)(timeNow/3600000);
		timeNow = timeNow-(hour*3600000);
		minute = (int)(timeNow/60000);
		timeNow = timeNow-(minute*60000);
		second = (int)(timeNow/1000);
	}

	public Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour(){
		return hour;
	}

	public int getMinute(){
		return minute;
	}

	public int getSecond(){
		return second;
	}

	public void setTime(long elapseTime){
		int twelveHourCycles = (int)(elapseTime/43200000);
		int timeNow = (int)(elapseTime-(twelveHourCycles*43200000));

		hour = (int)(timeNow/3600000);
		timeNow = timeNow-(hour*3600000);
		minute = (int)(timeNow/60000);
		timeNow = timeNow-(minute*60000);
		second = (int)(timeNow/1000);
	}


	public void printTime(){
		System.out.println(hour + ":" + minute + ":" + second);
	}

}//End Time