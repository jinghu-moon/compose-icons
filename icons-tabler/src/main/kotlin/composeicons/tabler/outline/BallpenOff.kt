package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BallpenOff: ImageVector
    get() {
        if (_ballpenOff != null) return _ballpenOff!!
        _ballpenOff = tablerOutlineIcon(
            name = "BallpenOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 6l7 7-2 2")
            addPathData("M10 10 5.828 14.172c-1.105 1.105-1.105 2.895 0 4 1.105 1.105 2.895 1.105 4 0L14 14")
            addPathData("M16 12 20.414 7.586c.375-.375 .586-.884 .586-1.414 0-.531-.211-1.039-.586-1.415L19.243 3.586c-.375-.375-.884-.586-1.414-.586-.531 0-1.039 .211-1.415 .586L12 8")
            addPathData("M4 20 5.768 18.232")
            addPathData("M3 3 21 21")
        }
        return _ballpenOff!!
    }

private var _ballpenOff: ImageVector? = null
