package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LiveView: ImageVector
    get() {
        if (_liveView != null) return _liveView!!
        _liveView = tablerOutlineIcon(
            name = "LiveView",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8v-2C4 4.895 4.895 4 6 4h2")
            addPathData("M4 16v2c0 1.105 .895 2 2 2h2")
            addPathData("M16 4h2c1.105 0 2 .895 2 2v2")
            addPathData("M16 20h2c1.105 0 2-.895 2-2v-2")
            addPathData("M12 11v.01")
            addPathData("M12 18 8.5 13C7.569 11.318 7.967 9.211 9.448 7.984c1.48-1.227 3.624-1.227 5.105 0 1.48 1.227 1.878 3.334 .948 5.016L12 18")
        }
        return _liveView!!
    }

private var _liveView: ImageVector? = null
