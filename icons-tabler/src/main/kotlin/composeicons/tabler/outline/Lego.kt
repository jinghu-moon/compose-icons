package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Lego: ImageVector
    get() {
        if (_lego != null) return _lego!!
        _lego = tablerOutlineIcon(
            name = "Lego",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.5 11h.01")
            addPathData("M14.5 11h.01")
            addPathData("M9.5 15c.658 .672 1.559 1.051 2.5 1.051 .941 0 1.842-.379 2.5-1.051")
            addPathData("M7 5h1v-2h8v2h1c1.657 0 3 1.343 3 3v9c0 1.657-1.343 3-3 3v1h-10v-1C5.343 20 4 18.657 4 17v-9C4 6.343 5.343 5 7 5")
        }
        return _lego!!
    }

private var _lego: ImageVector? = null
