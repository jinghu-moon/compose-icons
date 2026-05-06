package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandReason: ImageVector
    get() {
        if (_brandReason != null) return _brandReason!!
        _brandReason = tablerOutlineIcon(
            name = "BrandReason",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14")
            addPathData("M18 18h-3v-6h3")
            addPathData("M18 15h-3")
            addPathData("M8 18v-6h2.5c.828 0 1.5 .672 1.5 1.5C12 14.328 11.328 15 10.5 15h-2.5")
            addPathData("M12 18 10 15")
        }
        return _brandReason!!
    }

private var _brandReason: ImageVector? = null
