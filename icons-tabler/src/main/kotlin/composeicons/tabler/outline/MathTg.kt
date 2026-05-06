package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathTg: ImageVector
    get() {
        if (_mathTg != null) return _mathTg!!
        _mathTg = tablerOutlineIcon(
            name = "MathTg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 8h4")
            addPathData("M9 8v8")
            addPathData("M18 8h-2c-1.105 0-2 .895-2 2v4c0 1.105 .895 2 2 2h2v-4h-1")
        }
        return _mathTg!!
    }

private var _mathTg: ImageVector? = null
