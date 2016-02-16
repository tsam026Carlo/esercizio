package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Gestisce le parcelle dei propri Clienti.
 *
 */
public class Commercialista {

	private Map<String,Cliente> clienti = new HashMap<>();
	
	/**
	 * Calcola il totale delle parcelle di tutti i clienti univoci (ovvero NON
	 * vengono considerati le parcelle di eventuali clienti duplicati). 
	 * @return il totale delle parcelle
	 */
	public int totaleParcelle() {
		
		 int tmp=0;
		 Iterator it = clienti.entrySet().iterator();
		  while (it.hasNext()) {
		    Map.Entry entry = (Map.Entry)it.next();
		    Cliente c=clienti.get(entry.getKey());
		    tmp+=(int)c.calcolaParcella();
		  }
		return tmp;
	}
	public int totaleClienti() {
		return clienti.size();
	}
	
	/**
	 * Inserisce un nuovo cliente, verificando che
	 * non sia già stato inserito.
	 * @param d dipendente
	 */
	public void addCliente(Cliente d) {
		Boolean ctrl=true;
		if(clienti.get(d.getCF())!=null){
		clienti.get(d.getCF()).duplicato+=1;
		ctrl=false;
		}
		if(ctrl){
			clienti.put(d.getCF(),d);
		}
	}
	
	
	/**
	 * Restituisce il numero di volte che all'atto dell'inserimento di
	 * un cliente, il cliente era già stato inserito. 
	 * @return
	 */
	public int clientiDuplicati() {
		 int tmp=0;
		 Iterator it = clienti.entrySet().iterator();
		  while (it.hasNext()) {
		    Map.Entry entry = (Map.Entry)it.next();
		    tmp+=Math.round(clienti.get(entry.getKey()).duplicato);
		  }
		return tmp;
	}
	
	/**
	 * Dato un cliente, restituisce il numero di volte che lo stesso
	 * cliente è stato inserito tramite le funzione addCliente.
	 * Nel caso che un dato cliente sia stato inserito una sola volta,
	 * restituisce il valore 1. 
	 * @param d cliente da verificare
	 * @return numero di ripetizioni.
	 */
	public int numeroRipetizioni(Cliente d) {
		int tmp=0;
		tmp=clienti.get(d.getCF()).duplicato;
		return tmp+1;
	}

}
