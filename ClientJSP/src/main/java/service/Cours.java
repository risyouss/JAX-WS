/**
 * Cours.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class Cours  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 640301475271385883L;

	private java.lang.Long code;

    private java.lang.String nom_cours;

    private java.lang.Integer total_ins;

    public Cours() {
    }

    public Cours(
           java.lang.Long code,
           java.lang.String nom_cours,
           java.lang.Integer total_ins) {
           this.code = code;
           this.nom_cours = nom_cours;
           this.total_ins = total_ins;
    }


    /**
     * Gets the code value for this Cours.
     * 
     * @return code
     */
    public java.lang.Long getCode() {
        return code;
    }


    /**
     * Sets the code value for this Cours.
     * 
     * @param code
     */
    public void setCode(java.lang.Long code) {
        this.code = code;
    }


    /**
     * Gets the nom_cours value for this Cours.
     * 
     * @return nom_cours
     */
    public java.lang.String getNom_cours() {
        return nom_cours;
    }


    /**
     * Sets the nom_cours value for this Cours.
     * 
     * @param nom_cours
     */
    public void setNom_cours(java.lang.String nom_cours) {
        this.nom_cours = nom_cours;
    }


    /**
     * Gets the total_ins value for this Cours.
     * 
     * @return total_ins
     */
    public java.lang.Integer getTotal_ins() {
        return total_ins;
    }


    /**
     * Sets the total_ins value for this Cours.
     * 
     * @param total_ins
     */
    public void setTotal_ins(java.lang.Integer total_ins) {
        this.total_ins = total_ins;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cours)) return false;
        Cours other = (Cours) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.nom_cours==null && other.getNom_cours()==null) || 
             (this.nom_cours!=null &&
              this.nom_cours.equals(other.getNom_cours()))) &&
            ((this.total_ins==null && other.getTotal_ins()==null) || 
             (this.total_ins!=null &&
              this.total_ins.equals(other.getTotal_ins())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getNom_cours() != null) {
            _hashCode += getNom_cours().hashCode();
        }
        if (getTotal_ins() != null) {
            _hashCode += getTotal_ins().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cours.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "cours"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nom_cours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nom_cours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_ins");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total_ins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    @SuppressWarnings("rawtypes")
	public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           @SuppressWarnings("rawtypes") java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
