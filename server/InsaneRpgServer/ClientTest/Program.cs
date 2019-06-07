using System;
using System.Net;
using System.Net.Sockets;
using System.Text;
using UdpFacade.Models;

public class Program
{
    private const int listenPort = 11000;
    static void Main(string[] args)
    {
        UdpSocket s = new UdpSocket();
        s.Server("127.0.0.1", 27000);

        UdpSocket c = new UdpSocket();
        c.Client("127.0.0.1", 27000);
        c.Send("TEST!");

        Console.ReadKey();
    }
}