package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Lambda: ImageVector
    get() {
        if (_lambda != null) return _lambda!!
        _lambda = tablerOutlineIcon(
            name = "Lambda",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 20l6.5-9")
            addPathData("M19 20C13 20 13 4 7 4")
        }
        return _lambda!!
    }

private var _lambda: ImageVector? = null
