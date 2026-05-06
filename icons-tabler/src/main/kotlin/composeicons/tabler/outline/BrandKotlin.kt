package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandKotlin: ImageVector
    get() {
        if (_brandKotlin != null) return _brandKotlin!!
        _brandKotlin = tablerOutlineIcon(
            name = "BrandKotlin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 20h-16v-16h16")
            addPathData("M4 20 20 4")
            addPathData("M4 12 12 4")
            addPathData("M12 12l8 8")
        }
        return _brandKotlin!!
    }

private var _brandKotlin: ImageVector? = null
