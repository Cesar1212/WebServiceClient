
package jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConvFahrACent complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConvFahrACent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gFahr" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConvFahrACent", propOrder = {
    "gFahr"
})
public class ConvFahrACent {

    protected double gFahr;

    /**
     * Obtiene el valor de la propiedad gFahr.
     * 
     */
    public double getGFahr() {
        return gFahr;
    }

    /**
     * Define el valor de la propiedad gFahr.
     * 
     */
    public void setGFahr(double value) {
        this.gFahr = value;
    }

}
