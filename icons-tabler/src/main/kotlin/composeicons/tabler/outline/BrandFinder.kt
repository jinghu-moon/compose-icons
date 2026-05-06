package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFinder: ImageVector
    get() {
        if (_brandFinder != null) return _brandFinder!!
        _brandFinder = tablerOutlineIcon(
            name = "BrandFinder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5C3 4.448 3.448 4 4 4h16c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-16C3.448 20 3 19.552 3 19v-14")
            addPathData("M7 8v1")
            addPathData("M17 8v1")
            addPathData("M12.5 4C11.846 5.486 11.24 7.443 11 13h2.5c-.19 2.867 .094 5.024 .5 7")
            addPathData("M7 15.5c3.667 2 6.333 2 10 0")
        }
        return _brandFinder!!
    }

private var _brandFinder: ImageVector? = null
