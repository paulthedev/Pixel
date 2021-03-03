using EmbedIO;
using EmbedIO.Routing;
using EmbedIO.WebApi;
using System;
using System.Collections.Generic;
using System.Text;
using System.Threading.Tasks;

namespace PixelMatter.Controllers
{
    public class DeviceCommunicationController : WebApiController
    {
        public DeviceCommunicationController() : base()
        { }

        [Route(HttpVerbs.Post, "/senddata")]
        public async Task SendData(object data)
        {
        }

        [Route(HttpVerbs.Get, "/getdevices")]
        public async Task<List<string>> GetDevices(object data)
        {
            List<string> devices = new List<string>();
            devices.Add("device one");
            devices.Add("device two");
            devices.Add("device three");

            return devices;
        }
    }
}
