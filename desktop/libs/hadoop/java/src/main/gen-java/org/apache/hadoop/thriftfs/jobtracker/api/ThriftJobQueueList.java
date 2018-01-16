/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.thriftfs.jobtracker.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThriftJobQueueList implements org.apache.thrift.TBase<ThriftJobQueueList, ThriftJobQueueList._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftJobQueueList");

  private static final org.apache.thrift.protocol.TField QUEUES_FIELD_DESC = new org.apache.thrift.protocol.TField("queues", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThriftJobQueueListStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftJobQueueListTupleSchemeFactory());
  }

  public List<ThriftJobQueueInfo> queues; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    QUEUES((short)1, "queues");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // QUEUES
          return QUEUES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUEUES, new org.apache.thrift.meta_data.FieldMetaData("queues", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftJobQueueInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftJobQueueList.class, metaDataMap);
  }

  public ThriftJobQueueList() {
  }

  public ThriftJobQueueList(
    List<ThriftJobQueueInfo> queues)
  {
    this();
    this.queues = queues;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftJobQueueList(ThriftJobQueueList other) {
    if (other.isSetQueues()) {
      List<ThriftJobQueueInfo> __this__queues = new ArrayList<ThriftJobQueueInfo>();
      for (ThriftJobQueueInfo other_element : other.queues) {
        __this__queues.add(new ThriftJobQueueInfo(other_element));
      }
      this.queues = __this__queues;
    }
  }

  public ThriftJobQueueList deepCopy() {
    return new ThriftJobQueueList(this);
  }

  @Override
  public void clear() {
    this.queues = null;
  }

  public int getQueuesSize() {
    return (this.queues == null) ? 0 : this.queues.size();
  }

  public java.util.Iterator<ThriftJobQueueInfo> getQueuesIterator() {
    return (this.queues == null) ? null : this.queues.iterator();
  }

  public void addToQueues(ThriftJobQueueInfo elem) {
    if (this.queues == null) {
      this.queues = new ArrayList<ThriftJobQueueInfo>();
    }
    this.queues.add(elem);
  }

  public List<ThriftJobQueueInfo> getQueues() {
    return this.queues;
  }

  public ThriftJobQueueList setQueues(List<ThriftJobQueueInfo> queues) {
    this.queues = queues;
    return this;
  }

  public void unsetQueues() {
    this.queues = null;
  }

  /** Returns true if field queues is set (has been assigned a value) and false otherwise */
  public boolean isSetQueues() {
    return this.queues != null;
  }

  public void setQueuesIsSet(boolean value) {
    if (!value) {
      this.queues = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUEUES:
      if (value == null) {
        unsetQueues();
      } else {
        setQueues((List<ThriftJobQueueInfo>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUEUES:
      return getQueues();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUEUES:
      return isSetQueues();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftJobQueueList)
      return this.equals((ThriftJobQueueList)that);
    return false;
  }

  public boolean equals(ThriftJobQueueList that) {
    if (that == null)
      return false;

    boolean this_present_queues = true && this.isSetQueues();
    boolean that_present_queues = true && that.isSetQueues();
    if (this_present_queues || that_present_queues) {
      if (!(this_present_queues && that_present_queues))
        return false;
      if (!this.queues.equals(that.queues))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ThriftJobQueueList other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ThriftJobQueueList typedOther = (ThriftJobQueueList)other;

    lastComparison = Boolean.valueOf(isSetQueues()).compareTo(typedOther.isSetQueues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queues, typedOther.queues);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftJobQueueList(");
    boolean first = true;

    sb.append("queues:");
    if (this.queues == null) {
      sb.append("null");
    } else {
      sb.append(this.queues);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ThriftJobQueueListStandardSchemeFactory implements SchemeFactory {
    public ThriftJobQueueListStandardScheme getScheme() {
      return new ThriftJobQueueListStandardScheme();
    }
  }

  private static class ThriftJobQueueListStandardScheme extends StandardScheme<ThriftJobQueueList> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftJobQueueList struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUEUES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.queues = new ArrayList<ThriftJobQueueInfo>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  ThriftJobQueueInfo _elem2; // required
                  _elem2 = new ThriftJobQueueInfo();
                  _elem2.read(iprot);
                  struct.queues.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setQueuesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftJobQueueList struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.queues != null) {
        oprot.writeFieldBegin(QUEUES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.queues.size()));
          for (ThriftJobQueueInfo _iter3 : struct.queues)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftJobQueueListTupleSchemeFactory implements SchemeFactory {
    public ThriftJobQueueListTupleScheme getScheme() {
      return new ThriftJobQueueListTupleScheme();
    }
  }

  private static class ThriftJobQueueListTupleScheme extends TupleScheme<ThriftJobQueueList> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftJobQueueList struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetQueues()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetQueues()) {
        {
          oprot.writeI32(struct.queues.size());
          for (ThriftJobQueueInfo _iter4 : struct.queues)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftJobQueueList struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.queues = new ArrayList<ThriftJobQueueInfo>(_list5.size);
          for (int _i6 = 0; _i6 < _list5.size; ++_i6)
          {
            ThriftJobQueueInfo _elem7; // required
            _elem7 = new ThriftJobQueueInfo();
            _elem7.read(iprot);
            struct.queues.add(_elem7);
          }
        }
        struct.setQueuesIsSet(true);
      }
    }
  }

}
