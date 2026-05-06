package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EyePause: ImageVector
    get() {
        if (_eyePause != null) return _eyePause!!
        _eyePause = tablerOutlineIcon(
            name = "EyePause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M13.022 17.945c-.339 .037-.681 .055-1.022 .055C8.4 18 5.4 16 3 12 5.4 8 8.4 6 12 6c3.6 0 6.6 2 9 6-.195 .325-.394 .636-.596 .935")
            addPathData("M17 17v5")
            addPathData("M21 17v5")
        }
        return _eyePause!!
    }

private var _eyePause: ImageVector? = null
