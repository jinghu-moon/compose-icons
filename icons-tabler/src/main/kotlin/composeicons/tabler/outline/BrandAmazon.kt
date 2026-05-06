package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAmazon: ImageVector
    get() {
        if (_brandAmazon != null) return _brandAmazon!!
        _brandAmazon = tablerOutlineIcon(
            name = "BrandAmazon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 12.5c-2.298 1.089-4.832 1.584-7.37 1.44C7.208 13.532 4.928 12.521 3 11")
            addPathData("M19.5 15c.907-1.411 1.451-3.323 1.5-5C19.803 9.227 18.423 9.065 17 9")
        }
        return _brandAmazon!!
    }

private var _brandAmazon: ImageVector? = null
