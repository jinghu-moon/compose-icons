package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.IroningOff: ImageVector
    get() {
        if (_ironingOff != null) return _ironingOff!!
        _ironingOff = tablerOutlineIcon(
            name = "IroningOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 6h6.459c1.467 0 2.718 1.06 2.959 2.507l.577 3.464 .804 4.821 .007 .044M18 18h-15c0-3.866 3.134-7 7-7h1M15 11h4.8")
            addPathData("M3 3 21 21")
        }
        return _ironingOff!!
    }

private var _ironingOff: ImageVector? = null
