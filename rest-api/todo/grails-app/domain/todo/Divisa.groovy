package todo


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Divisa {
	String descripcion
	String calle
	String tipo
	String codigo_postal
	String delegacion
	int id_usuario
	int id
	Date fecha
    int version

}