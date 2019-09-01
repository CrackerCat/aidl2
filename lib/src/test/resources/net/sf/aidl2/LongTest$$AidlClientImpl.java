// AUTO-GENERATED FILE.  DO NOT MODIFY.
package net.sf.aidl2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.Deprecated;
import java.lang.Long;
import java.lang.Override;

/**
 * Perform IPC calls according to the interface contract.
 *
 * You can create instances of this class, using {@link InterfaceLoader}.
 *
 * @deprecated — do not use this class directly in your Java code (see above)
 */
@Deprecated
public final class LongTest$$AidlClientImpl implements LongTest {
    private final IBinder delegate;

    public LongTest$$AidlClientImpl(IBinder delegate) throws RemoteException {
        this.delegate = delegate;
    }

    @Override
    public IBinder asBinder() {
        return delegate;
    }

    @Override
    public void methodWithLongParameter(Long longParameter) throws RemoteException {
        Parcel data = Parcel.obtain();
        Parcel reply = Parcel.obtain();
        try {
            data.writeInterfaceToken(LongTest$$AidlServerImpl.DESCRIPTOR);

            if (longParameter == null) {
                data.writeByte((byte) -1);
            } else {
                data.writeByte((byte) 0);
                data.writeLong(longParameter);
            }

            delegate.transact(LongTest$$AidlServerImpl.TRANSACT_methodWithLongParameter, data, reply, 0);
            reply.readException();
        } finally {
            data.recycle();
            reply.recycle();
        }
    }
}
