
package com.nibss.nipreport.ws.impl;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "NipReportWS", targetNamespace = "http://com.nibss.nipreport.ws/", wsdlLocation = "http://127.0.0.1:2222/nip-report-ws?wsdl")
public class NipReportWS_Service
    extends Service
{

    private final static URL NIPREPORTWS_WSDL_LOCATION;
    private final static WebServiceException NIPREPORTWS_EXCEPTION;
    private final static QName NIPREPORTWS_QNAME = new QName("http://com.nibss.nipreport.ws/", "NipReportWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:2222/nip-report-ws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NIPREPORTWS_WSDL_LOCATION = url;
        NIPREPORTWS_EXCEPTION = e;
    }

    public NipReportWS_Service() {
        super(__getWsdlLocation(), NIPREPORTWS_QNAME);
    }

    public NipReportWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), NIPREPORTWS_QNAME, features);
    }

    public NipReportWS_Service(URL wsdlLocation) {
        super(wsdlLocation, NIPREPORTWS_QNAME);
    }

    public NipReportWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, NIPREPORTWS_QNAME, features);
    }

    public NipReportWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NipReportWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns NipReportWS
     */
    @WebEndpoint(name = "NipReportWSPort")
    public NipReportWS getNipReportWSPort() {
        return super.getPort(new QName("http://com.nibss.nipreport.ws/", "NipReportWSPort"), NipReportWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NipReportWS
     */
    @WebEndpoint(name = "NipReportWSPort")
    public NipReportWS getNipReportWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://com.nibss.nipreport.ws/", "NipReportWSPort"), NipReportWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NIPREPORTWS_EXCEPTION!= null) {
            throw NIPREPORTWS_EXCEPTION;
        }
        return NIPREPORTWS_WSDL_LOCATION;
    }

}