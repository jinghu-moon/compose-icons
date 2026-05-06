package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DatabaseCog: ImageVector
    get() {
        if (_databaseCog != null) return _databaseCog!!
        _databaseCog = tablerOutlineIcon(
            name = "DatabaseCog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6c0 1.657 3.582 3 8 3 4.418 0 8-1.343 8-3C20 4.343 16.418 3 12 3 7.582 3 4 4.343 4 6")
            addPathData("M4 6v6c0 1.657 3.582 3 8 3 .21 0 .42-.003 .626-.01")
            addPathData("M20 11.5v-5.5")
            addPathData("M4 12v6c0 1.657 3.582 3 8 3")
            addPathData("M17.001 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M19.001 15.5v1.5")
            addPathData("M19.001 21v1.5")
            addPathData("M22.032 17.25 20.733 18")
            addPathData("M17.27 20l-1.3 .75")
            addPathData("M15.97 17.25 17.27 18")
            addPathData("M20.733 20l1.3 .75")
        }
        return _databaseCog!!
    }

private var _databaseCog: ImageVector? = null
