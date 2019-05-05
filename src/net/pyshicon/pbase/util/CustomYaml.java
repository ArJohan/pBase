package net.pyshicon.pbase.util;

import net.pyshicon.pbase.Main;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class CustomYaml {

    private File file;
    private YamlConfiguration yaml;

    public CustomYaml(String yaml_path, String yaml_name) {
        file = new File(JavaPlugin.getPlugin(Main.class).getDataFolder() + yaml_path, yaml_name + ".yml");
        yaml = YamlConfiguration.loadConfiguration(file);
    }

    public File getFile() {
        return file;
    }

    public YamlConfiguration getYaml() {
        return yaml;
    }

    public void save() {
        try {
            yaml.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load() {
        YamlConfiguration.loadConfiguration(file);
    }
}
