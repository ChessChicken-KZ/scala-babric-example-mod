package kz.chesschicken.example.events.init

import net.mine_diver.unsafeevents.listener.EventListener
import net.minecraft.block.BlockBase
import net.minecraft.item.{ItemBase, ItemInstance}
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent
import net.modificationstation.stationapi.api.recipe.{CraftingRegistry, SmeltingRegistry}

class RecipeListener {

  @EventListener def registerRecipes(event: RecipeRegisterEvent): Unit = {
    val crafting_shaped = RecipeRegisterEvent.Vanilla.CRAFTING_SHAPED.`type`
    val crafting_shapeless = RecipeRegisterEvent.Vanilla.CRAFTING_SHAPELESS.`type`
    val smelting = RecipeRegisterEvent.Vanilla.SMELTING.`type`


    event.recipeId match {
      case crafting_shaped =>
        CraftingRegistry.addShapedRecipe(new ItemInstance(ItemListener.coolItem, 1), "XXX", "X X", "X X", 'X', BlockBase.DIRT)

      case crafting_shapeless =>
        CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.exampleBlock, 1), new ItemInstance(BlockBase.DIRT))
        CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.exampleBlock2, 1), new ItemInstance(BlockBase.DIRT), new ItemInstance(BlockBase.DIRT))

      case smelting =>
        SmeltingRegistry.addSmeltingRecipe(new ItemInstance(ItemBase.apple, 1), new ItemInstance(BlockBase.WOOL))
    }
  }

}
