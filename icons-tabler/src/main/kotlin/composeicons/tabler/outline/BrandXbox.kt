package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandXbox: ImageVector
    get() {
        if (_brandXbox != null) return _brandXbox!!
        _brandXbox = tablerOutlineIcon(
            name = "BrandXbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M6.5 5C14.22 7.266 16.537 12.597 19 17.5")
            addPathData("M17.5 5C9.78 7.266 7.463 12.597 5 17.5")
        }
        return _brandXbox!!
    }

private var _brandXbox: ImageVector? = null
