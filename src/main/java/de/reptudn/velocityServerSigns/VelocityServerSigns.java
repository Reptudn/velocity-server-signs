package de.reptudn.velocityServerSigns;

import de.reptudn.velocityServerSigns.utils.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public final class VelocityServerSigns extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Logger.log("VelocityServerSigns has been enabled.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        Logger.log("VelocityServerSigns has been disabled.");
    }
}
