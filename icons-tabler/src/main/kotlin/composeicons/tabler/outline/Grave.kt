package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Grave: ImageVector
    get() {
        if (_grave != null) return _grave!!
        _grave = tablerOutlineIcon(
            name = "Grave",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 21v-2C5 17.343 6.343 16 8 16h8c1.657 0 3 1.343 3 3v2h-14")
            addPathData("M10 16v-5h-4v-4h4v-4h4v4h4v4h-4v5")
        }
        return _grave!!
    }

private var _grave: ImageVector? = null
