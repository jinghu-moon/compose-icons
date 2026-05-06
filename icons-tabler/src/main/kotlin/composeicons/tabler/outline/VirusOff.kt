package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VirusOff: ImageVector
    get() {
        if (_virusOff != null) return _virusOff!!
        _virusOff = tablerOutlineIcon(
            name = "VirusOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3 21 21")
            addPathData("M8.469 8.46c-1.943 1.951-1.943 5.106 .001 7.057 1.944 1.951 5.099 1.963 7.057 .027")
            addPathData("M16.913 12.936c.31-1.623-.202-3.294-1.368-4.465C14.38 7.3 12.711 6.781 11.087 7.083")
            addPathData("M12 7v-4")
            addPathData("M11 3h2")
            addPathData("M15.536 8.464 18.364 5.636")
            addPathData("M17.657 4.929l1.414 1.414")
            addPathData("M17 12h4")
            addPathData("M21 11v2")
            addPathData("M18.364 18.363l-.707 .707")
            addPathData("M12 17v4")
            addPathData("M13 21h-2")
            addPathData("M8.465 15.536 5.636 18.364")
            addPathData("M6.343 19.071 4.93 17.657")
            addPathData("M7 12h-4")
            addPathData("M3 13v-2")
            addPathData("M5.636 5.637l-.707 .707")
        }
        return _virusOff!!
    }

private var _virusOff: ImageVector? = null
