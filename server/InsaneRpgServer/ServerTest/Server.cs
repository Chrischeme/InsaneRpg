using SimpleTCP;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Sockets;
using System.Text;
using System.Threading.Tasks;

namespace ServerTest
{
    public class Server
    {
        private SimpleTcpServer _simpleTcpServer;
        public Server()
        {
            _simpleTcpServer = new SimpleTcpServer();
            _simpleTcpServer.Delimiter = 0x13;
            _simpleTcpServer.StringEncoder = Encoding.UTF8;
            _simpleTcpServer.DataReceived += Server_DataRecieved;
            var ip = new IPAddress(127001);
            _simpleTcpServer.Start(ip, 8000);
        }

        private void Server_DataRecieved(object sender, Message e)
        {
            Console.WriteLine($"You said: {e.MessageString}");
        }

        public void StopServer()
        {
            _simpleTcpServer.Stop();
        }
    }
}
