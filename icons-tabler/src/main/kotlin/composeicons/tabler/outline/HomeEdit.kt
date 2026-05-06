package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeEdit: ImageVector
    get() {
        if (_homeEdit != null) return _homeEdit!!
        _homeEdit = tablerOutlineIcon(
            name = "HomeEdit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h2c.645 0 1.218 .305 1.584 .78")
            addPathData("M20 11 12 3 3 12h2v7c0 1.105 .895 2 2 2h4")
            addPathData("M18.42 15.61c.82-.82 2.15-.82 2.97 0 .82 .82 .82 2.15 0 2.97L18 22h-3v-3l3.42-3.39")
        }
        return _homeEdit!!
    }

private var _homeEdit: ImageVector? = null
