package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ballpen: ImageVector
    get() {
        if (_ballpen != null) return _ballpen!!
        _ballpen = tablerOutlineIcon(
            name = "Ballpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 6l7 7-4 4")
            addPathData("M5.828 18.172c.53 .531 1.25 .829 2 .829 .75 0 1.47-.298 2-.829L20.414 7.586c.375-.375 .586-.884 .586-1.414 0-.531-.211-1.039-.586-1.415L19.243 3.586c-.375-.375-.884-.586-1.414-.586-.531 0-1.039 .211-1.415 .586L5.828 14.172c-.531 .53-.829 1.25-.829 2 0 .75 .298 1.47 .829 2")
            addPathData("M4 20 5.768 18.232")
        }
        return _ballpen!!
    }

private var _ballpen: ImageVector? = null
