package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NavigationCheck: ImageVector
    get() {
        if (_navigationCheck != null) return _navigationCheck!!
        _navigationCheck = tablerOutlineIcon(
            name = "NavigationCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.487 14.894 12 3 4.03 20.275c-.07 .2-.017 .424 .135 .572 .15 .148 .374 .193 .57 .116l6.275-2.127")
            addPathData("M15 19l2 2 4-4")
        }
        return _navigationCheck!!
    }

private var _navigationCheck: ImageVector? = null
