package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Separator: ImageVector
    get() {
        if (_separator != null) return _separator!!
        _separator = tablerOutlineIcon(
            name = "Separator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12v.01")
            addPathData("M7 12h10")
            addPathData("M21 12v.01")
        }
        return _separator!!
    }

private var _separator: ImageVector? = null
