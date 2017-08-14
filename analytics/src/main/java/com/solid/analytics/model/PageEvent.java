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

public class PageEvent implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("");

  private static final TField ACT_FIELD_DESC = new TField("C8274FEF0C71DA8F328E1130C4E8AE5D", TType.STRING, (short)1);
  private static final TField EXT_FIELD_DESC = new TField("D134A5052C5B0D46680E96714BE6F8D4", TType.STRING, (short)2);
  private static final TField ST_FIELD_DESC = new TField("CC65F3209B13C24B83E180D777BC272D", TType.I64, (short)3);
  private static final TField ET_FIELD_DESC = new TField("432349058A296A87E1C6073808BE5E8B", TType.I64, (short)4);

  private String act;
  private String ext;
  private long st;
  private long et;

  // isset id assignments
  private static final int __ST_ISSET_ID = 0;
  private static final int __ET_ISSET_ID = 1;
  private boolean[] __isset_vector = new boolean[2];

  public PageEvent() {
  }

  public PageEvent(
    String act,
    String ext,
    long st,
    long et)
  {
    this();
    this.act = act;
    this.ext = ext;
    this.st = st;
    setStIsSet(true);
    this.et = et;
    setEtIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PageEvent(PageEvent other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetAct()) {
      this.act = other.act;
    }
    if (other.isSetExt()) {
      this.ext = other.ext;
    }
    this.st = other.st;
    this.et = other.et;
  }

  public PageEvent deepCopy() {
    return new PageEvent(this);
  }

  public void clear() {
    this.act = null;
    this.ext = null;
    setStIsSet(false);
    this.st = 0;
    setEtIsSet(false);
    this.et = 0;
  }

  public String getAct() {
    return this.act;
  }

  public void setAct(String act) {
    this.act = act;
  }

  public void unsetAct() {
    this.act = null;
  }

  /** Returns true if field act is set (has been assigned a value) and false otherwise */
  public boolean isSetAct() {
    return this.act != null;
  }

  public void setActIsSet(boolean value) {
    if (!value) {
      this.act = null;
    }
  }

  public String getExt() {
    return this.ext;
  }

  public void setExt(String ext) {
    this.ext = ext;
  }

  public void unsetExt() {
    this.ext = null;
  }

  /** Returns true if field ext is set (has been assigned a value) and false otherwise */
  public boolean isSetExt() {
    return this.ext != null;
  }

  public void setExtIsSet(boolean value) {
    if (!value) {
      this.ext = null;
    }
  }

  public long getSt() {
    return this.st;
  }

  public void setSt(long st) {
    this.st = st;
    setStIsSet(true);
  }

  public void unsetSt() {
    __isset_vector[__ST_ISSET_ID] = false;
  }

  /** Returns true if field st is set (has been assigned a value) and false otherwise */
  public boolean isSetSt() {
    return __isset_vector[__ST_ISSET_ID];
  }

  public void setStIsSet(boolean value) {
    __isset_vector[__ST_ISSET_ID] = value;
  }

  public long getEt() {
    return this.et;
  }

  public void setEt(long et) {
    this.et = et;
    setEtIsSet(true);
  }

  public void unsetEt() {
    __isset_vector[__ET_ISSET_ID] = false;
  }

  /** Returns true if field et is set (has been assigned a value) and false otherwise */
  public boolean isSetEt() {
    return __isset_vector[__ET_ISSET_ID];
  }

  public void setEtIsSet(boolean value) {
    __isset_vector[__ET_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PageEvent)
      return this.equals((PageEvent)that);
    return false;
  }

  public boolean equals(PageEvent that) {
    if (that == null)
      return false;

    boolean this_present_act = true && this.isSetAct();
    boolean that_present_act = true && that.isSetAct();
    if (this_present_act || that_present_act) {
      if (!(this_present_act && that_present_act))
        return false;
      if (!this.act.equals(that.act))
        return false;
    }

    boolean this_present_ext = true && this.isSetExt();
    boolean that_present_ext = true && that.isSetExt();
    if (this_present_ext || that_present_ext) {
      if (!(this_present_ext && that_present_ext))
        return false;
      if (!this.ext.equals(that.ext))
        return false;
    }

    boolean this_present_st = true;
    boolean that_present_st = true;
    if (this_present_st || that_present_st) {
      if (!(this_present_st && that_present_st))
        return false;
      if (this.st != that.st)
        return false;
    }

    boolean this_present_et = true;
    boolean that_present_et = true;
    if (this_present_et || that_present_et) {
      if (!(this_present_et && that_present_et))
        return false;
      if (this.et != that.et)
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

    PageEvent other = (PageEvent)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetAct(), other.isSetAct());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAct()) {
      lastComparison = TBaseHelper.compareTo(this.act, other.act);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetExt(), other.isSetExt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExt()) {
      lastComparison = TBaseHelper.compareTo(this.ext, other.ext);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetSt(), other.isSetSt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSt()) {
      lastComparison = TBaseHelper.compareTo(this.st, other.st);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetEt(), other.isSetEt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEt()) {
      lastComparison = TBaseHelper.compareTo(this.et, other.et);
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
        case 1: // ACT
          if (field.type == TType.STRING) {
            this.act = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // EXT
          if (field.type == TType.STRING) {
            this.ext = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // ST
          if (field.type == TType.I64) {
            this.st = iprot.readI64();
            setStIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // ET
          if (field.type == TType.I64) {
            this.et = iprot.readI64();
            setEtIsSet(true);
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
    if (this.act != null) {
      oprot.writeFieldBegin(ACT_FIELD_DESC);
      oprot.writeString(this.act);
      oprot.writeFieldEnd();
    }
    if (this.ext != null) {
      oprot.writeFieldBegin(EXT_FIELD_DESC);
      oprot.writeString(this.ext);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(ST_FIELD_DESC);
    oprot.writeI64(this.st);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(ET_FIELD_DESC);
    oprot.writeI64(this.et);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public void validate() throws TException {
    // check for required fields
  }

  public void read(JSONObject obj) throws TException {
    validate();

    try {
      if (obj.has(ACT_FIELD_DESC.name())) {
        this.act = obj.optString(ACT_FIELD_DESC.name());
      }
      if (obj.has(EXT_FIELD_DESC.name())) {
        this.ext = obj.optString(EXT_FIELD_DESC.name());
      }
      if (obj.has(ST_FIELD_DESC.name())) {
        this.st = obj.optLong(ST_FIELD_DESC.name());
        setStIsSet(true);
      }
      if (obj.has(ET_FIELD_DESC.name())) {
        this.et = obj.optLong(ET_FIELD_DESC.name());
        setEtIsSet(true);
      }
    } catch (Exception e) {
        throw new TException(e);
    }
  }

  public void write(JSONObject obj) throws TException {
    validate();

    try {
      if (this.act != null) {
        Object v_act = this.act;
        obj.put(ACT_FIELD_DESC.name(), v_act);
      }
      if (this.ext != null) {
        Object v_ext = this.ext;
        obj.put(EXT_FIELD_DESC.name(), v_ext);
      }
      Object v_st = this.st;
      obj.put(ST_FIELD_DESC.name(), v_st);
      Object v_et = this.et;
      obj.put(ET_FIELD_DESC.name(), v_et);
    } catch (Exception e) {
        throw new TException(e);
    }
  }

}
