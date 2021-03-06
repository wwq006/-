/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.solid.analytics.model;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import java.util.Enumeration;

import org.json.*;

import com.solid.analytics.thrift.*;
import com.solid.analytics.thrift.meta_data.*;
import com.solid.analytics.thrift.transport.*;
import com.solid.analytics.thrift.protocol.*;

public class Property implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("");

  private static final TField NAME_FIELD_DESC = new TField("FB2BB33E07C1479C9BC8315457B960B2", TType.STRING, (short)1);
  private static final TField VALUE_FIELD_DESC = new TField("DCA77847CD1FE9966C0F581AAE4B956A", TType.STRING, (short)2);

  private String name;
  private String value;

  // isset id assignments

  public Property() {
  }

  public Property(
    String name,
    String value)
  {
    this();
    this.name = name;
    this.value = value;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Property(Property other) {
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetValue()) {
      this.value = other.value;
    }
  }

  public Property deepCopy() {
    return new Property(this);
  }

  public void clear() {
    this.name = null;
    this.value = null;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public void unsetValue() {
    this.value = null;
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Property)
      return this.equals((Property)that);
    return false;
  }

  public boolean equals(Property that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!this.value.equals(that.value))
        return false;
    }

    return true;
  }

  public int hashCode() {
    return 0;
  }

  public int compareTo(Object otherObject) {
    if (!getClass().equals(otherObject.getClass())) {
      return getClass().getName().compareTo(otherObject.getClass().getName());
    }

    Property other = (Property)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetName(), other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetValue(), other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = TBaseHelper.compareTo(this.value, other.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // NAME
          if (field.type == TType.STRING) {
            this.name = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // VALUE
          if (field.type == TType.STRING) {
            this.value = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    if (this.value != null) {
      oprot.writeFieldBegin(VALUE_FIELD_DESC);
      oprot.writeString(this.value);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public void validate() throws TException {
    // check for required fields
  }

  public void read(JSONObject obj) throws TException {
    validate();

    try {
      if (obj.has(NAME_FIELD_DESC.name())) {
        this.name = obj.optString(NAME_FIELD_DESC.name());
      }
      if (obj.has(VALUE_FIELD_DESC.name())) {
        this.value = obj.optString(VALUE_FIELD_DESC.name());
      }
    } catch (Exception e) {
        throw new TException(e);
    }
  }

  public void write(JSONObject obj) throws TException {
    validate();

    try {
      if (this.name != null) {
        Object v_name = this.name;
        obj.put(NAME_FIELD_DESC.name(), v_name);
      }
      if (this.value != null) {
        Object v_value = this.value;
        obj.put(VALUE_FIELD_DESC.name(), v_value);
      }
    } catch (Exception e) {
        throw new TException(e);
    }
  }

}

