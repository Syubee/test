package io.github.syubee.shoptest;

import io.github.syubee.shoptest.commands.GiveDia;
import io.github.syubee.shoptest.commands.Help;
import io.github.syubee.shoptest.commands.OpenInv;
import io.github.syubee.shoptest.event.BreakEvent;
import org.bukkit.plugin.java.JavaPlugin;

import static org.bukkit.Bukkit.getPluginCommand;

public final class ShopTest extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("플러그인 활성화");
        getServer().getPluginManager().registerEvents(new BreakEvent(), this);
        getServer().getPluginCommand("thelp").setExecutor(new Help());;
        getServer().getPluginCommand("tgivedia").setExecutor(new GiveDia());
        getPluginCommand("상점").setExecutor(new OpenInv());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("플러그인 비활성화");
    }
}
