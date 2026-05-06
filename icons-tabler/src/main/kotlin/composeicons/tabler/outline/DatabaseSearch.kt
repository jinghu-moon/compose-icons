package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DatabaseSearch: ImageVector
    get() {
        if (_databaseSearch != null) return _databaseSearch!!
        _databaseSearch = tablerOutlineIcon(
            name = "DatabaseSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6c0 1.657 3.582 3 8 3 4.418 0 8-1.343 8-3C20 4.343 16.418 3 12 3 7.582 3 4 4.343 4 6")
            addPathData("M4 6v6c0 1.657 3.582 3 8 3M20 11.5v-5.5")
            addPathData("M4 12v6c0 1.657 3.582 3 8 3")
            addPathData("M15 18c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M20.2 20.2 22 22")
        }
        return _databaseSearch!!
    }

private var _databaseSearch: ImageVector? = null
