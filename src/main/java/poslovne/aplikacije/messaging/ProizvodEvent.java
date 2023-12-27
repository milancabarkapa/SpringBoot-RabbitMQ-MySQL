package poslovne.aplikacije.messaging;

import java.io.Serializable;

import poslovne.aplikacije.proizvodi.Proizvod;

public class ProizvodEvent implements Serializable {
	
	public static ProizvodEvent createNewProizvodEvent(Proizvod noviProizvod){
		ProizvodEvent proizvodEvent = new ProizvodEvent(ProizvodEventType.NEW_PROIZVOD, noviProizvod);
		return proizvodEvent;
	}

	public static ProizvodEvent createDeletedProizvodEvent(Proizvod deletedProizvod){
		ProizvodEvent proizvodEvent = new ProizvodEvent(ProizvodEventType.DELETED_PROIZVOD, deletedProizvod);
		return proizvodEvent;
	}
	
	public static ProizvodEvent createUpdatedProizvodEvent(Proizvod updatedProizvod){
		ProizvodEvent proizvodEvent = new ProizvodEvent(ProizvodEventType.UPDATED_PROIZVOD, updatedProizvod);
		return proizvodEvent;
	}
	
	public static enum ProizvodEventType { NONE, NEW_PROIZVOD, DELETED_PROIZVOD, UPDATED_PROIZVOD };
	
	ProizvodEventType eventType = ProizvodEventType.NONE;
	
	Proizvod proizvod = null;
	
	ProizvodEvent(ProizvodEventType eventType, Proizvod proizvod){
		this.eventType = eventType;
		this.proizvod = proizvod;
	}

	public ProizvodEventType getEventType() {
		return eventType;
	}

	public Proizvod getProizvod() {
		return proizvod;
	}

}
