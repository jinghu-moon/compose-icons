package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NavigationExclamation: ImageVector
    get() {
        if (_navigationExclamation != null) return _navigationExclamation!!
        _navigationExclamation = tablerOutlineIcon(
            name = "NavigationExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.535 12.832 12 3 4.03 20.275c-.07 .2-.017 .424 .135 .572 .15 .148 .374 .193 .57 .116L12 18.5c1.38 .468 2.416 .82 3.107 1.053")
            addPathData("M19 16v3")
            addPathData("M19 22v.01")
        }
        return _navigationExclamation!!
    }

private var _navigationExclamation: ImageVector? = null
