package kz.chesschicken.example

import net.minecraft.block.material.Material
import net.modificationstation.stationapi.api.client.event.texture.TextureRegister
import net.modificationstation.stationapi.api.client.texture.{TextureFactory, TextureRegistry}
import net.modificationstation.stationapi.api.common.block.BlockRegistry
import net.modificationstation.stationapi.api.common.event.block.BlockRegister
import net.modificationstation.stationapi.api.common.event.item.ItemRegister
import net.modificationstation.stationapi.api.common.item.ItemRegistry
import net.modificationstation.stationapi.api.common.preset.block.BlockBase
import net.modificationstation.stationapi.api.common.preset.item.ItemBase
import net.modificationstation.stationapi.api.common.registry.{Identifier, ModID}

class ScalaListener extends Object with BlockRegister with ItemRegister with TextureRegister
{
  var exampleBlock: net.minecraft.block.BlockBase = null
  var exampleItem: net.minecraft.item.ItemBase = null

  override def registerBlocks(blockRegistry: BlockRegistry, modID: ModID): Unit = {
    exampleBlock = new BlockBase(Identifier.of(modID, "exampleBlock"), Material.CLAY).setName("exampleBlock")
  }

  override def registerItems(itemRegistry: ItemRegistry, modID: ModID): Unit = {
    exampleItem = new ItemBase(Identifier.of(modID, "exampleItem")).setName("exampleItem")
  }

  override def registerTextures(): Unit = {
    exampleBlock.texture = TextureFactory.INSTANCE.addTexture(TextureRegistry.getRegistry("TERRAIN"), "/assets/modid/textures/calm_scala.png")
    exampleItem.setTexturePosition(TextureFactory.INSTANCE.addTexture(TextureRegistry.getRegistry("GUI_ITEMS"), "/assets/modid/textures/calm_scala.png"))

  }
}
