using System;
using System.Collections.Generic;
using System.Text;
using UdpFacade.Models;

namespace UdpFacade.Gateway
{
    internal class ClientGateway
    {
        internal void SendNearbyDataToClients(ServerData serverData)
        {
            foreach (var client in serverData.ClientDataList)
            {
                SendNearbyDataToClient(client, serverData.GameData);
            }
        }

        internal void SendNearbyDataToClient(ClientData client, GameData gameData)
        {

        }
    }
}
