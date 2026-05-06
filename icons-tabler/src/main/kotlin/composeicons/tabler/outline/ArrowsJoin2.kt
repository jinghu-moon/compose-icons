package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsJoin2: ImageVector
    get() {
        if (_arrowsJoin2 != null) return _arrowsJoin2!!
        _arrowsJoin2 = tablerOutlineIcon(
            name = "ArrowsJoin2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7h1.948c1.913 0 3.705 .933 4.802 2.5 1.097 1.567 2.889 2.5 4.802 2.5h6.448")
            addPathData("M3 17h1.95c1.912 0 3.703-.933 4.798-2.5C10.843 12.933 12.634 12 14.546 12h5.454")
            addPathData("M18 15l3-3L18 9")
        }
        return _arrowsJoin2!!
    }

private var _arrowsJoin2: ImageVector? = null
