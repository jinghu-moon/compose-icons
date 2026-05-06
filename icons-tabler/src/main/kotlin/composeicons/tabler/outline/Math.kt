package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Math: ImageVector
    get() {
        if (_math != null) return _math!!
        _math = tablerOutlineIcon(
            name = "Math",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 5h-7L8 19 5 13h-2")
            addPathData("M14 13l6 6")
            addPathData("M14 19l6-6")
        }
        return _math!!
    }

private var _math: ImageVector? = null
