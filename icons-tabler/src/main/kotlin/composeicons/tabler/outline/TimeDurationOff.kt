package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TimeDurationOff: ImageVector
    get() {
        if (_timeDurationOff != null) return _timeDurationOff!!
        _timeDurationOff = tablerOutlineIcon(
            name = "TimeDurationOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12v.01")
            addPathData("M7.5 19.8v.01")
            addPathData("M4.2 16.5v.01")
            addPathData("M4.2 7.5v.01")
            addPathData("M12 21c2.386 .001 4.675-.947 6.362-2.634M20.047 16.03c1.397-2.79 1.25-6.104-.39-8.759C18.018 4.616 15.12 3 12 3")
            addPathData("M3 3 21 21")
        }
        return _timeDurationOff!!
    }

private var _timeDurationOff: ImageVector? = null
