/*
 * This file is part of MyPlugin.
 * Copyright (C) 2017 EndlessCode Group
 * Copyright (C) 2017 Osip Fatkullin
 *
 * MyPlugin is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MyPlugin is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MyPlugin.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.example.myplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {
    @Override
    public void onLoad() {
        getLogger().info("My plugin loaded!");
    }

    @Override
    public void onEnable() {
        getLogger().info("My plugin enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("My plugin disabled!");
    }
}
