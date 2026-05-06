package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMatrix: ImageVector
    get() {
        if (_brandMatrix != null) return _brandMatrix!!
        _brandMatrix = tablerOutlineIcon(
            name = "BrandMatrix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 3h-1v18h1")
            addPathData("M20 21h1v-18h-1")
            addPathData("M7 9v6")
            addPathData("M12 15v-3.5C12 10.119 10.881 9 9.5 9 8.119 9 7 10.119 7 11.5v.5")
            addPathData("M17 15v-3.5C17 10.119 15.881 9 14.5 9 13.119 9 12 10.119 12 11.5v.5")
        }
        return _brandMatrix!!
    }

private var _brandMatrix: ImageVector? = null
