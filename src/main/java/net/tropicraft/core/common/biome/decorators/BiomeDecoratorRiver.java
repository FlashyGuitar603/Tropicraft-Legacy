package net.tropicraft.core.common.biome.decorators;

import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenClay;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.tropicraft.core.common.config.TropicsConfigs;

import java.util.Random;

public class BiomeDecoratorRiver extends BiomeDecoratorTropicraft{

    /** The clay generator. */
    public WorldGenerator clayGen = new WorldGenClay(4);

    protected void genDecorations(Biome biomeIn, World worldIn, Random random)
    {
            for (int l = 0; l < TropicsConfigs.clayTropicsRarity; l++)
            {
                int l1 = random.nextInt(16) + 8;
                int i6 = random.nextInt(16) + 8;
                this.clayGen.generate(worldIn, random, worldIn.getTopSolidOrLiquidBlock(this.chunkPos.add(l1, 0, i6)));
            }
    }
}