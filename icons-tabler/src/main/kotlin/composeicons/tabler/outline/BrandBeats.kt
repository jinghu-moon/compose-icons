package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBeats: ImageVector
    get() {
        if (_brandBeats != null) return _brandBeats!!
        _brandBeats = tablerOutlineIcon(
            name = "BrandBeats",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M9 12.5C9 14.433 10.567 16 12.5 16 14.433 16 16 14.433 16 12.5 16 10.567 14.433 9 12.5 9 10.567 9 9 10.567 9 12.5")
            addPathData("M9 12v-8")
        }
        return _brandBeats!!
    }

private var _brandBeats: ImageVector? = null
