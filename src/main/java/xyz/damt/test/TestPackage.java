package xyz.damt.test;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import xyz.damt.ItemEnum;

public class TestPackage implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Player player = e.getPlayer();
        String[] args = e.getMessage().split("\\s+"); //just a small thingy to help ya out ;)

        if (args[0].equalsIgnoreCase("#ultimatesword")) {
            ItemEnum.UTLTIMATE_SWORD.addItemToInventory(player);
        }

    }

}
