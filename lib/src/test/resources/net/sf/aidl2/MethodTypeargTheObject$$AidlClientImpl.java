// AUTO-GENERATED FILE.  DO NOT MODIFY.
package net.sf.aidl2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.Deprecated;
import java.lang.Override;
import java.lang.SuppressWarnings;

/**
 * Perform IPC calls according to the interface contract.
 *
 * You can create instances of this class, using {@link InterfaceLoader}.
 *
 * @deprecated — do not use this class directly in your Java code (see above)
 */
@Deprecated
public final class MethodTypeargTheObject$$AidlClientImpl implements MethodTypeargTheObject {
    private final IBinder delegate;

    public MethodTypeargTheObject$$AidlClientImpl(IBinder delegate) {
        this.delegate = delegate;
    }

    @Override
    public IBinder asBinder() {
        return delegate;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> void methodWithObjectParameter(T object) throws RemoteException {
        Parcel data = Parcel.obtain();
        Parcel reply = Parcel.obtain();
        try {
            data.writeInterfaceToken(MethodTypeargTheObject$$AidlServerImpl.DESCRIPTOR);

            data.writeValue(object);

            delegate.transact(MethodTypeargTheObject$$AidlServerImpl.TRANSACT_methodWithObjectParameter, data, reply, 0);
            reply.readException();
        } finally {
            data.recycle();
            reply.recycle();
        }
    }
}
