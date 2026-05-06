package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNextcloud: ImageVector
    get() {
        if (_brandNextcloud != null) return _brandNextcloud!!
        _brandNextcloud = tablerOutlineIcon(
            name = "BrandNextcloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 12c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5C17 9.239 14.761 7 12 7 9.239 7 7 9.239 7 12")
            addPathData("M2 12.5C2 13.881 3.119 15 4.5 15 5.881 15 7 13.881 7 12.5 7 11.119 5.881 10 4.5 10 3.119 10 2 11.119 2 12.5")
            addPathData("M17 12.5C17 13.881 18.119 15 19.5 15 20.881 15 22 13.881 22 12.5 22 11.119 20.881 10 19.5 10 18.119 10 17 11.119 17 12.5")
        }
        return _brandNextcloud!!
    }

private var _brandNextcloud: ImageVector? = null
