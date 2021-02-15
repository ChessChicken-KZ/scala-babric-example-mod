package kz.chesschicken.example

import net.minecraft.block.BlockBase
import net.minecraft.item.ItemInstance
import net.modificationstation.stationapi.api.common.event.recipe.RecipeRegister
import net.modificationstation.stationapi.api.common.event.recipe.RecipeRegister.Vanilla
import net.modificationstation.stationapi.api.common.recipe.{CraftingRegistry, SmeltingRegistry}
import net.modificationstation.stationapi.api.common.registry.Identifier


class RecipeListener extends Object with RecipeRegister{
  override def registerRecipes(identifier: Identifier): Unit = {
    val idVal = Vanilla.fromType(identifier)
    idVal match
    {
      case Vanilla.CRAFTING_SHAPELESS =>
        CraftingRegistry.INSTANCE.addShapelessRecipe(new ItemInstance(ModListener.exampleBlock), ModListener.exampleItem)
        CraftingRegistry.INSTANCE.addShapelessRecipe(new ItemInstance(ModListener.exampleItem), ModListener.exampleBlock)

      case Vanilla.SMELTING =>
        SmeltingRegistry.INSTANCE.addSmeltingRecipe(new ItemInstance(BlockBase.WOOD), new ItemInstance(ModListener.exampleBlock))
      case _ =>
    }

  }
}
