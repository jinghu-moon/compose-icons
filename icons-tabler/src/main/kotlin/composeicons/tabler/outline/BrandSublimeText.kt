package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSublimeText: ImageVector
    get() {
        if (_brandSublimeText != null) return _brandSublimeText!!
        _brandSublimeText = tablerOutlineIcon(
            name = "BrandSublimeText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 8 5 12.5v-5.5L19 2.5v5.5")
            addPathData("M19 17 5 21.5v-5.5L19 11.5v5.5")
            addPathData("M19 11.5 5 7")
            addPathData("M5 12.5 19 17")
        }
        return _brandSublimeText!!
    }

private var _brandSublimeText: ImageVector? = null
