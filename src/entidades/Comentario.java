package entidades;
/*https://github.com/acenelio/composition1-java
 */
public class Comentario {
    private String texto;

    public Comentario(){};
    public Comentario(String texto){
        this.texto = texto;
    }

    public String getTexto(){
        return texto;
    }

    public void setTexto(String texto){
        this.texto = texto;
    }
}
