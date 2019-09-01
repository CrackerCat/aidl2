// AUTO-GENERATED FILE.  DO NOT MODIFY.
package net.sf.aidl2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.Deprecated;
import java.lang.Object;
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
public final class TheObjectReturn$$AidlClientImpl implements TheObjectReturn {
    private final IBinder delegate;

    public TheObjectReturn$$AidlClientImpl(IBinder delegate) throws RemoteException {
        this.delegate = delegate;
    }

    @Override
    public IBinder asBinder() {
        return delegate;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Object methodWithObjectReturn() throws RemoteException {
        Parcel data = Parcel.obtain();
        Parcel reply = Parcel.obtain();
        try {
            data.writeInterfaceToken(TheObjectReturn$$AidlServerImpl.DESCRIPTOR);

            delegate.transact(TheObjectReturn$$AidlServerImpl.TRANSACT_methodWithObjectReturn, data, reply, 0);
            reply.readException();

            return reply.readValue(getClass().getClassLoader());
        } finally {
            data.recycle();
            reply.recycle();
        }
    }
}
