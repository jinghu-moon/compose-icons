package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlugX: ImageVector
    get() {
        if (_plugX != null) return _plugX!!
        _plugX = tablerOutlineIcon(
            name = "PlugX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.55 17.733c-1.513 .476-3.155 .313-4.545-.453C7.616 16.515 6.6 15.214 6.194 13.681 5.659 11.665 6.246 9.518 7.731 8.054L9.785 6l7.165 7.165")
            addPathData("M4 20 7.5 16.5")
            addPathData("M15 4 11.5 7.5")
            addPathData("M20 9l-3.5 3.5")
            addPathData("M16 16l4 4")
            addPathData("M20 16l-4 4")
        }
        return _plugX!!
    }

private var _plugX: ImageVector? = null
