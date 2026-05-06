package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeCog: ImageVector
    get() {
        if (_homeCog != null) return _homeCog!!
        _homeCog = tablerOutlineIcon(
            name = "HomeCog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h1.6")
            addPathData("M20 11 12 3 3 12h2v7c0 1.105 .895 2 2 2h4.159")
            addPathData("M16 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M18 14.5v1.5")
            addPathData("M18 20v1.5")
            addPathData("M21.032 16.25 19.733 17")
            addPathData("M16.27 19l-1.3 .75")
            addPathData("M14.97 16.25 16.27 17")
            addPathData("M19.733 19l1.3 .75")
        }
        return _homeCog!!
    }

private var _homeCog: ImageVector? = null
