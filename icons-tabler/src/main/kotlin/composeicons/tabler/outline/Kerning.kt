package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Kerning: ImageVector
    get() {
        if (_kerning != null) return _kerning!!
        _kerning = tablerOutlineIcon(
            name = "Kerning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 15v-3.5C16 10.119 17.119 9 18.5 9 19.881 9 21 10.119 21 11.5v3.5M21 13h-5")
            addPathData("M3 9l3 6L9 9")
            addPathData("M9 20 15 4")
        }
        return _kerning!!
    }

private var _kerning: ImageVector? = null
