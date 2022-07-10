package net.wisenoodle.sawmill.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.wisenoodle.sawmill.Sawmill;

public class Moditems {

    public static final Item SAWMILL = registerItem("sawmill", // dupe this line for more items
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Sawmill.MOD_ID, name), item);
    }
    public static void registerModItems(){
        Sawmill.LOGGER.debug("Registering Mod Items for " + Sawmill.MOD_ID);
    }
}
