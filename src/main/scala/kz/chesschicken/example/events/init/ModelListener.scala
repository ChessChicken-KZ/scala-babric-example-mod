package kz.chesschicken.example.events.init

import kz.chesschicken.example.events.init.ModelListener.CUSTOM_MODEL
import net.modificationstation.stationapi.api.client.event.model.ModelRegister
import net.modificationstation.stationapi.api.common.event.EventListener
import net.modificationstation.stationapi.impl.client.model.{CustomModel, CustomModelRenderer}

object ModelListener {

  var CUSTOM_MODEL: CustomModel = _

}

class ModelListener {
  @EventListener def registerModels(event: ModelRegister): Unit = {
    CUSTOM_MODEL = new CustomModelRenderer("/assets/examplemod/stationapi/models/model.json", "examplemod").getEntityModelBase
  }

}

