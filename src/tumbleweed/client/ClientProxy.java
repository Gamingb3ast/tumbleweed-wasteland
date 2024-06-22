package tumbleweed.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import tumbleweed.common.CommonProxy;
import tumbleweed.common.EntityTumbleweed;

public class ClientProxy extends CommonProxy
{
	@Override
	public void initClient()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityTumbleweed.class, new RenderTumbleweed());
	}
}