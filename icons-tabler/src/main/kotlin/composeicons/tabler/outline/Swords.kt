package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Swords: ImageVector
    get() {
        if (_swords != null) return _swords!!
        _swords = tablerOutlineIcon(
            name = "Swords",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 3v5L10 17 6 21 3 18 7 14 16 3h5")
            addPathData("M5 13l6 6")
            addPathData("M14.32 17.32 18 21l3-3L17.635 14.635")
            addPathData("M10 5.5 8 3h-5v5l3 2.5")
        }
        return _swords!!
    }

private var _swords: ImageVector? = null
