package fr.zqph.commands;


import fr.zqph.helper.HorseHelpers;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MountCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            if(HorseHelpers.isOnHorse(player)){
                player.sendMessage("§cTu as déjà un cheval");
                return false;
            }else{
                HorseHelpers.spawnHorse(player);
                return true;
            }
        }
        return false;
    }
}
