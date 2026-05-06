package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FlagOff: ImageVector
    get() {
        if (_flagOff != null) return _flagOff!!
        _flagOff = tablerOutlineIcon(
            name = "FlagOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 5v16")
            addPathData("M19 5v9")
            addPathData("M7.641 3.645C9.227 3.368 10.85 3.873 12 5c1.944 1.906 5.056 1.906 7 0")
            addPathData("M5 14c1.944-1.906 5.056-1.906 7 0 .918 .902 2.15 1.414 3.437 1.429M18.456 14.463c.19-.14 .371-.294 .544-.463")
            addPathData("M3 3 21 21")
        }
        return _flagOff!!
    }

private var _flagOff: ImageVector? = null
