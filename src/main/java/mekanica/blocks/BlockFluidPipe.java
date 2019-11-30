package mekanica.blocks;

import mekanica.Mekanica;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class BlockFluidPipe extends Block {

    @GameRegistry.ObjectHolder(Mekanica.MODID + ":fluidpipe")
    public static BlockFluidPipe INSTANCE;

    public BlockFluidPipe() {
        super(Material.ROCK);
    }

    public void registerItems(IForgeRegistry<Item> registry) {

    }
}
