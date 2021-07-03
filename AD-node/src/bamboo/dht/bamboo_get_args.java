/*
 * Automatically generated by jrpcgen 1.0.5 on 7/1/08 11:04 AM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://acplt.org/ks/remotetea.html for details
 */
package bamboo.dht;
import org.acplt.oncrpc.*;
import java.io.IOException;

public class bamboo_get_args implements XdrAble {
    public String application;
    public String client_library;
    public bamboo_key key;
    public int maxvals;
    public bamboo_placemark placemark;

    public bamboo_get_args() {
    }

    public bamboo_get_args(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        xdr.xdrEncodeString(application);
        xdr.xdrEncodeString(client_library);
        key.xdrEncode(xdr);
        xdr.xdrEncodeInt(maxvals);
        placemark.xdrEncode(xdr);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        application = xdr.xdrDecodeString();
        client_library = xdr.xdrDecodeString();
        key = new bamboo_key(xdr);
        maxvals = xdr.xdrDecodeInt();
        placemark = new bamboo_placemark(xdr);
    }

}
// End of bamboo_get_args.java
