/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class ReannealingTrivial {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ReannealingTrivial(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ReannealingTrivial obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_ReannealingTrivial(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ReannealingTrivial() {
    this(QuantLibJNI.new_ReannealingTrivial(), true);
  }

}
