package todo


import grails.rest.*
import grails.converters.*

class ActivasController extends RestfulController {
    static responseFormats = ['json', 'xml']
	ActivasController() {
        super(Divisa)
    }
    
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
