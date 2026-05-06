package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeSearch: ImageVector
    get() {
        if (_homeSearch != null) return _homeSearch!!
        _homeSearch = tablerOutlineIcon(
            name = "HomeSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12 12 3 3 12h2v7c0 1.105 .895 2 2 2h4.7")
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h2")
            addPathData("M15 18c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M20.2 20.2 22 22")
        }
        return _homeSearch!!
    }

private var _homeSearch: ImageVector? = null
