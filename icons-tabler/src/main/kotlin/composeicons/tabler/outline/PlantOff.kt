package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlantOff: ImageVector
    get() {
        if (_plantOff != null) return _plantOff!!
        _plantOff = tablerOutlineIcon(
            name = "PlantOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 17v2c0 1.105-.895 2-2 2h-6C7.895 21 7 20.105 7 19v-4h8")
            addPathData("M11.9 7.908C11.449 5.47 9.546 3.561 7.11 3.102M3 3v2c0 3.314 2.686 6 6 6h2")
            addPathData("M12.531 8.528C13.502 6.38 15.642 4.999 18 5h3v1c0 2.942-2.133 5.451-5.037 5.923")
            addPathData("M12 15v-3")
            addPathData("M3 3 21 21")
        }
        return _plantOff!!
    }

private var _plantOff: ImageVector? = null
