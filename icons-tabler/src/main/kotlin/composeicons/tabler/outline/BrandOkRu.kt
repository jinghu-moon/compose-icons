package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandOkRu: ImageVector
    get() {
        if (_brandOkRu != null) return _brandOkRu!!
        _brandOkRu = tablerOutlineIcon(
            name = "BrandOkRu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 9c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 7.895 13.105 7 12 7c-1.105 0-2 .895-2 2")
            addPathData("M20 12c0 8 0 8-8 8C4 20 4 20 4 12 4 4 4 4 12 4c8 0 8 0 8 8")
            addPathData("M9.5 13c1.333 .667 3.667 .667 5 0")
            addPathData("M9.5 17 12 14l2.5 3")
            addPathData("M12 13.5v.5")
        }
        return _brandOkRu!!
    }

private var _brandOkRu: ImageVector? = null
