public class No {
    private Integer informacao;
    private No proximo;

    public No(){
        informacao = null;
        proximo = null;
    }
    public void setInfo(Integer informacao){
        this.informacao = informacao;
    }
    public void setProx(No proximo){
        this.proximo = proximo;
    }
    public No getProx(){
        return this.proximo;
    }
    public Integer getInfo() {
        return this.informacao;
    }
}