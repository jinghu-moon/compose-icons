package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) return _eyeClosed!!
        _eyeClosed = tablerOutlineIcon(
            name = "EyeClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 9c-2.4 2.667-5.4 4-9 4C8.4 13 5.4 11.667 3 9")
            addPathData("M3 15 5.5 11.2")
            addPathData("M21 14.976 18.508 11.2")
            addPathData("M9 17l.5-4")
            addPathData("M15 17l-.5-4")
        }
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
