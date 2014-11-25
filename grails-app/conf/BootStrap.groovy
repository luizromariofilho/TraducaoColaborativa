import traducaocolaborativa.Texto

class BootStrap {

    def init = { servletContext ->
        new Texto(emailAutor: "luizromariofilho@gmail.com", textoOriginal: "The book's on the table.").save()
        new Texto(emailAutor: "luizromariofilho@gmail.com", textoOriginal: "The book's on the table.").save()
        new Texto(emailAutor: "luizromariofilho@gmail.com", textoOriginal: "The book's on the table.").save()
        new Texto(emailAutor: "luizromariofilho@gmail.com", textoOriginal: "The book's on the table.").save()
    }
    def destroy = {
    }
}
