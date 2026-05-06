package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LampOff: ImageVector
    get() {
        if (_lampOff != null) return _lampOff!!
        _lampOff = tablerOutlineIcon(
            name = "LampOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 20h6")
            addPathData("M12 20v-8")
            addPathData("M7.325 7.35 5 12h7M16 12h3L15 4h-6l-.338 .676")
            addPathData("M3 3 21 21")
        }
        return _lampOff!!
    }

private var _lampOff: ImageVector? = null
