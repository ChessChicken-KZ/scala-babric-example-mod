package kz.chesschicken.example.events.init

import net.minecraft.block.BlockBase
import net.minecraft.item.{ItemBase, ItemInstance}
import net.modificationstation.stationapi.api.common.event.EventListener
import net.modificationstation.stationapi.api.common.event.recipe.RecipeRegister
import net.modificationstation.stationapi.api.common.recipe.{CraftingRegistry, SmeltingRegistry}

class RecipeListener {

  @EventListener def registerRecipes(event: RecipeRegister): Unit = {

    //Sometimes I am acting surprisingly
    val `type` = event.recipeId
    if (`type` eq RecipeRegister.Vanilla.CRAFTING_SHAPED.`type`) CraftingRegistry.INSTANCE.addShapedRecipe(new ItemInstance(ItemListener.coolItem, 1), "XXX", "X X", "X X", 'X', BlockBase.DIRT)
    if (`type` eq RecipeRegister.Vanilla.SMELTING.`type`) SmeltingRegistry.INSTANCE.addSmeltingRecipe(new ItemInstance(ItemBase.apple, 1), new ItemInstance(BlockBase.WOOL))
    if (`type` eq RecipeRegister.Vanilla.CRAFTING_SHAPELESS.`type`) {
      CraftingRegistry.INSTANCE.addShapelessRecipe(new ItemInstance(BlockListener.exampleBlock, 1), new ItemInstance(BlockBase.DIRT))
      CraftingRegistry.INSTANCE.addShapelessRecipe(new ItemInstance(BlockListener.exampleBlock2, 1), new ItemInstance(BlockBase.DIRT), new ItemInstance(BlockBase.DIRT))
    }

  }

}
