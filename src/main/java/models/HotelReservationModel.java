package models;

public class HotelReservationModel {

	private String destination;
	private String checkIn;
	private String checkOut;

	public HotelReservationModel(String destination, String checkIn, String checkOut) {
		this.destination = destination;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	public String getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}
}
