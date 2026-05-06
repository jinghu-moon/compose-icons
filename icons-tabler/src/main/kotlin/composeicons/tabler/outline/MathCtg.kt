package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathCtg: ImageVector
    get() {
        if (_mathCtg != null) return _mathCtg!!
        _mathCtg = tablerOutlineIcon(
            name = "MathCtg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 8h4")
            addPathData("M21 8h-2c-1.105 0-2 .895-2 2v4c0 1.105 .895 2 2 2h2v-4h-1")
            addPathData("M12 8v8")
            addPathData("M7 10C7 8.895 6.105 8 5 8 3.895 8 3 8.895 3 10v4c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
        }
        return _mathCtg!!
    }

private var _mathCtg: ImageVector? = null
