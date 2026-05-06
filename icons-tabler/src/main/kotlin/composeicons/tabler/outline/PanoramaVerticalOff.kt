package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PanoramaVerticalOff: ImageVector
    get() {
        if (_panoramaVerticalOff != null) return _panoramaVerticalOff!!
        _panoramaVerticalOff = tablerOutlineIcon(
            name = "PanoramaVerticalOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 3h10.53c.693 0 1.18 .691 .935 1.338-1.098 2.898-1.573 5.795-1.425 8.692M17.868 17.877c.172 .592 .37 1.185 .595 1.778 .112 .306 .069 .648-.117 .915-.186 .268-.491 .428-.817 .43h-11c-.692 0-1.208-.692-.962-1.34C7.264 15.174 7.47 10.687 6.186 6.2")
            addPathData("M3 3 21 21")
        }
        return _panoramaVerticalOff!!
    }

private var _panoramaVerticalOff: ImageVector? = null
