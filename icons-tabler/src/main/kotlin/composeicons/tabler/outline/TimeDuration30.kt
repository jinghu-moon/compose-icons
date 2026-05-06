package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TimeDuration30: ImageVector
    get() {
        if (_timeDuration30 != null) return _timeDuration30!!
        _timeDuration30 = tablerOutlineIcon(
            name = "TimeDuration30",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 10.5v3c0 .828 .672 1.5 1.5 1.5C16.328 15 17 14.328 17 13.5v-3C17 9.672 16.328 9 15.5 9 14.672 9 14 9.672 14 10.5")
            addPathData("M8 9h1.5C10.328 9 11 9.672 11 10.5 11 11.328 10.328 12 9.5 12h-.5 .5c.828 0 1.5 .672 1.5 1.5C11 14.328 10.328 15 9.5 15h-1.5")
            addPathData("M3 12v.01")
            addPathData("M7.5 4.2v.01")
            addPathData("M7.5 19.8v.01")
            addPathData("M4.2 16.5v.01")
            addPathData("M4.2 7.5v.01")
            addPathData("M12 21c4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3")
        }
        return _timeDuration30!!
    }

private var _timeDuration30: ImageVector? = null
