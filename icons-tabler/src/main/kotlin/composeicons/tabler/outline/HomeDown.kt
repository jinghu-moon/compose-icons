package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeDown: ImageVector
    get() {
        if (_homeDown != null) return _homeDown!!
        _homeDown = tablerOutlineIcon(
            name = "HomeDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 12h2L12 3 3 12h2v7c0 1.105 .895 2 2 2h5.5")
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h2c1.105 0 2 .895 2 2")
            addPathData("M19 16v6")
            addPathData("M22 19l-3 3L16 19")
        }
        return _homeDown!!
    }

private var _homeDown: ImageVector? = null
