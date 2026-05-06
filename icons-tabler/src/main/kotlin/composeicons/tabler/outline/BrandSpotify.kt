package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSpotify: ImageVector
    get() {
        if (_brandSpotify != null) return _brandSpotify!!
        _brandSpotify = tablerOutlineIcon(
            name = "BrandSpotify",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M8 11.973c2.5-1.473 5.5-.973 7.5 .527")
            addPathData("M9 15c1.5-1 4-1 5 .5")
            addPathData("M7 9C9 8 13 7 17 9.5")
        }
        return _brandSpotify!!
    }

private var _brandSpotify: ImageVector? = null
