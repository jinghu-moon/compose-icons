package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SwitchVertical: ImageVector
    get() {
        if (_switchVertical != null) return _switchVertical!!
        _switchVertical = tablerOutlineIcon(
            name = "SwitchVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 8 7 4l4 4")
            addPathData("M7 4v9")
            addPathData("M13 16l4 4 4-4")
            addPathData("M17 10v10")
        }
        return _switchVertical!!
    }

private var _switchVertical: ImageVector? = null
