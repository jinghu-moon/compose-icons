package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sunset: ImageVector
    get() {
        if (_sunset != null) return _sunset!!
        _sunset = tablerOutlineIcon(
            name = "Sunset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17h1M20 17h1M5.6 10.6l.7 .7M18.4 10.6l-.7 .7M8 17c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4")
            addPathData("M3 21h18")
            addPathData("M12 3v6L15 6M9 6l3 3")
        }
        return _sunset!!
    }

private var _sunset: ImageVector? = null
