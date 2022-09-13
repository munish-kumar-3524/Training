package com.em.been;

public class Train{
	
	private String id;
	private String trainName;
	private String fromLocation;
	private String toLocation;
	private String arrivalTime;
	private String departureTime;
	
	public Train(String id, String trainName, String fromLocation, String toLocation, String arrivalTime,
			String departureTime) {
		super();
		this.id = id;
		this.trainName = trainName;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getFromLocation() {
		return fromLocation;
	}
	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}
	public String getToLocation() {
		return toLocation;
	}
	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	
}
