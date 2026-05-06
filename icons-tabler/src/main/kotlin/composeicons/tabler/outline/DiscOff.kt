package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DiscOff: ImageVector
    get() {
        if (_discOff != null) return _discOff!!
        _discOff = tablerOutlineIcon(
            name = "DiscOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.044 16.04C21.788 12.573 21.112 8.378 18.368 5.633 15.624 2.889 11.43 2.212 7.962 3.955M5.629 5.643C3.059 8.219 2.293 12.088 3.687 15.449 5.081 18.809 8.362 21 12 21c2.491 0 4.73-1 6.36-2.631")
            addPathData("M11.298 11.288c-.394 .387-.4 1.02-.013 1.415 .387 .394 1.02 .4 1.415 .012")
            addPathData("M7 12C7 10.62 7.559 9.371 8.462 8.466M11.069 7.086C11.371 7.03 11.682 7 12 7")
            addPathData("M12 17c1.334 .002 2.613-.531 3.551-1.48M16.913 12.933C16.97 12.631 17 12.319 17 12")
            addPathData("M3 3 21 21")
        }
        return _discOff!!
    }

private var _discOff: ImageVector? = null
