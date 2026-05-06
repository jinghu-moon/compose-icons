package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sunset2: ImageVector
    get() {
        if (_sunset2 != null) return _sunset2!!
        _sunset2 = tablerOutlineIcon(
            name = "Sunset2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 13h1")
            addPathData("M20 13h1")
            addPathData("M5.6 6.6l.7 .7")
            addPathData("M18.4 6.6l-.7 .7")
            addPathData("M8 13C8 10.791 9.791 9 12 9c2.209 0 4 1.791 4 4")
            addPathData("M3 17h18")
            addPathData("M7 20h5")
            addPathData("M16 20h1")
            addPathData("M12 5v-1")
        }
        return _sunset2!!
    }

private var _sunset2: ImageVector? = null
