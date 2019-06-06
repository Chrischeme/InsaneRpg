using System;
using UdpFacade.Gateway;
using UdpFacade.Models;

namespace UdpFacade
{
    public class UdpFacade
    {
        private ClientGateway _clientGateway;

        public UdpFacade()
        {
            _clientGateway = new ClientGateway();
        }
        public void SendNearbyDataToClients(ServerData serverData)
        {
            _clientGateway.SendNearbyDataToClients(serverData);
        }
    }
}
