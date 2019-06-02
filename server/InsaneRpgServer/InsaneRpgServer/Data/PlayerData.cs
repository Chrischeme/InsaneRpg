using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace InsaneRpgServer.Data
{
    public sealed class PlayerData
    {
        public double coordinateX { get; set; }
        public double coordinateY { get; set; }
        public int health { get; set; }
        public int mana { get; set; }
    }
}
