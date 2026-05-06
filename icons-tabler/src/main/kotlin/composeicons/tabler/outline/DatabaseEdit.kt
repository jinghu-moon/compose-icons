package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DatabaseEdit: ImageVector
    get() {
        if (_databaseEdit != null) return _databaseEdit!!
        _databaseEdit = tablerOutlineIcon(
            name = "DatabaseEdit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6c0 1.657 3.582 3 8 3 4.418 0 8-1.343 8-3C20 4.343 16.418 3 12 3 7.582 3 4 4.343 4 6")
            addPathData("M4 6v6c0 1.657 3.582 3 8 3 .478 0 .947-.016 1.402-.046")
            addPathData("M20 12v-6")
            addPathData("M4 12v6c0 1.526 3.04 2.786 6.972 2.975")
            addPathData("M18.42 15.61c.82-.82 2.15-.82 2.97 0 .82 .82 .82 2.15 0 2.97L18 22h-3v-3l3.42-3.39")
        }
        return _databaseEdit!!
    }

private var _databaseEdit: ImageVector? = null
