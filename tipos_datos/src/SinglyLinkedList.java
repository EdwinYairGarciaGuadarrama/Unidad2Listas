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
            while(temp.getNodo()!=null){
                temp=temp.getNodo();
            }
            temp.setNodo(nuevoNodo);;
        }

    }
    public void mostrar(){
        Nodo temp= cabeza;
        while(temp!=null){
            System.out.print(temp.getDato()+"-> ");
            temp=temp.getNodo();
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
                if(temp.getDato()==value){
                    System.out.println("valor encontrado");
                    return true;
                }
                temp=temp.getNodo();
            }
            System.out.println("valor no encontrado");
            return false;
        }
    }

    public void eliminar(Integer value){
        System.out.println(cabeza.getDato());
        if(cabeza==null){
            System.out.println("lista vacia");
        }else{
            Nodo temp=cabeza;boolean done=false;
            if(cabeza.getDato()==value){
                cabeza=temp.getNodo();done=true;
            }
            while(temp!=null&&!done){
                System.out.println(temp.getDato()+"|"+temp.getNodo().getDato());
                if(temp.getNodo().getDato()==value){
                    if(temp.getNodo().getNodo()==null){
                        temp.setNodo(null);
                        done=true;
                    }else{
                        temp.setNodo(temp.getNodo().getNodo());
                        done=true;
                    }
                }
                temp=temp.getNodo();
            }
            
        }
    }
}
