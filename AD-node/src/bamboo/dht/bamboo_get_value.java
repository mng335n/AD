/*
 * Automatically generated by jrpcgen 1.0.5 on 7/1/08 11:04 AM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://acplt.org/ks/remotetea.html for details
 */
package bamboo.dht;
import org.acplt.oncrpc.*;
import java.io.IOException;

public class bamboo_get_value implements XdrAble {
    public bamboo_value value;
    public int ttl_sec_rem;
    public bamboo_hash secret_hash;

    public bamboo_get_value() {
    }

    public bamboo_get_value(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        value.xdrEncode(xdr);
        xdr.xdrEncodeInt(ttl_sec_rem);
        secret_hash.xdrEncode(xdr);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        value = new bamboo_value(xdr);
        ttl_sec_rem = xdr.xdrDecodeInt();
        secret_hash = new bamboo_hash(xdr);
    }

}
// End of bamboo_get_value.java
