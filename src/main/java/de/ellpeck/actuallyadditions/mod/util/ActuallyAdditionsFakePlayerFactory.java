package de.ellpeck.actuallyadditions.mod.util;

import com.mojang.authlib.GameProfile;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.util.FakePlayerFactory;

import java.util.UUID;

public class ActuallyAdditionsFakePlayerFactory {
    private static GameProfile AAProfile = new GameProfile(UUID.fromString("actually_additions"), "Actually Additions");
    public static FakePlayer get(WorldServer world, BlockPos pos){
        FakePlayer player = FakePlayerFactory.get(world, AAProfile);
        player.setWorld(world);
        player.setPosition(pos.getX(), pos.getY(), pos.getZ());
        return player;
    }

    public static FakePlayer getDefault(WorldServer world){
        return get(world, world.getSpawnPoint());
    }
}
