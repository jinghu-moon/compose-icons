package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TimeDuration15: ImageVector
    get() {
        if (_timeDuration15 != null) return _timeDuration15!!
        _timeDuration15 = tablerOutlineIcon(
            name = "TimeDuration15",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 15h2c.552 0 1-.448 1-1v-1c0-.552-.448-1-1-1h-2v-3h3")
            addPathData("M9 9v6")
            addPathData("M3 12v.01")
            addPathData("M12 21v.01")
            addPathData("M7.5 4.2v.01")
            addPathData("M16.5 19.8v.01")
            addPathData("M7.5 19.8v.01")
            addPathData("M4.2 16.5v.01")
            addPathData("M19.8 16.5v.01")
            addPathData("M4.2 7.5v.01")
            addPathData("M21 12C21 7.029 16.971 3 12 3")
        }
        return _timeDuration15!!
    }

private var _timeDuration15: ImageVector? = null
