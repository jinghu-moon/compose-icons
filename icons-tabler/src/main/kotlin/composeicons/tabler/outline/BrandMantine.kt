package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMantine: ImageVector
    get() {
        if (_brandMantine != null) return _brandMantine!!
        _brandMantine = tablerOutlineIcon(
            name = "BrandMantine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M11 16c1.22-.912 2-2.36 2-4C12.998 10.427 12.258 8.945 11 8")
            addPathData("M14 9h-2")
            addPathData("M14 15h-2")
            addPathData("M10 12h.01")
        }
        return _brandMantine!!
    }

private var _brandMantine: ImageVector? = null
