package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pennant2: ImageVector
    get() {
        if (_pennant2 != null) return _pennant2!!
        _pennant2 = tablerOutlineIcon(
            name = "Pennant2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 21h-4")
            addPathData("M14 21v-18")
            addPathData("M14 4 5 8l9 4")
        }
        return _pennant2!!
    }

private var _pennant2: ImageVector? = null
