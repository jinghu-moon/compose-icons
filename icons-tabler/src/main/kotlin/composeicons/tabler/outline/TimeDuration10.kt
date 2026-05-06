package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TimeDuration10: ImageVector
    get() {
        if (_timeDuration10 != null) return _timeDuration10!!
        _timeDuration10 = tablerOutlineIcon(
            name = "TimeDuration10",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 9v6")
            addPathData("M12 11v2c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-2C16 9.895 15.105 9 14 9c-1.105 0-2 .895-2 2")
            addPathData("M3 12v.01")
            addPathData("M21 12v.01")
            addPathData("M12 21v.01")
            addPathData("M7.5 4.2v.01")
            addPathData("M16.5 19.8v.01")
            addPathData("M7.5 19.8v.01")
            addPathData("M4.2 16.5v.01")
            addPathData("M19.8 16.5v.01")
            addPathData("M4.2 7.5v.01")
            addPathData("M19.81 7.527C18.207 4.726 15.227 2.999 12 3")
        }
        return _timeDuration10!!
    }

private var _timeDuration10: ImageVector? = null
