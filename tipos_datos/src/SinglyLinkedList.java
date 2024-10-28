public class SinglyLinkedList {
    Nodo cabeza;
    public SinglyLinkedList(){
        this.cabeza=null;
    }
    public void insertar(Integer dato){
        Nodo nuevoNodo=new Nodo(dato);
        if(cabeza==null){
            cabeza=nuevoNodo;
        }else{
            Nodo temp=cabeza;
            while(temp.siguiente!=null){
                temp=temp.siguiente;
            }
            temp.siguiente=nuevoNodo;
        }

    }
    public void mostrar(){
        Nodo temp= cabeza;
        while(temp!=null){
            System.out.print(temp.dato+"-> ");
            temp=temp.siguiente;
        }
        System.out.println("null");
    }

    public Boolean buscar(Integer value){
        if(cabeza==null){
            System.out.println("lista vacia");
            return false;
        }else{
            Nodo temp=cabeza;
            while(temp!=null){
                if(temp.dato==value){
                    System.out.println("valor encontrado");
                    return true;
                }
                temp=temp.siguiente;
            }
            System.out.println("valor no encontrado");
            return false;
        }
    }

    public void eliminar(Integer value){
        System.out.println(cabeza.dato);
        if(cabeza==null){
            System.out.println("lista vacia");
        }else{
            Nodo temp=cabeza;boolean done=false;
            if(cabeza.dato==value){
                cabeza=temp.siguiente;done=true;
            }
            while(temp!=null&&!done){
                System.out.println(temp.dato+"|"+temp.siguiente.dato);
                if(temp.siguiente.dato==value){
                    if(temp.siguiente.siguiente==null){
                        temp.siguiente=null;
                        done=true;
                    }else{
                        temp.siguiente=temp.siguiente.siguiente;
                        done=true;
                    }
                }
                temp=temp.siguiente;
            }
            
        }
    }
}
