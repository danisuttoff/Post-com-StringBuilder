
/*https://github.com/acenelio/composition1-java
 */
package aplicação;
import entidades.Comentario;
import entidades.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class App {

    public static void main(String[]args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comentario c1 = new Comentario("Tô nem ai, tô nem ai, pode ficar no seu mundinho que eu tô nem ai!");
        Comentario c2 = new Comentario("eu acho que no fundo todo mundo é louco e perturbado, mas a gente tem q fingir q n é!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
               "Ir mais na academia",
                "Segunda vou voltar para academia",12 );
        p1.addComentario(c1);
        p1.addComentario(c2);


        Comentario c3 = new Comentario("Japonês com dentes bons");
        Comentario c4 = new Comentario("Estudar inteligência artificial");
        Post p2 = new Post(sdf.parse("17/10/2018 19:05:44"),
                "Japão",
                "Segunda vou para o Japão",1278 );
        p2.addComentario(c3);
        p2.addComentario(c4);


        System.out.println(p1);
        System.out.println(p2);


    }
}
