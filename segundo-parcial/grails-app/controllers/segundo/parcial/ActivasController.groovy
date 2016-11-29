package segundo.parcial

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import grails.converters.JSON
import grails.plugin.springsecurity.annotation.Secured
@Transactional(readOnly = true)
@Secured(['ROLE_ADMIN'])

class ActivasController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def consultar(Integer max) {
        def versionStr = params.version
        def valor = Divisa.where{
            version==versionStr
        } list()
       //findByidAndVersion(consulta,versionStr)

        //render partido1 as JSON
    
        
        render valor as JSON
    }
}

