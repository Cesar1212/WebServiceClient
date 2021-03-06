
package jaxws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SWConvertTemps", targetNamespace = "http://jaxws/", wsdlLocation = "http://localhost:8080/WSTemperatura/SWConvertTemps?wsdl")
public class SWConvertTemps_Service
    extends Service
{

    private final static URL SWCONVERTTEMPS_WSDL_LOCATION;
    private final static WebServiceException SWCONVERTTEMPS_EXCEPTION;
    private final static QName SWCONVERTTEMPS_QNAME = new QName("http://jaxws/", "SWConvertTemps");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WSTemperatura/SWConvertTemps?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SWCONVERTTEMPS_WSDL_LOCATION = url;
        SWCONVERTTEMPS_EXCEPTION = e;
    }

    public SWConvertTemps_Service() {
        super(__getWsdlLocation(), SWCONVERTTEMPS_QNAME);
    }

    public SWConvertTemps_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SWCONVERTTEMPS_QNAME, features);
    }

    public SWConvertTemps_Service(URL wsdlLocation) {
        super(wsdlLocation, SWCONVERTTEMPS_QNAME);
    }

    public SWConvertTemps_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SWCONVERTTEMPS_QNAME, features);
    }

    public SWConvertTemps_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SWConvertTemps_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SWConvertTemps
     */
    @WebEndpoint(name = "SWConvertTempsPort")
    public SWConvertTemps getSWConvertTempsPort() {
        return super.getPort(new QName("http://jaxws/", "SWConvertTempsPort"), SWConvertTemps.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SWConvertTemps
     */
    @WebEndpoint(name = "SWConvertTempsPort")
    public SWConvertTemps getSWConvertTempsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://jaxws/", "SWConvertTempsPort"), SWConvertTemps.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SWCONVERTTEMPS_EXCEPTION!= null) {
            throw SWCONVERTTEMPS_EXCEPTION;
        }
        return SWCONVERTTEMPS_WSDL_LOCATION;
    }

}
