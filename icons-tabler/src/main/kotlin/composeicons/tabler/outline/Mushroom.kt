package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Mushroom: ImageVector
    get() {
        if (_mushroom != null) return _mushroom!!
        _mushroom = tablerOutlineIcon(
            name = "Mushroom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 11.1C20 6.626 16.418 3 12 3 7.582 3 4 6.626 4 11.1c0 .497 .403 .9 .9 .9h14.2c.497 0 .9-.403 .9-.9")
            addPathData("M10 12v7c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-7")
        }
        return _mushroom!!
    }

private var _mushroom: ImageVector? = null
