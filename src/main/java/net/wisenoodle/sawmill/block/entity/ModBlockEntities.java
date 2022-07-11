package net.wisenoodle.sawmill.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.wisenoodle.sawmill.Sawmill;
import net.wisenoodle.sawmill.block.ModBlocks;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static BlockEntityType<SawmillBlockEntity> SAWMILL;

    public static void registerAllBlockEntities(){
        SAWMILL = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(Sawmill.MOD_ID, "sawmill"),
                FabricBlockEntityTypeBuilder.create(SawmillBlockEntity::new,
                    ModBlocks.SAWMILL).build(null));
    }

}
