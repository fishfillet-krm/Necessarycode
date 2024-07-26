package TeamFS.necessarycode;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class NecessarycodeCore extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }
}
