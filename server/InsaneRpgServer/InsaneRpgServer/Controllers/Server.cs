using SimpleTCP;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Sockets;
using System.Text;
using System.Threading.Tasks;

namespace InsaneRpgServer.Controllers
{
    public class Server
    {
        private SimpleTcpServer _simpleTcpServer;
        public static void main()
        {

        }
        public Server()
        {
            _simpleTcpServer = new SimpleTcpServer();
            _simpleTcpServer.Delimiter = 0x13;
            _simpleTcpServer.StringEncoder = Encoding.UTF8;
            _simpleTcpServer.DataReceived += Server_DataRecieved;
        }

        private void Server_DataRecieved(object sender, Message e)
        {
            e.ReplyLine(string.Format("You said: {0}", e.MessageString));
        }
    }
}
