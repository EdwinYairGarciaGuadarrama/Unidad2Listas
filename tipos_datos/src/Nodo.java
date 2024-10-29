public class Nodo {
    private Integer dato;
    private Nodo siguiente;
    public Nodo(Integer dato){
        this.dato=dato;
    }
    public Integer getDato(){
        return this.dato;
    }public void setDato(Integer a){
        this.dato = a;
    }
    public Nodo getNodo(){
        return this.siguiente;
    }public void setNodo(Nodo a){
        this.siguiente=a;
    }
}
