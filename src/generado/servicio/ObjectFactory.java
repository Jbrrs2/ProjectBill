
package servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ObtenerUsuarios_QNAME = new QName("http://servicio/", "obtenerUsuarios");
    private final static QName _ObtenerUsuarioResponse_QNAME = new QName("http://servicio/", "obtenerUsuarioResponse");
    private final static QName _ObtenerUsuariosResponse_QNAME = new QName("http://servicio/", "obtenerUsuariosResponse");
    private final static QName _Usuario_QNAME = new QName("http://servicio/", "usuario");
    private final static QName _ObtenerUsuario_QNAME = new QName("http://servicio/", "obtenerUsuario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerUsuarios }
     * 
     */
    public ObtenerUsuarios createObtenerUsuarios() {
        return new ObtenerUsuarios();
    }

    /**
     * Create an instance of {@link ObtenerUsuario }
     * 
     */
    public ObtenerUsuario createObtenerUsuario() {
        return new ObtenerUsuario();
    }

    /**
     * Create an instance of {@link ObtenerUsuarioResponse }
     * 
     */
    public ObtenerUsuarioResponse createObtenerUsuarioResponse() {
        return new ObtenerUsuarioResponse();
    }

    /**
     * Create an instance of {@link ObtenerUsuariosResponse }
     * 
     */
    public ObtenerUsuariosResponse createObtenerUsuariosResponse() {
        return new ObtenerUsuariosResponse();
    }

    /**
     * Create an instance of {@link UsuarioResponse }
     * 
     */
    public UsuarioResponse createUsuarioResponse() {
        return new UsuarioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "obtenerUsuarios")
    public JAXBElement<ObtenerUsuarios> createObtenerUsuarios(ObtenerUsuarios value) {
        return new JAXBElement<ObtenerUsuarios>(_ObtenerUsuarios_QNAME, ObtenerUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "obtenerUsuarioResponse")
    public JAXBElement<ObtenerUsuarioResponse> createObtenerUsuarioResponse(ObtenerUsuarioResponse value) {
        return new JAXBElement<ObtenerUsuarioResponse>(_ObtenerUsuarioResponse_QNAME, ObtenerUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "obtenerUsuariosResponse")
    public JAXBElement<ObtenerUsuariosResponse> createObtenerUsuariosResponse(ObtenerUsuariosResponse value) {
        return new JAXBElement<ObtenerUsuariosResponse>(_ObtenerUsuariosResponse_QNAME, ObtenerUsuariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "usuario")
    public JAXBElement<UsuarioResponse> createUsuario(UsuarioResponse value) {
        return new JAXBElement<UsuarioResponse>(_Usuario_QNAME, UsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "obtenerUsuario")
    public JAXBElement<ObtenerUsuario> createObtenerUsuario(ObtenerUsuario value) {
        return new JAXBElement<ObtenerUsuario>(_ObtenerUsuario_QNAME, ObtenerUsuario.class, null, value);
    }

}
