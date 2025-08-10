package de.shadowdara.coppertools;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import de.shadowdara.coppertools.item.ModItems;

public class Coppertools implements ModInitializer {
    public static final String MOD_ID = "coppertools";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}
