package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Brain: ImageVector
    get() {
        if (_brain != null) return _brain!!
        _brain = tablerOutlineIcon(
            name = "Brain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.5 13C13.567 13 12 14.567 12 16.5v1C12 19.433 13.567 21 15.5 21 17.433 21 19 19.433 19 17.5v-1.8")
            addPathData("M8.5 13C10.433 13 12 14.567 12 16.5v1C12 19.433 10.433 21 8.5 21 6.567 21 5 19.433 5 17.5v-1.8")
            addPathData("M17.5 16C19.433 16 21 14.433 21 12.5 21 10.567 19.433 9 17.5 9h-.5")
            addPathData("M19 9.3v-2.8C19 4.567 17.433 3 15.5 3 13.567 3 12 4.567 12 6.5")
            addPathData("M6.5 16C4.567 16 3 14.433 3 12.5 3 10.567 4.567 9 6.5 9h.5")
            addPathData("M5 9.3v-2.8C5 4.567 6.567 3 8.5 3 10.433 3 12 4.567 12 6.5v10")
        }
        return _brain!!
    }

private var _brain: ImageVector? = null
