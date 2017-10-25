package unidad2;

public class ListaDoble {
	
	Nodo head;
	
	public Nodo getHead() {
		return head;
	}

	public void setHead(Nodo head) {
		this.head = head;
	}

	public ListaDoble() {
		this.setHead(null);
	}
	
	public boolean isVacio(){
		return this.getHead()==null ? true : false;
	}
	
	public void agregarp(Musica p){
		Nodo np = new Nodo();
		np.setDato(p);
		if(this.isVacio()) {
			this.setHead(np);
			np.setAnterior(null);
			np.setSiguiente(null);
		}
		else {
			this.getHead().setAnterior(np);
			np.setAnterior(null);
			np.setSiguiente(this.getHead());
			this.setHead(np);
		}
	}
	
	public void agregaru(Musica p){
		Nodo np = new Nodo();
		np.setDato(p);
		if(this.isVacio()) {
			this.setHead(np);
			np.setAnterior(null);
			np.setSiguiente(null);
		}
		else {
			Nodo temporal = new Nodo();
			temporal=this.getHead();
			while(temporal.getSiguiente()!=null){
				temporal=temporal.getSiguiente();
			}
			np.setAnterior(temporal);
			temporal.setSiguiente(np);
		}
	}
	
	public void elimianrp(){
		Nodo eliminar = new Nodo();
		eliminar = this.getHead().getSiguiente();
		this.setHead(eliminar);
		eliminar.setAnterior(null);
	}
	
	public void elimianru(){
		Nodo eliminar = new Nodo();
		Nodo temporal = new Nodo();
		temporal=this.getHead();
		while(temporal.getSiguiente()!=null){
			temporal=temporal.getSiguiente();
		}
		eliminar=temporal;
		temporal=temporal.getAnterior();
		eliminar.setAnterior(null);
		temporal.setSiguiente(null);
	}
	
	public StringBuilder adelante(){
		StringBuilder cadena = new StringBuilder();
		Nodo temporal = new Nodo();
		temporal=this.getHead();
		cadena.append("HEAD<--->");
		while(temporal!=null){
			cadena.append(temporal.getDato());
			cadena.append("<--->");
			temporal=temporal.getSiguiente();
		}
		cadena.append("NULL");
		return cadena;
	}
	
	public StringBuilder atras(){
		StringBuilder cadena = new StringBuilder();
		Nodo temporal = new Nodo();
		temporal=this.getHead();
		cadena.append("NULL<-->");
		while(temporal.getSiguiente()!=null){
			temporal=temporal.getSiguiente();
		}
		
		while(temporal!=null){
			cadena.append(temporal.getDato());
			cadena.append("<-->");
			temporal=temporal.getAnterior();
		}
		cadena.append("HEAD");
		return cadena;
	}
}