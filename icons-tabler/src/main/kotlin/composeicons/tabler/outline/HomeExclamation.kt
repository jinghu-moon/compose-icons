package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeExclamation: ImageVector
    get() {
        if (_homeExclamation != null) return _homeExclamation!!
        _homeExclamation = tablerOutlineIcon(
            name = "HomeExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12 12 3 3 12h2v7c0 1.105 .895 2 2 2h8")
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h2c.818-0 1.553 .498 1.857 1.257")
            addPathData("M19 16v3")
            addPathData("M19 22v.01")
        }
        return _homeExclamation!!
    }

private var _homeExclamation: ImageVector? = null
