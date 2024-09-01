package net.goose.stop_lightning_destruction_of_item.fabric;

import net.fabricmc.api.ModInitializer;
import net.goose.stop_lightning_destruction_of_item.StopLightningDestructionOfItem;

public final class StopLightningDestructionOfItemFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        StopLightningDestructionOfItem.init();
    }
}
