package io.github.nobodyasidentity.paragraphs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParagraphsPort{
	public static final String MOD_ID="paragraphs_port";
    public static final String MOD_NAME="Paragraphs Port";
	public static final Logger LOGGER=LoggerFactory.getLogger(MOD_ID);

	public static void init(String mod_loader){
		LOGGER.info(MOD_NAME+" is here on "+mod_loader+"!");
	}
    public static void init(){
		LOGGER.info(MOD_NAME+" is here!");
	}
}