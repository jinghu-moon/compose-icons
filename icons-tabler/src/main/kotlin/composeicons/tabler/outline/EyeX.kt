package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EyeX: ImageVector
    get() {
        if (_eyeX != null) return _eyeX!!
        _eyeX = tablerOutlineIcon(
            name = "EyeX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M13.048 17.942c-.348 .039-.698 .058-1.048 .058C8.4 18 5.4 16 3 12 5.4 8 8.4 6 12 6c3.6 0 6.6 2 9 6-.41 .688-.865 1.348-1.362 1.975")
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
        }
        return _eyeX!!
    }

private var _eyeX: ImageVector? = null
