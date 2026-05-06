package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NavigationDown: ImageVector
    get() {
        if (_navigationDown != null) return _navigationDown!!
        _navigationDown = tablerOutlineIcon(
            name = "NavigationDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.528 12.815 12 3 4.03 20.275c-.07 .2-.017 .424 .135 .572 .15 .148 .374 .193 .57 .116L12 18.5")
            addPathData("M19 16v6")
            addPathData("M22 19l-3 3L16 19")
        }
        return _navigationDown!!
    }

private var _navigationDown: ImageVector? = null
