package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BeerOff: ImageVector
    get() {
        if (_beerOff != null) return _beerOff!!
        _beerOff = lucideOutlineIcon(
            name = "BeerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 13v5")
            addPathData("M17 11.47v-3.47")
            addPathData("M17 11h1c1.014-0 1.96 .512 2.513 1.362 .554 .85 .641 1.921 .232 2.849")
            addPathData("M2 2 22 22")
            addPathData("M5 8v12c0 1.105 .895 2 2 2h8c1.105 0 2-.895 2-2v-3")
            addPathData("M7.536 7.535C6.766 7.649 6.154 8 5.5 8 4.489 8 3.577 7.391 3.19 6.457 2.803 5.522 3.017 4.447 3.732 3.732")
            addPathData("M8.727 3.204C9.306 2.767 9.885 2 11 2c1.56 0 2 1.5 3 1.5C15 3.5 15.72 3 16.5 3 17.881 3 19 4.119 19 5.5 19 6.881 17.881 8 16.5 8 15.72 8 15 7.5 14 7.5c-.285 .002-.568 .042-.842 .12")
            addPathData("M9 14.6v3.4")
        }
        return _beerOff!!
    }

private var _beerOff: ImageVector? = null
