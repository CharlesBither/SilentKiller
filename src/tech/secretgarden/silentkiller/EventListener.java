package tech.secretgarden.silentkiller;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class EventListener implements Listener {
    @EventHandler
    public void death(PlayerDeathEvent e) {
        Player player = e.getEntity().getPlayer();
        if (player.getKiller().isInvisible()) {
            e.setDeathMessage(null);
        }
    }
}
