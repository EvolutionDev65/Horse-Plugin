package fr.zqph;

import fr.zqph.commands.MountCommand;
import fr.zqph.event.mount.HorseDeadEvent;
import fr.zqph.event.mount.HorseDismountEvent;
import fr.zqph.event.mount.HorseGuiEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("mount").setExecutor(new MountCommand());

        getServer().getPluginManager().registerEvents(new HorseDeadEvent(), this);
        getServer().getPluginManager().registerEvents(new HorseDismountEvent(), this);
        getServer().getPluginManager().registerEvents(new HorseGuiEvent(), this);

    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
