package traducaocolaborativa

class Texto {
    String textoOriginal
    Boolean traduzido = false
    String textoTraduzido
    String emailAutor
    String emailTradutor
    Integer idLocal

    Date lastUpdated;
    Date dateCreated;


    static constraints = {
        idLocal nullable: true;
        textoTraduzido nullable: true
        textoOriginal size: (3..144)
        textoTraduzido size: (3..144)
        emailTradutor nullable: true
        emailTradutor email: true
        emailAutor email: true
    }

    static mapping = {
        autoTimestamp(true)
    }
}
