package models;

public class TaxiReservationData {

	private String origen;
	private String destino; 
	private String fecha;
	private String hora;
	private String pasajeros;
	
	public TaxiReservationData(String origen, String destino, String fecha, String hora, String pasajeros) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.fecha = fecha;
		this.hora = hora;
		this.pasajeros = pasajeros;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(String pasajeros) {
		this.pasajeros = pasajeros;
	}
	
	
}
