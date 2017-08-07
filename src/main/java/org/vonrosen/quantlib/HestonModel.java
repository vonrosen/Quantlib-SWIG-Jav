/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class HestonModel extends CalibratedModel {
  private transient long swigCPtr;

  protected HestonModel(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.HestonModel_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HestonModel obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_HestonModel(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public HestonModel(HestonProcess process) {
    this(QuantLibJNI.new_HestonModel(HestonProcess.getCPtr(process), process), true);
  }

  public double theta() {
    return QuantLibJNI.HestonModel_theta(swigCPtr, this);
  }

  public double kappa() {
    return QuantLibJNI.HestonModel_kappa(swigCPtr, this);
  }

  public double sigma() {
    return QuantLibJNI.HestonModel_sigma(swigCPtr, this);
  }

  public double rho() {
    return QuantLibJNI.HestonModel_rho(swigCPtr, this);
  }

  public double v0() {
    return QuantLibJNI.HestonModel_v0(swigCPtr, this);
  }

}
