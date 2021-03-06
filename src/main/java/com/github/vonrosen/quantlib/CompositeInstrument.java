/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class CompositeInstrument extends Instrument {
  private transient long swigCPtr;

  protected CompositeInstrument(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.CompositeInstrument_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CompositeInstrument obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_CompositeInstrument(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public CompositeInstrument() {
    this(QuantLibJNI.new_CompositeInstrument(), true);
  }

  public void add(Instrument instrument, double multiplier) {
    QuantLibJNI.CompositeInstrument_add__SWIG_0(swigCPtr, this, Instrument.getCPtr(instrument), instrument, multiplier);
  }

  public void add(Instrument instrument) {
    QuantLibJNI.CompositeInstrument_add__SWIG_1(swigCPtr, this, Instrument.getCPtr(instrument), instrument);
  }

  public void subtract(Instrument instrument, double multiplier) {
    QuantLibJNI.CompositeInstrument_subtract__SWIG_0(swigCPtr, this, Instrument.getCPtr(instrument), instrument, multiplier);
  }

  public void subtract(Instrument instrument) {
    QuantLibJNI.CompositeInstrument_subtract__SWIG_1(swigCPtr, this, Instrument.getCPtr(instrument), instrument);
  }

}
