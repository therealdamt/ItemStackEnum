package xyz.damt;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public enum ItemEnum {

    UTLTIMATE_SWORD("&cUltimate Sword", Material.DIAMOND_SWORD, 1, 0);


    private final String itemName;
    private final Material itemType;
    private final int itemData;
    private final ItemMeta meta;
    private final int itemAmount;
    private final ItemStack stack;


    ItemEnum(String itemName, Material itemType, int itemAmount, int itemData) {
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemAmount = itemAmount;
        this.itemData = itemData;


        this.stack = new ItemStack(itemType, itemAmount, (byte) itemData);
        this.meta = this.stack.getItemMeta();
        this.meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', itemName));
        this.stack.setItemMeta(this.meta);
    }

    public void setItemInInventory(Player player, int slot) {
        player.getInventory().setItem(slot - 1, this.stack);
    }

    public void addItemToInventory(Player player) {
        player.getInventory().addItem(this.stack);
    }

    public void removeItemFromInventory(Player player) {
        player.getInventory().remove(this.stack);
    }

    public String getItemName() {
        return this.itemName;
    }

    public Material getItemType() {
        return this.itemType;
    }

    public int getItemData() {
        return this.itemData;
    }

}
