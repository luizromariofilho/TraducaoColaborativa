package traducaocolaborativa

import grails.rest.RestfulController

class TextoController extends RestfulController {

    static responseFormats = ['json', 'xml']

    TextoController(){
        super(Texto)
    }
}
