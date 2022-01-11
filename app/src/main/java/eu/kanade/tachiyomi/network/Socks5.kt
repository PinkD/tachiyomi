import okhttp3.OkHttpClient
import java.net.InetSocketAddress
import java.net.Proxy

fun OkHttpClient.Builder.socks5Proxy() = proxy(
    Proxy(Proxy.Type.SOCKS, InetSocketAddress("192.168.111.233", 1080))
)
