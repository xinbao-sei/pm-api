
package com.donlim.pm.webservice.ipp;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "DONLIM_IMOS_QUERYSYNC", targetNamespace = "http://www.example.org/DONLIM_IMOS_QUERYSYNC/", wsdlLocation = "http://10.233.0.138:7801/WS/DONLIM/IPP/DONLIM_IPP_QUERYSYNC?wsdl")
public class DONLIMIMOSQUERYSYNC_Service
    extends Service
{

    private final static URL DONLIMIMOSQUERYSYNC_WSDL_LOCATION;
    private final static WebServiceException DONLIMIMOSQUERYSYNC_EXCEPTION;
    private final static QName DONLIMIMOSQUERYSYNC_QNAME = new QName("http://www.example.org/DONLIM_IMOS_QUERYSYNC/", "DONLIM_IMOS_QUERYSYNC");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.233.0.138:7801/WS/DONLIM/IPP/DONLIM_IPP_QUERYSYNC?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DONLIMIMOSQUERYSYNC_WSDL_LOCATION = url;
        DONLIMIMOSQUERYSYNC_EXCEPTION = e;
    }

    public DONLIMIMOSQUERYSYNC_Service() {
        super(__getWsdlLocation(), DONLIMIMOSQUERYSYNC_QNAME);
    }

    public DONLIMIMOSQUERYSYNC_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), DONLIMIMOSQUERYSYNC_QNAME, features);
    }

    public DONLIMIMOSQUERYSYNC_Service(URL wsdlLocation) {
        super(wsdlLocation, DONLIMIMOSQUERYSYNC_QNAME);
    }

    public DONLIMIMOSQUERYSYNC_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DONLIMIMOSQUERYSYNC_QNAME, features);
    }

    public DONLIMIMOSQUERYSYNC_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DONLIMIMOSQUERYSYNC_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns DONLIMIMOSQUERYSYNC
     */
    @WebEndpoint(name = "DONLIM_IMOS_QUERYSYNCSOAP")
    public DONLIMIMOSQUERYSYNC getDONLIMIMOSQUERYSYNCSOAP() {
        return super.getPort(new QName("http://www.example.org/DONLIM_IMOS_QUERYSYNC/", "DONLIM_IMOS_QUERYSYNCSOAP"), DONLIMIMOSQUERYSYNC.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DONLIMIMOSQUERYSYNC
     */
    @WebEndpoint(name = "DONLIM_IMOS_QUERYSYNCSOAP")
    public DONLIMIMOSQUERYSYNC getDONLIMIMOSQUERYSYNCSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.example.org/DONLIM_IMOS_QUERYSYNC/", "DONLIM_IMOS_QUERYSYNCSOAP"), DONLIMIMOSQUERYSYNC.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DONLIMIMOSQUERYSYNC_EXCEPTION!= null) {
            throw DONLIMIMOSQUERYSYNC_EXCEPTION;
        }
        return DONLIMIMOSQUERYSYNC_WSDL_LOCATION;
    }

}
