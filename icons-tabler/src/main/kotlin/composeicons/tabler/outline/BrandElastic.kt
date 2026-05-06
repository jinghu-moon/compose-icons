package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandElastic: ImageVector
    get() {
        if (_brandElastic != null) return _brandElastic!!
        _brandElastic = tablerOutlineIcon(
            name = "BrandElastic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 2c2.761 0 5 2.239 5 5 0 .712-.232 1.387-.5 2C20.394 9.042 22 10.595 22 12.5c0 1.869-1.656 3.4-3.5 3.5 .333 .625 .5 1.125 .5 1.5C19 18.881 17.881 20 16.5 20c-.787 0-1.542-.432-2-1-.786 1.73-2.476 3-4.5 3C8.313 22 6.74 21.15 5.816 19.739 4.893 18.328 4.742 16.546 5.417 15 3.546 14.945 2.05 13.428 2.02 11.557 1.991 9.685 3.439 8.122 5.307 8.008h.195C4.934 7.25 4.842 6.237 5.266 5.39 5.689 4.543 6.555 4.008 7.502 4.008c.787 0 1.542 .432 2 1 .786-1.73 2.476-3 4.5-3L14 2")
            addPathData("M8.5 9l-3-1")
            addPathData("M9.5 5l-1 4 1 2 5 2 4-4")
            addPathData("M18.499 16l-3-.5L14.499 13")
            addPathData("M14.5 19l1-3.5")
            addPathData("M5.417 15 9.5 11")
        }
        return _brandElastic!!
    }

private var _brandElastic: ImageVector? = null
