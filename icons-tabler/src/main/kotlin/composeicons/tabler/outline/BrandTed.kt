package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTed: ImageVector
    get() {
        if (_brandTed != null) return _brandTed!!
        _brandTed = tablerOutlineIcon(
            name = "BrandTed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 8h4")
            addPathData("M4 8v8")
            addPathData("M13 8h-4v8h4")
            addPathData("M9 12h2.5")
            addPathData("M16 8v8h2c1.657 0 3-1.343 3-3v-2C21 9.343 19.657 8 18 8h-2")
        }
        return _brandTed!!
    }

private var _brandTed: ImageVector? = null
