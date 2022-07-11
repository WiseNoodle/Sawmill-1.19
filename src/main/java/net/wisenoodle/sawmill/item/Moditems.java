package net.wisenoodle.sawmill.item;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.wisenoodle.sawmill.Sawmill;

public class Moditems {



    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Sawmill.MOD_ID, name), item);
    }
    public static void registerModItems(){
        Sawmill.LOGGER.debug("Registering Mod Items for " + Sawmill.MOD_ID);
    }
}
