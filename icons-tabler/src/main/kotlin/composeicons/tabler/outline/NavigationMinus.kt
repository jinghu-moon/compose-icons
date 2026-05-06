package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NavigationMinus: ImageVector
    get() {
        if (_navigationMinus != null) return _navigationMinus!!
        _navigationMinus = tablerOutlineIcon(
            name = "NavigationMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.5 15C16.268 12.33 14.435 8.33 12 3L4.03 20.275c-.07 .2-.017 .424 .135 .572 .15 .148 .374 .193 .57 .116L12 18.5")
            addPathData("M16 19h6")
        }
        return _navigationMinus!!
    }

private var _navigationMinus: ImageVector? = null
