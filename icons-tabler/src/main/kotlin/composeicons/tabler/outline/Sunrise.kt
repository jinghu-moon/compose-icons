package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sunrise: ImageVector
    get() {
        if (_sunrise != null) return _sunrise!!
        _sunrise = tablerOutlineIcon(
            name = "Sunrise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17h1M20 17h1M5.6 10.6l.7 .7M18.4 10.6l-.7 .7M8 17c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4")
            addPathData("M3 21h18")
            addPathData("M12 9v-6l3 3M9 6 12 3")
        }
        return _sunrise!!
    }

private var _sunrise: ImageVector? = null
