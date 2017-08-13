/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class G2SwaptionEngine extends PricingEngine {
  private transient long swigCPtr;

  protected G2SwaptionEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.G2SwaptionEngine_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(G2SwaptionEngine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_G2SwaptionEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public G2SwaptionEngine(ShortRateModel model, double range, long intervals) {
    this(QuantLibJNI.new_G2SwaptionEngine(ShortRateModel.getCPtr(model), model, range, intervals), true);
  }

}