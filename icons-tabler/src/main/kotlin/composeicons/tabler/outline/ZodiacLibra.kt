package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZodiacLibra: ImageVector
    get() {
        if (_zodiacLibra != null) return _zodiacLibra!!
        _zodiacLibra = tablerOutlineIcon(
            name = "ZodiacLibra",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 20h14")
            addPathData("M5 17h5v-.3C6.669 15.707 4.572 12.42 5.073 8.981 5.575 5.542 8.524 2.992 12 2.992c3.476 0 6.425 2.55 6.927 5.989 .502 3.439-1.596 6.726-4.927 7.719v.3h5")
        }
        return _zodiacLibra!!
    }

private var _zodiacLibra: ImageVector? = null
