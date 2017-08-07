/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class CompositeConstraint extends Constraint {
  private transient long swigCPtr;

  protected CompositeConstraint(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.CompositeConstraint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CompositeConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_CompositeConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public CompositeConstraint(Constraint c1, Constraint c2) {
    this(QuantLibJNI.new_CompositeConstraint(Constraint.getCPtr(c1), c1, Constraint.getCPtr(c2), c2), true);
  }

}
