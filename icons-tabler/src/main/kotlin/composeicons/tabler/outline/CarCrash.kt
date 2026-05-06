package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarCrash: ImageVector
    get() {
        if (_carCrash != null) return _carCrash!!
        _carCrash = tablerOutlineIcon(
            name = "CarCrash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M7 6l4 5h1c1.105 0 2 .895 2 2v4h-2M8 17h-5M3 11h8M5 11v-5M7 6h-4")
            addPathData("M14 8v-2")
            addPathData("M19 12h2")
            addPathData("M17.5 15.5 19 17")
            addPathData("M17.5 8.5 19 7")
        }
        return _carCrash!!
    }

private var _carCrash: ImageVector? = null
