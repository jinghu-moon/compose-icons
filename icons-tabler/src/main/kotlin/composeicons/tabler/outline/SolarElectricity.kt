package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SolarElectricity: ImageVector
    get() {
        if (_solarElectricity != null) return _solarElectricity!!
        _solarElectricity = tablerOutlineIcon(
            name = "SolarElectricity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6.28v11.44c0 .308 .142 .599 .385 .788 .243 .189 .559 .257 .858 .182l6-1.5c.445-.111 .757-.511 .757-.97v-8.44c-0-.459-.312-.859-.757-.97l-6-1.5c-.299-.075-.615-.008-.858 .182C4.142 5.681 4 5.972 4 6.28")
            addPathData("M8 6v12")
            addPathData("M12 12h-8")
            addPathData("M20 7l-3 5h4l-3 5")
        }
        return _solarElectricity!!
    }

private var _solarElectricity: ImageVector? = null
