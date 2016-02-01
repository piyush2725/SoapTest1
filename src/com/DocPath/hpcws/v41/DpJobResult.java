/**
 * DpJobResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.DocPath.hpcws.v41;

public class DpJobResult  implements java.io.Serializable {
    private long jobID;

    private byte[] output;

    private int RC;

    public DpJobResult() {
    }

    public DpJobResult(
           long jobID,
           byte[] output,
           int RC) {
           this.jobID = jobID;
           this.output = output;
           this.RC = RC;
    }


    /**
     * Gets the jobID value for this DpJobResult.
     * 
     * @return jobID
     */
    public long getJobID() {
        return jobID;
    }


    /**
     * Sets the jobID value for this DpJobResult.
     * 
     * @param jobID
     */
    public void setJobID(long jobID) {
        this.jobID = jobID;
    }


    /**
     * Gets the output value for this DpJobResult.
     * 
     * @return output
     */
    public byte[] getOutput() {
        return output;
    }


    /**
     * Sets the output value for this DpJobResult.
     * 
     * @param output
     */
    public void setOutput(byte[] output) {
        this.output = output;
    }


    /**
     * Gets the RC value for this DpJobResult.
     * 
     * @return RC
     */
    public int getRC() {
        return RC;
    }


    /**
     * Sets the RC value for this DpJobResult.
     * 
     * @param RC
     */
    public void setRC(int RC) {
        this.RC = RC;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DpJobResult)) return false;
        DpJobResult other = (DpJobResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.jobID == other.getJobID() &&
            ((this.output==null && other.getOutput()==null) || 
             (this.output!=null &&
              java.util.Arrays.equals(this.output, other.getOutput()))) &&
            this.RC == other.getRC();
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
        _hashCode += new Long(getJobID()).hashCode();
        if (getOutput() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutput());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutput(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getRC();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DpJobResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://v41.hpcws.DocPath.com/", "dpJobResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jobID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("output");
        elemField.setXmlName(new javax.xml.namespace.QName("", "output"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
