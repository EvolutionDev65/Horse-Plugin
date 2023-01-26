package fr.zqph.event.mount;


import org.bukkit.entity.Horse;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.spigotmc.event.entity.EntityDismountEvent;

public class HorseDismountEvent implements Listener {
    @EventHandler
    public void HorseDismount(EntityDismountEvent event) {
        if (event.getDismounted() instanceof Horse && event.getEntity() instanceof Player) {
            if (event.getDismounted().getCustomName().equals(("§c " + ((Player) event.getEntity()).getDisplayName() + " Horse"))) {
                event.getDismounted().remove();
                event.getEntity().sendMessage("§cVotre cheval est mort.");
            }
        }
    }
}
