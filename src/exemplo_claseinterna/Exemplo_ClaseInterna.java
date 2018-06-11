package exemplo_claseinterna;

/**
 *
 * @author acabezaslopez
 */
public class Exemplo_ClaseInterna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*ExternaInterna ei = new ExternaInterna();
        ei.ver();
         */
 /* DENDE A CLASE INTERNA METODO */
        Interna_Metodo im = new Interna_Metodo();
        im.ver();
        /*  ExternaInterna.Interna obxIn = ei.new Interna();//obxecto clase interna
        obxIn.amosar();//só cando a clase non é privada
        //cando a clase é private accedemos a través dun obxecto da clase externa
         */
 /*clase anonima */
        ClaseAnonima ca = new ClaseAnonima();
        ca.operacion();
    }

}
