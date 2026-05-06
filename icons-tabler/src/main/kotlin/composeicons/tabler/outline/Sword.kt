package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sword: ImageVector
    get() {
        if (_sword != null) return _sword!!
        _sword = tablerOutlineIcon(
            name = "Sword",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 4v5l-9 7L7 20 4 17 8 13 15 4h5")
            addPathData("M6.5 11.5l6 6")
        }
        return _sword!!
    }

private var _sword: ImageVector? = null
