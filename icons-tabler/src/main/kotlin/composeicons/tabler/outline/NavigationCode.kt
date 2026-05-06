package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NavigationCode: ImageVector
    get() {
        if (_navigationCode != null) return _navigationCode!!
        _navigationCode = tablerOutlineIcon(
            name = "NavigationCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.653 13.086 12 3 4.03 20.275c-.07 .2-.017 .424 .135 .572 .15 .148 .374 .193 .57 .116l6.246-2.117")
            addPathData("M20 21l2-2L20 17")
            addPathData("M17 17l-2 2 2 2")
        }
        return _navigationCode!!
    }

private var _navigationCode: ImageVector? = null
