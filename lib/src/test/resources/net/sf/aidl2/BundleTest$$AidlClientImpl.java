// AUTO-GENERATED FILE.  DO NOT MODIFY.
package net.sf.aidl2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.Deprecated;
import java.lang.Override;

/**
 * Perform IPC calls according to the interface contract.
 *
 * You can create instances of this class, using {@link InterfaceLoader}.
 *
 * @deprecated — do not use this class directly in your Java code (see above)
 */
@Deprecated
public final class BundleTest$$AidlClientImpl implements BundleTest {
    private final IBinder delegate;

    public BundleTest$$AidlClientImpl(IBinder delegate) throws RemoteException {
        this.delegate = delegate;
    }

    @Override
    public IBinder asBinder() {
        return delegate;
    }

    @Override
    public Bundle methodWithBundleParameter(Bundle bundle) throws RemoteException {
        Parcel data = Parcel.obtain();
        Parcel reply = Parcel.obtain();
        try {
            data.writeInterfaceToken(BundleTest$$AidlServerImpl.DESCRIPTOR);

            data.writeBundle(bundle);

            delegate.transact(BundleTest$$AidlServerImpl.TRANSACT_methodWithBundleParameter, data, reply, 0);
            reply.readException();

            return reply.readBundle(getClass().getClassLoader());
        } finally {
            data.recycle();
            reply.recycle();
        }
    }
}
