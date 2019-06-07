using System;
using System.Collections.Generic;
using System.Net;
using System.Net.Sockets;
using System.Text;

namespace UdpFacade.Models
{
    public class ClientData
    {
        public struct UdpState
        {
            public UdpClient u;
            public IPEndPoint e;
        }

        public static bool messageReceived = false;
        public UdpClient ClientSocket { get; }
        public static void ReceiveCallback(IAsyncResult ar)
        {
            UdpClient u = ((UdpState)(ar.AsyncState)).u;
            IPEndPoint e = ((UdpState)(ar.AsyncState)).e;

            byte[] receiveBytes = u.EndReceive(ar, ref e);
            string receiveString = Encoding.ASCII.GetString(receiveBytes);

            Console.WriteLine($"Received: {receiveString}");
            messageReceived = true;
        }
    }
}
