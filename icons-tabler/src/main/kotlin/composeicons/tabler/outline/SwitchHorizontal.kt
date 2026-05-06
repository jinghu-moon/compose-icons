package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SwitchHorizontal: ImageVector
    get() {
        if (_switchHorizontal != null) return _switchHorizontal!!
        _switchHorizontal = tablerOutlineIcon(
            name = "SwitchHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 3l4 4-4 4")
            addPathData("M10 7h10")
            addPathData("M8 13 4 17l4 4")
            addPathData("M4 17h9")
        }
        return _switchHorizontal!!
    }

private var _switchHorizontal: ImageVector? = null
