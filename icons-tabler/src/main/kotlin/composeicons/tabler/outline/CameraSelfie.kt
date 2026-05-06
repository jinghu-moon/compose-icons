package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CameraSelfie: ImageVector
    get() {
        if (_cameraSelfie != null) return _cameraSelfie!!
        _cameraSelfie = tablerOutlineIcon(
            name = "CameraSelfie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 7h1C7.105 7 8 6.105 8 5 8 4.448 8.448 4 9 4h6c.552 0 1 .448 1 1 0 1.105 .895 2 2 2h1c1.105 0 2 .895 2 2v9c0 1.105-.895 2-2 2h-14C3.895 20 3 19.105 3 18v-9C3 7.895 3.895 7 5 7")
            addPathData("M9.5 15c.658 .672 1.559 1.051 2.5 1.051 .941 0 1.842-.379 2.5-1.051")
            addPathData("M15 11h.01")
            addPathData("M9 11h.01")
        }
        return _cameraSelfie!!
    }

private var _cameraSelfie: ImageVector? = null
