package exemplo_claseinterna;

/**
 *
 * @author acabezaslopez
 */
public class Interna_Metodo {

    public void ver() {

        class Interna {

            public void amosar() {
                System.out.println("desde clase interna método");
            }
        }
        Interna ob = new Interna();
        ob.amosar();
    }
}
