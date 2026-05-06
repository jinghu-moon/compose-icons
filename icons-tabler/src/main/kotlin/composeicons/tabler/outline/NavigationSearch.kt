package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NavigationSearch: ImageVector
    get() {
        if (_navigationSearch != null) return _navigationSearch!!
        _navigationSearch = tablerOutlineIcon(
            name = "NavigationSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.876 11.403 12 3 4.03 20.275c-.07 .2-.017 .424 .135 .572 .15 .148 .374 .193 .57 .116l6.29-2.132")
            addPathData("M15 18c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M20.2 20.2 22 22")
        }
        return _navigationSearch!!
    }

private var _navigationSearch: ImageVector? = null
