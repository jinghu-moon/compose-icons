package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cactus: ImageVector
    get() {
        if (_cactus != null) return _cactus!!
        _cactus = tablerOutlineIcon(
            name = "Cactus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 9v1c0 1.657 1.343 3 3 3h1")
            addPathData("M18 8v5c0 1.657-1.343 3-3 3h-1")
            addPathData("M10 21v-16c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v16")
            addPathData("M7 21h10")
        }
        return _cactus!!
    }

private var _cactus: ImageVector? = null
