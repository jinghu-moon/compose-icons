package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDenodo: ImageVector
    get() {
        if (_brandDenodo != null) return _brandDenodo!!
        _brandDenodo = tablerOutlineIcon(
            name = "BrandDenodo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 11h2v2h-2v-2")
            addPathData("M3.634 15.634l1.732-1 1 1.732-1.732 1L3.634 15.634")
            addPathData("M11 19h2v2h-2v-2")
            addPathData("M18.634 14.634l1.732 1-1 1.732-1.732-1 1-1.732")
            addPathData("M17.634 7.634l1.732-1 1 1.732-1.732 1-1-1.732")
            addPathData("M11 3h2v2h-2v-2")
            addPathData("M3.634 8.366 4.634 6.634l1.732 1-1 1.732-1.732-1")
        }
        return _brandDenodo!!
    }

private var _brandDenodo: ImageVector? = null
