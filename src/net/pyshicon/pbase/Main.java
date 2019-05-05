package net.pyshicon.pbase;

import net.pyshicon.pbase.util.Message;
import net.pyshicon.pbase.util.Prefix;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable() {
        Message.sendConsole(Prefix.get() + "thank you for using pBase library v0.0.1, made by Pyshicon.");
    }
}
