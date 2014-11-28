import traducaocolaborativa.Texto

class BootStrap {

    def init = { servletContext ->
        new Texto(emailAutor: "luizromariofilho@gmail.com", textoOriginal: "The book's on the table.").save()
        new Texto(emailAutor: "luizromariofilho@gmail.com", textoOriginal: "You know nothing innocent.").save()
        new Texto(emailAutor: "luizromariofilho@gmail.com", textoOriginal: "Black Friday is cheat.").save()
        new Texto(emailAutor: "luizromariofilho@gmail.com", textoOriginal: "Software developed with Grails and Android.").save()
    }
    def destroy = {
    }
}
