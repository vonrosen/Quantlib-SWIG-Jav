/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class VanillaSwap extends Swap {
  private transient long swigCPtr;

  protected VanillaSwap(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.VanillaSwap_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VanillaSwap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_VanillaSwap(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public VanillaSwap(_VanillaSwap.Type type, double nominal, Schedule fixedSchedule, double fixedRate, DayCounter fixedDayCount, Schedule floatSchedule, IborIndex index, double spread, DayCounter floatingDayCount) {
    this(QuantLibJNI.new_VanillaSwap(type.swigValue(), nominal, Schedule.getCPtr(fixedSchedule), fixedSchedule, fixedRate, DayCounter.getCPtr(fixedDayCount), fixedDayCount, Schedule.getCPtr(floatSchedule), floatSchedule, IborIndex.getCPtr(index), index, spread, DayCounter.getCPtr(floatingDayCount), floatingDayCount), true);
  }

  public double fairRate() {
    return QuantLibJNI.VanillaSwap_fairRate(swigCPtr, this);
  }

  public double fairSpread() {
    return QuantLibJNI.VanillaSwap_fairSpread(swigCPtr, this);
  }

  public double fixedLegBPS() {
    return QuantLibJNI.VanillaSwap_fixedLegBPS(swigCPtr, this);
  }

  public double floatingLegBPS() {
    return QuantLibJNI.VanillaSwap_floatingLegBPS(swigCPtr, this);
  }

  public double fixedLegNPV() {
    return QuantLibJNI.VanillaSwap_fixedLegNPV(swigCPtr, this);
  }

  public double floatingLegNPV() {
    return QuantLibJNI.VanillaSwap_floatingLegNPV(swigCPtr, this);
  }

  public Leg fixedLeg() {
    return new Leg(QuantLibJNI.VanillaSwap_fixedLeg(swigCPtr, this), false);
  }

  public Leg floatingLeg() {
    return new Leg(QuantLibJNI.VanillaSwap_floatingLeg(swigCPtr, this), false);
  }

  public double nominal() {
    return QuantLibJNI.VanillaSwap_nominal(swigCPtr, this);
  }

  public Schedule fixedSchedule() {
    return new Schedule(QuantLibJNI.VanillaSwap_fixedSchedule(swigCPtr, this), false);
  }

  public Schedule floatingSchedule() {
    return new Schedule(QuantLibJNI.VanillaSwap_floatingSchedule(swigCPtr, this), false);
  }

  public double fixedRate() {
    return QuantLibJNI.VanillaSwap_fixedRate(swigCPtr, this);
  }

  public double spread() {
    return QuantLibJNI.VanillaSwap_spread(swigCPtr, this);
  }

  public DayCounter floatingDayCount() {
    return new DayCounter(QuantLibJNI.VanillaSwap_floatingDayCount(swigCPtr, this), false);
  }

  public DayCounter fixedDayCount() {
    return new DayCounter(QuantLibJNI.VanillaSwap_fixedDayCount(swigCPtr, this), false);
  }

  public final static _VanillaSwap.Type Receiver = _VanillaSwap.Type.swigToEnum(QuantLibJNI.VanillaSwap_Receiver_get());
  public final static _VanillaSwap.Type Payer = _VanillaSwap.Type.swigToEnum(QuantLibJNI.VanillaSwap_Payer_get());
}
