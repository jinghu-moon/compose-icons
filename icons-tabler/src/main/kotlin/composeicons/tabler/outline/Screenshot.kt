package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Screenshot: ImageVector
    get() {
        if (_screenshot != null) return _screenshot!!
        _screenshot = tablerOutlineIcon(
            name = "Screenshot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 19C5.895 19 5 18.105 5 17")
            addPathData("M5 13v-2")
            addPathData("M5 7C5 5.895 5.895 5 7 5")
            addPathData("M11 5h2")
            addPathData("M17 5c1.105 0 2 .895 2 2")
            addPathData("M19 11v2")
            addPathData("M19 17v4")
            addPathData("M21 19h-4")
            addPathData("M13 19h-2")
        }
        return _screenshot!!
    }

private var _screenshot: ImageVector? = null
