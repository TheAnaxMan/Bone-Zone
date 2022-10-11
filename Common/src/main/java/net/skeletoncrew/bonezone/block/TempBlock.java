package net.skeletoncrew.bonezone.block;

import net.darkhax.bookshelf.api.block.IBindRenderLayer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.Wearable;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class TempBlock extends Block implements IBindRenderLayer, Wearable {

    // TODO The ItemBlock is probably enchantable which we don't want

    private static final BlockBehaviour.Properties PROPERTIES = BlockBehaviour.Properties.of(Material.DECORATION).strength(0.4F).sound(SoundType.BONE_BLOCK).noOcclusion();

    public TempBlock() {

        super(PROPERTIES);
    }

    @Override
    public RenderType getRenderLayerToBind() {

        return RenderType.cutout();
    }
}