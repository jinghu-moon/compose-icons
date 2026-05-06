package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DatabasePlus: ImageVector
    get() {
        if (_databasePlus != null) return _databasePlus!!
        _databasePlus = tablerOutlineIcon(
            name = "DatabasePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6c0 1.657 3.582 3 8 3 4.418 0 8-1.343 8-3C20 4.343 16.418 3 12 3 7.582 3 4 4.343 4 6")
            addPathData("M4 6v6c0 1.657 3.582 3 8 3 1.075 0 2.1-.08 3.037-.224")
            addPathData("M20 12v-6")
            addPathData("M4 12v6c0 1.657 3.582 3 8 3 .166 0 .331-.002 .495-.006")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _databasePlus!!
    }

private var _databasePlus: ImageVector? = null
