package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Gif: ImageVector
    get() {
        if (_gif != null) return _gif!!
        _gif = tablerOutlineIcon(
            name = "Gif",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 8h-2C4.895 8 4 8.895 4 10v4c0 1.105 .895 2 2 2h2v-4h-1")
            addPathData("M12 8v8")
            addPathData("M16 12h3")
            addPathData("M20 8h-4v8")
        }
        return _gif!!
    }

private var _gif: ImageVector? = null
