/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class ZabrShortMaturityLognormalInterpolatedSmileSection extends SmileSection {
  private transient long swigCPtr;

  protected ZabrShortMaturityLognormalInterpolatedSmileSection(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.ZabrShortMaturityLognormalInterpolatedSmileSection_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ZabrShortMaturityLognormalInterpolatedSmileSection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_ZabrShortMaturityLognormalInterpolatedSmileSection(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, QuoteHandle forward, DoubleVector strikes, boolean hasFloatingStrikes, QuoteHandle atmVolatility, QuoteHandleVector volHandles, double alpha, double beta, double nu, double rho, double gamma, boolean isAlphaFixed, boolean isBetaFixed, boolean isNuFixed, boolean isRhoFixed, boolean isGammaFixed, boolean vegaWeighted, SWIGTYPE_p_boost__shared_ptrT_EndCriteria_t endCriteria, SWIGTYPE_p_boost__shared_ptrT_OptimizationMethod_t method, DayCounter dc) {
    this(QuantLibJNI.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_0(Date.getCPtr(optionDate), optionDate, QuoteHandle.getCPtr(forward), forward, DoubleVector.getCPtr(strikes), strikes, hasFloatingStrikes, QuoteHandle.getCPtr(atmVolatility), atmVolatility, QuoteHandleVector.getCPtr(volHandles), volHandles, alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed, isRhoFixed, isGammaFixed, vegaWeighted, SWIGTYPE_p_boost__shared_ptrT_EndCriteria_t.getCPtr(endCriteria), SWIGTYPE_p_boost__shared_ptrT_OptimizationMethod_t.getCPtr(method), DayCounter.getCPtr(dc), dc), true);
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, QuoteHandle forward, DoubleVector strikes, boolean hasFloatingStrikes, QuoteHandle atmVolatility, QuoteHandleVector volHandles, double alpha, double beta, double nu, double rho, double gamma, boolean isAlphaFixed, boolean isBetaFixed, boolean isNuFixed, boolean isRhoFixed, boolean isGammaFixed, boolean vegaWeighted, SWIGTYPE_p_boost__shared_ptrT_EndCriteria_t endCriteria, SWIGTYPE_p_boost__shared_ptrT_OptimizationMethod_t method) {
    this(QuantLibJNI.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_1(Date.getCPtr(optionDate), optionDate, QuoteHandle.getCPtr(forward), forward, DoubleVector.getCPtr(strikes), strikes, hasFloatingStrikes, QuoteHandle.getCPtr(atmVolatility), atmVolatility, QuoteHandleVector.getCPtr(volHandles), volHandles, alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed, isRhoFixed, isGammaFixed, vegaWeighted, SWIGTYPE_p_boost__shared_ptrT_EndCriteria_t.getCPtr(endCriteria), SWIGTYPE_p_boost__shared_ptrT_OptimizationMethod_t.getCPtr(method)), true);
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, QuoteHandle forward, DoubleVector strikes, boolean hasFloatingStrikes, QuoteHandle atmVolatility, QuoteHandleVector volHandles, double alpha, double beta, double nu, double rho, double gamma, boolean isAlphaFixed, boolean isBetaFixed, boolean isNuFixed, boolean isRhoFixed, boolean isGammaFixed, boolean vegaWeighted, SWIGTYPE_p_boost__shared_ptrT_EndCriteria_t endCriteria) {
    this(QuantLibJNI.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_2(Date.getCPtr(optionDate), optionDate, QuoteHandle.getCPtr(forward), forward, DoubleVector.getCPtr(strikes), strikes, hasFloatingStrikes, QuoteHandle.getCPtr(atmVolatility), atmVolatility, QuoteHandleVector.getCPtr(volHandles), volHandles, alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed, isRhoFixed, isGammaFixed, vegaWeighted, SWIGTYPE_p_boost__shared_ptrT_EndCriteria_t.getCPtr(endCriteria)), true);
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, QuoteHandle forward, DoubleVector strikes, boolean hasFloatingStrikes, QuoteHandle atmVolatility, QuoteHandleVector volHandles, double alpha, double beta, double nu, double rho, double gamma, boolean isAlphaFixed, boolean isBetaFixed, boolean isNuFixed, boolean isRhoFixed, boolean isGammaFixed, boolean vegaWeighted) {
    this(QuantLibJNI.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_3(Date.getCPtr(optionDate), optionDate, QuoteHandle.getCPtr(forward), forward, DoubleVector.getCPtr(strikes), strikes, hasFloatingStrikes, QuoteHandle.getCPtr(atmVolatility), atmVolatility, QuoteHandleVector.getCPtr(volHandles), volHandles, alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed, isRhoFixed, isGammaFixed, vegaWeighted), true);
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, QuoteHandle forward, DoubleVector strikes, boolean hasFloatingStrikes, QuoteHandle atmVolatility, QuoteHandleVector volHandles, double alpha, double beta, double nu, double rho, double gamma, boolean isAlphaFixed, boolean isBetaFixed, boolean isNuFixed, boolean isRhoFixed, boolean isGammaFixed) {
    this(QuantLibJNI.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_4(Date.getCPtr(optionDate), optionDate, QuoteHandle.getCPtr(forward), forward, DoubleVector.getCPtr(strikes), strikes, hasFloatingStrikes, QuoteHandle.getCPtr(atmVolatility), atmVolatility, QuoteHandleVector.getCPtr(volHandles), volHandles, alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed, isRhoFixed, isGammaFixed), true);
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, QuoteHandle forward, DoubleVector strikes, boolean hasFloatingStrikes, QuoteHandle atmVolatility, QuoteHandleVector volHandles, double alpha, double beta, double nu, double rho, double gamma, boolean isAlphaFixed, boolean isBetaFixed, boolean isNuFixed, boolean isRhoFixed) {
    this(QuantLibJNI.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_5(Date.getCPtr(optionDate), optionDate, QuoteHandle.getCPtr(forward), forward, DoubleVector.getCPtr(strikes), strikes, hasFloatingStrikes, QuoteHandle.getCPtr(atmVolatility), atmVolatility, QuoteHandleVector.getCPtr(volHandles), volHandles, alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed, isRhoFixed), true);
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, QuoteHandle forward, DoubleVector strikes, boolean hasFloatingStrikes, QuoteHandle atmVolatility, QuoteHandleVector volHandles, double alpha, double beta, double nu, double rho, double gamma, boolean isAlphaFixed, boolean isBetaFixed, boolean isNuFixed) {
    this(QuantLibJNI.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_6(Date.getCPtr(optionDate), optionDate, QuoteHandle.getCPtr(forward), forward, DoubleVector.getCPtr(strikes), strikes, hasFloatingStrikes, QuoteHandle.getCPtr(atmVolatility), atmVolatility, QuoteHandleVector.getCPtr(volHandles), volHandles, alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed), true);
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, QuoteHandle forward, DoubleVector strikes, boolean hasFloatingStrikes, QuoteHandle atmVolatility, QuoteHandleVector volHandles, double alpha, double beta, double nu, double rho, double gamma, boolean isAlphaFixed, boolean isBetaFixed) {
    this(QuantLibJNI.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_7(Date.getCPtr(optionDate), optionDate, QuoteHandle.getCPtr(forward), forward, DoubleVector.getCPtr(strikes), strikes, hasFloatingStrikes, QuoteHandle.getCPtr(atmVolatility), atmVolatility, QuoteHandleVector.getCPtr(volHandles), volHandles, alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed), true);
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, QuoteHandle forward, DoubleVector strikes, boolean hasFloatingStrikes, QuoteHandle atmVolatility, QuoteHandleVector volHandles, double alpha, double beta, double nu, double rho, double gamma, boolean isAlphaFixed) {
    this(QuantLibJNI.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_8(Date.getCPtr(optionDate), optionDate, QuoteHandle.getCPtr(forward), forward, DoubleVector.getCPtr(strikes), strikes, hasFloatingStrikes, QuoteHandle.getCPtr(atmVolatility), atmVolatility, QuoteHandleVector.getCPtr(volHandles), volHandles, alpha, beta, nu, rho, gamma, isAlphaFixed), true);
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, QuoteHandle forward, DoubleVector strikes, boolean hasFloatingStrikes, QuoteHandle atmVolatility, QuoteHandleVector volHandles, double alpha, double beta, double nu, double rho, double gamma) {
    this(QuantLibJNI.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_9(Date.getCPtr(optionDate), optionDate, QuoteHandle.getCPtr(forward), forward, DoubleVector.getCPtr(strikes), strikes, hasFloatingStrikes, QuoteHandle.getCPtr(atmVolatility), atmVolatility, QuoteHandleVector.getCPtr(volHandles), volHandles, alpha, beta, nu, rho, gamma), true);
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, double forward, DoubleVector strikes, boolean hasFloatingStrikes, double atmVolatility, DoubleVector vols, double alpha, double beta, double nu, double rho, double gamma, boolean isAlphaFixed, boolean isBetaFixed, boolean isNuFixed, boolean isRhoFixed, boolean isGammaFixed, boolean vegaWeighted, SWIGTYPE_p_boost__shared_ptrT_EndCriteria_t endCriteria, SWIGTYPE_p_boost__shared_ptrT_OptimizationMethod_t method, DayCounter dc) {
    this(QuantLibJNI.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_10(Date.getCPtr(optionDate), optionDate, forward, DoubleVector.getCPtr(strikes), strikes, hasFloatingStrikes, atmVolatility, DoubleVector.getCPtr(vols), vols, alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed, isRhoFixed, isGammaFixed, vegaWeighted, SWIGTYPE_p_boost__shared_ptrT_EndCriteria_t.getCPtr(endCriteria), SWIGTYPE_p_boost__shared_ptrT_OptimizationMethod_t.getCPtr(method), DayCounter.getCPtr(dc), dc), true);
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, double forward, DoubleVector strikes, boolean hasFloatingStrikes, double atmVolatility, DoubleVector vols, double alpha, double beta, double nu, double rho, double gamma, boolean isAlphaFixed, boolean isBetaFixed, boolean isNuFixed, boolean isRhoFixed, boolean isGammaFixed, boolean vegaWeighted, SWIGTYPE_p_boost__shared_ptrT_EndCriteria_t endCriteria, SWIGTYPE_p_boost__shared_ptrT_OptimizationMethod_t method) {
    this(QuantLibJNI.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_11(Date.getCPtr(optionDate), optionDate, forward, DoubleVector.getCPtr(strikes), strikes, hasFloatingStrikes, atmVolatility, DoubleVector.getCPtr(vols), vols, alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed, isRhoFixed, isGammaFixed, vegaWeighted, SWIGTYPE_p_boost__shared_ptrT_EndCriteria_t.getCPtr(endCriteria), SWIGTYPE_p_boost__shared_ptrT_OptimizationMethod_t.getCPtr(method)), true);
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, double forward, DoubleVector strikes, boolean hasFloatingStrikes, double atmVolatility, DoubleVector vols, double alpha, double beta, double nu, double rho, double gamma, boolean isAlphaFixed, boolean isBetaFixed, boolean isNuFixed, boolean isRhoFixed, boolean isGammaFixed, boolean vegaWeighted, SWIGTYPE_p_boost__shared_ptrT_EndCriteria_t endCriteria) {
    this(QuantLibJNI.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_12(Date.getCPtr(optionDate), optionDate, forward, DoubleVector.getCPtr(strikes), strikes, hasFloatingStrikes, atmVolatility, DoubleVector.getCPtr(vols), vols, alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed, isRhoFixed, isGammaFixed, vegaWeighted, SWIGTYPE_p_boost__shared_ptrT_EndCriteria_t.getCPtr(endCriteria)), true);
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, double forward, DoubleVector strikes, boolean hasFloatingStrikes, double atmVolatility, DoubleVector vols, double alpha, double beta, double nu, double rho, double gamma, boolean isAlphaFixed, boolean isBetaFixed, boolean isNuFixed, boolean isRhoFixed, boolean isGammaFixed, boolean vegaWeighted) {
    this(QuantLibJNI.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_13(Date.getCPtr(optionDate), optionDate, forward, DoubleVector.getCPtr(strikes), strikes, hasFloatingStrikes, atmVolatility, DoubleVector.getCPtr(vols), vols, alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed, isRhoFixed, isGammaFixed, vegaWeighted), true);
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, double forward, DoubleVector strikes, boolean hasFloatingStrikes, double atmVolatility, DoubleVector vols, double alpha, double beta, double nu, double rho, double gamma, boolean isAlphaFixed, boolean isBetaFixed, boolean isNuFixed, boolean isRhoFixed, boolean isGammaFixed) {
    this(QuantLibJNI.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_14(Date.getCPtr(optionDate), optionDate, forward, DoubleVector.getCPtr(strikes), strikes, hasFloatingStrikes, atmVolatility, DoubleVector.getCPtr(vols), vols, alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed, isRhoFixed, isGammaFixed), true);
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, double forward, DoubleVector strikes, boolean hasFloatingStrikes, double atmVolatility, DoubleVector vols, double alpha, double beta, double nu, double rho, double gamma, boolean isAlphaFixed, boolean isBetaFixed, boolean isNuFixed, boolean isRhoFixed) {
    this(QuantLibJNI.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_15(Date.getCPtr(optionDate), optionDate, forward, DoubleVector.getCPtr(strikes), strikes, hasFloatingStrikes, atmVolatility, DoubleVector.getCPtr(vols), vols, alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed, isRhoFixed), true);
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, double forward, DoubleVector strikes, boolean hasFloatingStrikes, double atmVolatility, DoubleVector vols, double alpha, double beta, double nu, double rho, double gamma, boolean isAlphaFixed, boolean isBetaFixed, boolean isNuFixed) {
    this(QuantLibJNI.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_16(Date.getCPtr(optionDate), optionDate, forward, DoubleVector.getCPtr(strikes), strikes, hasFloatingStrikes, atmVolatility, DoubleVector.getCPtr(vols), vols, alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed), true);
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, double forward, DoubleVector strikes, boolean hasFloatingStrikes, double atmVolatility, DoubleVector vols, double alpha, double beta, double nu, double rho, double gamma, boolean isAlphaFixed, boolean isBetaFixed) {
    this(QuantLibJNI.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_17(Date.getCPtr(optionDate), optionDate, forward, DoubleVector.getCPtr(strikes), strikes, hasFloatingStrikes, atmVolatility, DoubleVector.getCPtr(vols), vols, alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed), true);
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, double forward, DoubleVector strikes, boolean hasFloatingStrikes, double atmVolatility, DoubleVector vols, double alpha, double beta, double nu, double rho, double gamma, boolean isAlphaFixed) {
    this(QuantLibJNI.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_18(Date.getCPtr(optionDate), optionDate, forward, DoubleVector.getCPtr(strikes), strikes, hasFloatingStrikes, atmVolatility, DoubleVector.getCPtr(vols), vols, alpha, beta, nu, rho, gamma, isAlphaFixed), true);
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, double forward, DoubleVector strikes, boolean hasFloatingStrikes, double atmVolatility, DoubleVector vols, double alpha, double beta, double nu, double rho, double gamma) {
    this(QuantLibJNI.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_19(Date.getCPtr(optionDate), optionDate, forward, DoubleVector.getCPtr(strikes), strikes, hasFloatingStrikes, atmVolatility, DoubleVector.getCPtr(vols), vols, alpha, beta, nu, rho, gamma), true);
  }

  public double alpha() {
    return QuantLibJNI.ZabrShortMaturityLognormalInterpolatedSmileSection_alpha(swigCPtr, this);
  }

  public double beta() {
    return QuantLibJNI.ZabrShortMaturityLognormalInterpolatedSmileSection_beta(swigCPtr, this);
  }

  public double nu() {
    return QuantLibJNI.ZabrShortMaturityLognormalInterpolatedSmileSection_nu(swigCPtr, this);
  }

  public double rho() {
    return QuantLibJNI.ZabrShortMaturityLognormalInterpolatedSmileSection_rho(swigCPtr, this);
  }

  public double rmsError() {
    return QuantLibJNI.ZabrShortMaturityLognormalInterpolatedSmileSection_rmsError(swigCPtr, this);
  }

  public double maxError() {
    return QuantLibJNI.ZabrShortMaturityLognormalInterpolatedSmileSection_maxError(swigCPtr, this);
  }

  public EndCriteria.Type endCriteria() {
    return EndCriteria.Type.swigToEnum(QuantLibJNI.ZabrShortMaturityLognormalInterpolatedSmileSection_endCriteria(swigCPtr, this));
  }

}
