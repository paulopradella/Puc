public class Lista {
    private No primeiro;

    public int tamanho = 0;

    public Lista() {
        primeiro = null;
    }

    public boolean vazia() {
        return primeiro == null;
    }

    public void inserePrimeiro(int info) {

        No auxiliar = new No();
        auxiliar.setInfo(info);
        auxiliar.setProx(primeiro);
        primeiro = auxiliar;
        tamanho ++;
    }

    public void insereDepois(int no, int info){
       No anterior = null;
        No atual = primeiro;

        while (atual != null && atual.getProx() != null) {
            anterior = atual;
            atual = atual.getProx();
            if (anterior.getInfo() == no) {
                No novo = new No();
                novo.setInfo(info);
                anterior.setProx(novo);
                novo.setProx(atual);
                tamanho ++;
            }
        }
    }

    public void insereUltimo(int info) {

        if (vazia() == true) {
            inserePrimeiro(info);
        } else {
            No auxiliar = primeiro;
            while (auxiliar != null && auxiliar.getProx() != null) {
                auxiliar = auxiliar.getProx();
            }
            if (auxiliar.getProx() == null) {
                No novo = new No();
                novo.setInfo(info);
                auxiliar.setProx(novo);
                tamanho ++;
            }
        }
    }

    public void removePrimeiro() {
        primeiro = primeiro.getProx();
        tamanho --;
    }

    public void removeUltimo() {

        if (primeiro == null) {
            removePrimeiro();
        }
        No anterior = null;
        No ultimo = primeiro;
        while (ultimo != null && ultimo.getProx() != null) {
            anterior = ultimo;
            ultimo = ultimo.getProx();
        }
        if (ultimo.getProx() == null){
            anterior.setProx(null);
            tamanho --;
        }
    }

    public void remove(int info) {
        No anterior = null;
        No atual = primeiro;
        while (atual != null && atual.getProx() != null) {
            anterior = atual;
            atual = atual.getProx();
            if (atual.getInfo() == info) {
                anterior.setProx(atual.getProx());
                tamanho--;
            }
        }
    }

    public void mostrar(){
        No auxiliar = primeiro;
        while(auxiliar != null){
            System.out.println(auxiliar.getInfo() + "\n");
            auxiliar = auxiliar.getProx();
        }
    }
}