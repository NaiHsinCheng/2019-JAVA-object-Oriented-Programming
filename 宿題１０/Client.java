import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

class Client {
    public static void main(String args[]) {
        try {
            InetAddress addr = InetAddress.getByName(args[0]);
            int port = Integer.parseInt(args[1]); //サーバ側の待受ポート番号

            // 送信するパケットを生成
            byte buffer[] = args[2].getBytes();
            DatagramPacket dp = new DatagramPacket(buffer, buffer.length, addr, port);

            // ソケットを生成してパケットを送信
            DatagramSocket ds = new DatagramSocket();
            ds.send(dp);
            ds.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
