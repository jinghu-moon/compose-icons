package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathPi: ImageVector
    get() {
        if (_mathPi != null) return _mathPi!!
        _mathPi = tablerOutlineIcon(
            name = "MathPi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 20v-16")
            addPathData("M17 4v16")
            addPathData("M20 4h-16")
        }
        return _mathPi!!
    }

private var _mathPi: ImageVector? = null
