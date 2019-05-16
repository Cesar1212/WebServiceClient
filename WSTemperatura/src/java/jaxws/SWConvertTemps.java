/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaxws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Rafa Paniagua
 */
@WebService(serviceName = "SWConvertTemps")
public class SWConvertTemps {

    //Convertir F a C
    @WebMethod(operationName = "ConvFahrACent")
    public Double ConvFahrACent(@WebParam(name = "gFahr") double gFahr) {
        return ((gFahr - 32.0) * 5.0) / 9.0;
    }

    //Convertir C a F
    @WebMethod(operationName = "ConvCentAFahr")
    public Double ConvCentAFahr(@WebParam(name = "gCent") double gCent) {
        return 9.0 / 5.0 * gCent + 32.0;
    }
}
