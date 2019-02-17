package net.runelite.client.plugins.tearsofguthix;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("tearsofguthix")
public interface TearsOfGuthixConfig extends Config
{
    @ConfigItem(
            position = 1,
            keyName = "showNextSkill",
            name = "Show the skill that will receive XP",
            description = "Toggle the display of the skill that will receive XP"
    )
    default boolean showNextSkill()
    {
        return false;
    }
}