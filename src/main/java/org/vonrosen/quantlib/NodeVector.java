/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class NodeVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected NodeVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NodeVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_NodeVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public NodeVector() {
    this(QuantLibJNI.new_NodeVector__SWIG_0(), true);
  }

  public NodeVector(long n) {
    this(QuantLibJNI.new_NodeVector__SWIG_1(n), true);
  }

  public long size() {
    return QuantLibJNI.NodeVector_size(swigCPtr, this);
  }

  public long capacity() {
    return QuantLibJNI.NodeVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    QuantLibJNI.NodeVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return QuantLibJNI.NodeVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    QuantLibJNI.NodeVector_clear(swigCPtr, this);
  }

  public void add(NodePair x) {
    QuantLibJNI.NodeVector_add(swigCPtr, this, NodePair.getCPtr(x), x);
  }

  public NodePair get(int i) {
    return new NodePair(QuantLibJNI.NodeVector_get(swigCPtr, this, i), false);
  }

  public void set(int i, NodePair val) {
    QuantLibJNI.NodeVector_set(swigCPtr, this, i, NodePair.getCPtr(val), val);
  }

}
