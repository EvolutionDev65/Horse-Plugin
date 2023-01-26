package fr.zqph.helper;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class HorseHelpers {

    public static void spawnHorse(Player player){
        Horse horse = (org.bukkit.entity.Horse) player.getWorld().spawnEntity(player.getLocation(), EntityType.HORSE);
        horse.setCustomName("§c " + player.getDisplayName() + " Horse");
        horse.setTamed(true);
        horse.setOwner(player);
        horse.getInventory().setSaddle(new ItemStack(Material.SADDLE));
        horse.setPassenger(player);
        player.playSound(player.getLocation(), Sound.HORSE_JUMP, 1, 1);
    }

    public static boolean isOnHorse(Player player){
       return player.isInsideVehicle();
    }

}
