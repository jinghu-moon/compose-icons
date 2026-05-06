package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TimeDuration5: ImageVector
    get() {
        if (_timeDuration5 != null) return _timeDuration5!!
        _timeDuration5 = tablerOutlineIcon(
            name = "TimeDuration5",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 15h2c.828 0 1.5-.672 1.5-1.5C13.5 12.672 12.828 12 12 12h-2v-3h3.5")
            addPathData("M3 12v.01")
            addPathData("M21 12v.01")
            addPathData("M12 21v.01")
            addPathData("M7.5 4.2v.01")
            addPathData("M16.5 19.8v.01")
            addPathData("M7.5 19.8v.01")
            addPathData("M4.2 16.5v.01")
            addPathData("M19.8 16.5v.01")
            addPathData("M19.8 7.5v.01")
            addPathData("M4.2 7.5v.01")
            addPathData("M16.5 4.206C15.131 3.418 13.58 3.002 12 3")
        }
        return _timeDuration5!!
    }

private var _timeDuration5: ImageVector? = null
