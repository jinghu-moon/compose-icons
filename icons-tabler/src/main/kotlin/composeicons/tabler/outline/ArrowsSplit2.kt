package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsSplit2: ImageVector
    get() {
        if (_arrowsSplit2 != null) return _arrowsSplit2!!
        _arrowsSplit2 = tablerOutlineIcon(
            name = "ArrowsSplit2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 17h-5.397c-1.632-0-3.16-.796-4.096-2.133l-.514-.734C10.057 12.796 8.529 12 6.897 12h-3.897")
            addPathData("M21 7h-5.395c-1.633-0-3.162 .797-4.098 2.135l-.51 .73C10.062 11.203 8.532 12 6.9 12h-3.9")
            addPathData("M18 10 21 7 18 4")
            addPathData("M18 20l3-3L18 14")
        }
        return _arrowsSplit2!!
    }

private var _arrowsSplit2: ImageVector? = null
