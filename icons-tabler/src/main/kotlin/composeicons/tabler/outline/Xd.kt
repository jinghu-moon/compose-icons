package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Xd: ImageVector
    get() {
        if (_xd != null) return _xd!!
        _xd = tablerOutlineIcon(
            name = "Xd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 8l4 8")
            addPathData("M6 16 10 8")
            addPathData("M14 8v8h2c1.105 0 2-.895 2-2v-4C18 8.895 17.105 8 16 8h-2")
        }
        return _xd!!
    }

private var _xd: ImageVector? = null
