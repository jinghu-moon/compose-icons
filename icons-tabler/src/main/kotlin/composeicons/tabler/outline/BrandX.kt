package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandX: ImageVector
    get() {
        if (_brandX != null) return _brandX!!
        _brandX = tablerOutlineIcon(
            name = "BrandX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 4 15.733 20h4.267L8.267 4h-4.267")
            addPathData("M4 20l6.768-6.768M13.228 10.772 20 4")
        }
        return _brandX!!
    }

private var _brandX: ImageVector? = null
