/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

namespace cAudio {

using System;
using System.Runtime.InteropServices;

public class IThread : IDisposable {
  private HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal IThread(IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(IThread obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~IThread() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          cAudioCSharpWrapperPINVOKE.delete_IThread(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
    }
  }

  public virtual bool start() {
    bool ret = cAudioCSharpWrapperPINVOKE.IThread_start(swigCPtr);
    return ret;
  }

  public virtual void join() {
    cAudioCSharpWrapperPINVOKE.IThread_join(swigCPtr);
  }

  public virtual void shutdown() {
    cAudioCSharpWrapperPINVOKE.IThread_shutdown(swigCPtr);
  }

  public virtual bool isRunning() {
    bool ret = cAudioCSharpWrapperPINVOKE.IThread_isRunning(swigCPtr);
    return ret;
  }

}

}