package collection.queue.Event;

public class EventMain {
	
	public int ID;
	public String Name;
	public String Startdate;
	public String EndDate;
	public String EventType;
	
	
	public EventMain(int iD, String name, String startdate, String endDate, String eventType) {

		this.ID = iD;
		this.Name = name;
		this.Startdate = startdate;
		this.EndDate = endDate;
		this.EventType = eventType;
	}
	@Override
	public String toString() {
		return "EventMain [ID=" + ID + ", Name=" + Name + ", Startdate=" + Startdate + ", EndDate=" + EndDate
				+ ", EventType=" + EventType + "]";
	}

}
