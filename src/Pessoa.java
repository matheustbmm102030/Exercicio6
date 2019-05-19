
public class Pessoa {
    private String nome,endereço,telefone;
    
    public Pessoa(String N,String E,String T){
        setNome(N);
        setEnd(E);
        setTel(T);
    }
    
    
    void setNome(String N){ this.nome=N;}
    void setEnd(String E){ this.endereço=E;}
    void setTel(String T){ this.telefone=T;}
    
    String getNome(){ return this.nome;}
    String getEnd(){ return this.endereço;}
    String getTEL(){ return this.telefone;}
}
