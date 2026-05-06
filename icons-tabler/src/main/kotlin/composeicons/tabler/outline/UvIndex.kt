package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UvIndex: ImageVector
    get() {
        if (_uvIndex != null) return _uvIndex!!
        _uvIndex = tablerOutlineIcon(
            name = "UvIndex",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12h1M20 12h1M5.6 5.6l.7 .7M18.4 5.6l-.7 .7M8 12C8 9.791 9.791 8 12 8c2.209 0 4 1.791 4 4")
            addPathData("M12 4v-1")
            addPathData("M13 16l2 5h1l2-5")
            addPathData("M6 16v3c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-3")
        }
        return _uvIndex!!
    }

private var _uvIndex: ImageVector? = null
