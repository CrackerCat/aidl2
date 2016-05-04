// AUTO-GENERATED FILE.  DO NOT MODIFY.
package net.sf.aidl2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.Deprecated;
import java.lang.Override;
import java.lang.Void;

/**
 * Perform IPC calls according to the interface contract.
 *
 * You can create instances of this class, using {@link InterfaceLoader}.
 *
 * @deprecated — do not use this class directly in your Java code (see above)
 */
@Deprecated
public final class VoidTest$$AidlClientImpl implements VoidTest {
    private final IBinder delegate;

    public VoidTest$$AidlClientImpl(IBinder delegate) {
        this.delegate = delegate;
    }

    @Override
    public IBinder asBinder() {
        return delegate;
    }

    @Override
    public Void methodWithVoidReturn() throws RemoteException {
        Parcel data = Parcel.obtain();
        Parcel reply = Parcel.obtain();
        try {
            data.writeInterfaceToken(VoidTest$$AidlServerImpl.DESCRIPTOR);

            delegate.transact(VoidTest$$AidlServerImpl.TRANSACT_methodWithVoidReturn, data, reply, 0);
            reply.readException();

            return null;
        } finally {
            data.recycle();
            reply.recycle();
        }
    }
}
