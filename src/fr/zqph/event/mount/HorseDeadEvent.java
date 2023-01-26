package fr.zqph.event.mount;


import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;


public class HorseDeadEvent implements Listener {
    @EventHandler
    public void Death(EntityDeathEvent event){
        if(event.getEntityType() == EntityType.HORSE) {
            event.getEntity().getPassenger().sendMessage("§cVotre cheval est mort");
            event.getDrops().clear();
        }
    }
}
