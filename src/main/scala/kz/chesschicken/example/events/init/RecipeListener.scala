package kz.chesschicken.example.events.init

import net.mine_diver.unsafeevents.listener.EventListener
import net.minecraft.block.BlockBase
import net.minecraft.item.{ItemBase, ItemInstance}
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent
import net.modificationstation.stationapi.api.recipe.{CraftingRegistry, SmeltingRegistry}

class RecipeListener {

  @EventListener def registerRecipes(event: RecipeRegisterEvent): Unit = {

    val `type` = event.recipeId
    if (`type` eq RecipeRegisterEvent.Vanilla.CRAFTING_SHAPED.`type`) CraftingRegistry.addShapedRecipe(new ItemInstance(ItemListener.coolItem, 1), "XXX", "X X", "X X", 'X', BlockBase.DIRT)
    if (`type` eq RecipeRegisterEvent.Vanilla.SMELTING.`type`) SmeltingRegistry.addSmeltingRecipe(new ItemInstance(ItemBase.apple, 1), new ItemInstance(BlockBase.WOOL))
    if (`type` eq RecipeRegisterEvent.Vanilla.CRAFTING_SHAPELESS.`type`) {
      CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.exampleBlock, 1), new ItemInstance(BlockBase.DIRT))
      CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.exampleBlock2, 1), new ItemInstance(BlockBase.DIRT), new ItemInstance(BlockBase.DIRT))
    }

  }

}
