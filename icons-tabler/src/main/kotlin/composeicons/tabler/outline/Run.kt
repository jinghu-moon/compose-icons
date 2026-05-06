package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Run: ImageVector
    get() {
        if (_run != null) return _run!!
        _run = tablerOutlineIcon(
            name = "Run",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 4c0 .552 .448 1 1 1 .552 0 1-.448 1-1C14 3.448 13.552 3 13 3c-.552 0-1 .448-1 1")
            addPathData("M4 17l5 1 .75-1.5")
            addPathData("M15 21v-4L11 14 12 8")
            addPathData("M7 12v-3L12 8l3 3 3 1")
        }
        return _run!!
    }

private var _run: ImageVector? = null
