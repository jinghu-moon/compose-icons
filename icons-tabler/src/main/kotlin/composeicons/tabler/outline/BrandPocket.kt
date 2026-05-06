package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPocket: ImageVector
    get() {
        if (_brandPocket != null) return _brandPocket!!
        _brandPocket = tablerOutlineIcon(
            name = "BrandPocket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 4h14c1.105 0 2 .895 2 2v6c0 4.971-4.029 9-9 9C7.029 21 3 16.971 3 12v-6C3 4.895 3.895 4 5 4")
            addPathData("M8 11l4 4 4-4")
        }
        return _brandPocket!!
    }

private var _brandPocket: ImageVector? = null
