package kz.chesschicken.example.events.init


import net.mine_diver.unsafeevents.listener.EventListener
import net.modificationstation.stationapi.api.event.mod.InitEvent
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint
import net.modificationstation.stationapi.api.registry.ModID
import net.modificationstation.stationapi.api.util.Null
import org.apache.logging.log4j.Logger

class ServerInitListener {

  @Entrypoint.ModID private val MOD_ID: ModID = Null.get

  @Entrypoint.Logger private val LOGGER: Logger = Null.get

  @EventListener private def serverInit(event: InitEvent): Unit = {
    LOGGER.error(MOD_ID.toString)
  }

}
