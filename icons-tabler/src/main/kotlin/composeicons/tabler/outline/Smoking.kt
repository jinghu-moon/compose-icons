package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Smoking: ImageVector
    get() {
        if (_smoking != null) return _smoking!!
        _smoking = tablerOutlineIcon(
            name = "Smoking",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 14c0-.552 .448-1 1-1h16c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-16C3.448 17 3 16.552 3 16v-2")
            addPathData("M8 13v4")
            addPathData("M16 5v.5c0 1.105 .895 2 2 2 1.105 0 2 .895 2 2v.5")
        }
        return _smoking!!
    }

private var _smoking: ImageVector? = null
