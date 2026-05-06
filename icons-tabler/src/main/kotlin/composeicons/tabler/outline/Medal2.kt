package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Medal2: ImageVector
    get() {
        if (_medal2 != null) return _medal2!!
        _medal2 = tablerOutlineIcon(
            name = "Medal2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 3h6l3 7-6 2L6 10 9 3")
            addPathData("M12 12 9 3")
            addPathData("M15 11 12 3")
            addPathData("M12 19.5 9 21l.5-3.5-2-2 3-.5L12 12l1.5 3 3 .5-2 2L15 21 12 19.5")
        }
        return _medal2!!
    }

private var _medal2: ImageVector? = null
