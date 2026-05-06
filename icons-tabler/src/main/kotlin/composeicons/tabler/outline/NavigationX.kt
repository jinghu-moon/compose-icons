package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NavigationX: ImageVector
    get() {
        if (_navigationX != null) return _navigationX!!
        _navigationX = tablerOutlineIcon(
            name = "NavigationX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.622 13.02 12 3 4.03 20.275c-.07 .2-.017 .424 .135 .572 .15 .148 .374 .193 .57 .116L12 18.5l1.563 .53")
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
        }
        return _navigationX!!
    }

private var _navigationX: ImageVector? = null
