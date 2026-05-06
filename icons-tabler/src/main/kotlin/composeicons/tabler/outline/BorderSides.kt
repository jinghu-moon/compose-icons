package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BorderSides: ImageVector
    get() {
        if (_borderSides != null) return _borderSides!!
        _borderSides = tablerOutlineIcon(
            name = "BorderSides",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8v8")
            addPathData("M20 16v-8")
            addPathData("M8 4h8")
            addPathData("M8 20h8")
        }
        return _borderSides!!
    }

private var _borderSides: ImageVector? = null
