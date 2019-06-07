using System;
using System.Collections.Generic;
using System.Net.Sockets;
using System.Text;

namespace UdpFacade.Models
{
    public class ServerData
    {
        public GameData GameData { get; }
        public List<ClientData> ClientDataList { get; }
    }
}
