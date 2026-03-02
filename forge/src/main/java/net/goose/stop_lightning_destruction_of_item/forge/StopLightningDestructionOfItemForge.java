package net.goose.stop_lightning_destruction_of_item.forge;

import net.goose.stop_lightning_destruction_of_item.StopLightningDestructionOfItem;
import net.minecraftforge.fml.common.Mod;

@Mod(StopLightningDestructionOfItem.MOD_ID)
public final class StopLightningDestructionOfItemForge {
    public StopLightningDestructionOfItemForge() {
        // Run our common setup.
        StopLightningDestructionOfItem.init();
    }
}
