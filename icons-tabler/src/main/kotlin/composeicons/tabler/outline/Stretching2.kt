package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Stretching2: ImageVector
    get() {
        if (_stretching2 != null) return _stretching2!!
        _stretching2 = tablerOutlineIcon(
            name = "Stretching2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 4c0 .552 .448 1 1 1 .552 0 1-.448 1-1C13 3.448 12.552 3 12 3c-.552 0-1 .448-1 1")
            addPathData("M6.5 21 10 16")
            addPathData("M5 11 12 9")
            addPathData("M16 21 12 14v-5L19 5")
        }
        return _stretching2!!
    }

private var _stretching2: ImageVector? = null
