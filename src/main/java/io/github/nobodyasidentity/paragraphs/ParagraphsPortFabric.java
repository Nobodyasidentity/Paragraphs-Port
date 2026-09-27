package io.github.nobodyasidentity.paragraphs;

import net.fabricmc.api.ModInitializer;

public class ParagraphsPortFabric implements ModInitializer{
	@Override
	public void onInitialize(){
		ParagraphsPort.init("Fabric");
	}
}