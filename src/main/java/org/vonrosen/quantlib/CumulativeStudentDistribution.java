/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class CumulativeStudentDistribution {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CumulativeStudentDistribution(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CumulativeStudentDistribution obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_CumulativeStudentDistribution(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CumulativeStudentDistribution(int n) {
    this(QuantLibJNI.new_CumulativeStudentDistribution(n), true);
  }

  public double getValue(double x) {
    return QuantLibJNI.CumulativeStudentDistribution_getValue(swigCPtr, this, x);
  }

}
