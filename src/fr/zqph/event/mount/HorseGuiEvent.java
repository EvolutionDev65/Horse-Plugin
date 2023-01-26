package fr.zqph.event.mount;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class HorseGuiEvent implements Listener {
    @EventHandler
    public void GuiHouseInteract(InventoryClickEvent event){
        Inventory inv = event.getInventory();
        Player player = (Player) event.getWhoClicked();
        ItemStack current = event.getCurrentItem();

        if(current == null) return;

        if(inv.getName().equalsIgnoreCase("§c " + player.getDisplayName() + " Horse")){
            if(current.getType() == Material.SADDLE) {
                player.closeInventory();
                player.sendMessage("Vous ne pouvez pas récupérer la selle");
            }
        }
    }
}
