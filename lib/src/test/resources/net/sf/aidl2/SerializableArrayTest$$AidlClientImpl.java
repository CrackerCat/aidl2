// AUTO-GENERATED FILE.  DO NOT MODIFY.
package net.sf.aidl2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.File;
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
public final class SerializableArrayTest$$AidlClientImpl implements SerializableArrayTest {
    private final IBinder delegate;

    public SerializableArrayTest$$AidlClientImpl(IBinder delegate) throws RemoteException {
        this.delegate = delegate;
    }

    @Override
    public IBinder asBinder() {
        return delegate;
    }

    @Override
    public void methodWithSerializableArrayParameter(File[] files) throws RemoteException {
        Parcel data = Parcel.obtain();
        Parcel reply = Parcel.obtain();
        try {
            data.writeInterfaceToken(SerializableArrayTest$$AidlServerImpl.DESCRIPTOR);

            AidlUtil.writeToObjectStream(data, files);

            delegate.transact(SerializableArrayTest$$AidlServerImpl.TRANSACT_methodWithSerializableArrayParameter, data, reply, 0);
            reply.readException();
        } finally {
            data.recycle();
            reply.recycle();
        }
    }
}
