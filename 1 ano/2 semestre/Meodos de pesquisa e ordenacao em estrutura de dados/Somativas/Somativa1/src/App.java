
public class App {
    public static void main(String[] args) throws Exception  {

        Lista l = new Lista();
        System.out.print("Inserindo elementos na lista\n");
        l.insereUltimo (1);
        l.insereUltimo (2);
        l.insereUltimo (3);
        l.insereUltimo (4);
        l.insereUltimo (5);
        l.insereUltimo (6);
        l.insereUltimo (7);
        l.mostrar();
        //remover
        System.out.print("Excluindo o primeiro elemento\n");
        l.removePrimeiro();
        l.mostrar();
        System.out.print("Excluindo o ultimo elemento\n");
        l.removeUltimo();
        l.mostrar();
        System.out.print("Excluindo o elemento informado\n");
        l.remove( 3);
        l.mostrar();
    }
}
