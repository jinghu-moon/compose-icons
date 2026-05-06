package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NavigationPause: ImageVector
    get() {
        if (_navigationPause != null) return _navigationPause!!
        _navigationPause = tablerOutlineIcon(
            name = "NavigationPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.666 13.114 12 3 4.03 20.275c-.07 .2-.017 .424 .135 .572 .15 .148 .374 .193 .57 .116L12 18.5l1.056 .358")
            addPathData("M17 17v5")
            addPathData("M21 17v5")
        }
        return _navigationPause!!
    }

private var _navigationPause: ImageVector? = null
