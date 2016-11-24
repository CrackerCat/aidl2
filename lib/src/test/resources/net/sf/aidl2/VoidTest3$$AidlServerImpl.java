// AUTO-GENERATED FILE.  DO NOT MODIFY.
package net.sf.aidl2;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.Deprecated;
import java.lang.Override;
import java.lang.String;
import java.lang.Void;

/**
 * Handle incoming IPC calls by forwarding them to provided delegate.
 *
 * You can create instances of this class, using {@link InterfaceLoader}.
 *
 * @deprecated — do not use this class directly in your Java code (see above)
 */
@Deprecated
public final class VoidTest3$$AidlServerImpl extends Binder {
    static final String DESCRIPTOR = "net.sf.aidl2.VoidTest3";

    static final int TRANSACT_methodWithBiCharArrayReturn = IBinder.FIRST_CALL_TRANSACTION;

    private final VoidTest3 delegate;

    public VoidTest3$$AidlServerImpl(VoidTest3 delegate) {
        this.delegate = delegate;

        this.attachInterface(delegate, DESCRIPTOR);
    }

    @Override
    protected boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
        switch(code) {
            case TRANSACT_methodWithBiCharArrayReturn: {
                data.enforceInterface(this.getInterfaceDescriptor());

                final Void[] voidVararg = null;

                delegate.methodWithBiCharArrayReturn(voidVararg);
                reply.writeNoException();

                return true;
            }
        }
        return super.onTransact(code, data, reply, flags);
    }
}
