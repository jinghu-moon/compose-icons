package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBinance: ImageVector
    get() {
        if (_brandBinance != null) return _brandBinance!!
        _brandBinance = tablerOutlineIcon(
            name = "BrandBinance",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 8l2 2L12 6l4 4L18 8 12 2 6 8")
            addPathData("M6 16 8 14l4 4 3.5-3.5 2 2L12 22 6 16")
            addPathData("M20 10l2 2-2 2L18 12l2-2")
            addPathData("M4 10l2 2L4 14 2 12 4 10")
            addPathData("M12 10l2 2-2 2L10 12l2-2")
        }
        return _brandBinance!!
    }

private var _brandBinance: ImageVector? = null
