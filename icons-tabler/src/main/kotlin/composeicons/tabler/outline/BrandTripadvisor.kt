package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTripadvisor: ImageVector
    get() {
        if (_brandTripadvisor != null) return _brandTripadvisor!!
        _brandTripadvisor = tablerOutlineIcon(
            name = "BrandTripadvisor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 13.5C5 14.328 5.672 15 6.5 15 7.328 15 8 14.328 8 13.5 8 12.672 7.328 12 6.5 12 5.672 12 5 12.672 5 13.5")
            addPathData("M16 13.5c0 .828 .672 1.5 1.5 1.5C18.328 15 19 14.328 19 13.5 19 12.672 18.328 12 17.5 12 16.672 12 16 12.672 16 13.5")
            addPathData("M17.5 9c-2.102 0-3.924 1.456-4.388 3.506-.464 2.05 .553 4.149 2.45 5.055 1.897 .906 4.169 .377 5.471-1.273C22.335 14.638 22.322 12.306 21 10.671L22 9h-4.5")
            addPathData("M6.5 9c2.102 0 3.924 1.456 4.388 3.506 .464 2.05-.553 4.149-2.45 5.055-1.897 .906-4.169 .377-5.471-1.273C1.665 14.638 1.678 12.306 3 10.671L2 9h4.5")
            addPathData("M10.5 15.5l1.5 2 1.5-2")
            addPathData("M9 6.75c2-.667 4-.667 6 0")
        }
        return _brandTripadvisor!!
    }

private var _brandTripadvisor: ImageVector? = null
