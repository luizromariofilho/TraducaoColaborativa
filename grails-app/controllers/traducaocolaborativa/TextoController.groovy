package traducaocolaborativa

import grails.converters.JSON
import grails.rest.RestfulController

import java.text.SimpleDateFormat

class TextoController extends RestfulController {

    static responseFormats = ['json', 'xml']

    TextoController(){
        super(Texto)
    }

    def index(){
        def lista = Texto.createCriteria().list {
            between("lastUpdated",new SimpleDateFormat("dd-MM-yyyyH:mm").parse(params.ultimaSincronizacao),new Date())
        };
        render  lista as JSON;
    }

}
