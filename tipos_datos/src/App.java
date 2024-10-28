public class App {
    public static void main(String[] args) throws Exception {
        SinglyLinkedList lista=new SinglyLinkedList();
        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.insertar(85);
        lista.insertar(40);
        lista.insertar(45);

        lista.mostrar();
        lista.eliminar(45);
        lista.mostrar();
        lista.eliminar(10);
        lista.mostrar();
        lista.eliminar(30);
        lista.mostrar();

    }
}
//----------------------------------------------