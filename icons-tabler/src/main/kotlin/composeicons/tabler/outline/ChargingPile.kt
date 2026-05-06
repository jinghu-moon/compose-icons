package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChargingPile: ImageVector
    get() {
        if (_chargingPile != null) return _chargingPile!!
        _chargingPile = tablerOutlineIcon(
            name = "ChargingPile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 7 17 8")
            addPathData("M14 11h1c1.105 0 2 .895 2 2v3c0 .828 .672 1.5 1.5 1.5C19.328 17.5 20 16.828 20 16v-7L17 6")
            addPathData("M4 20v-14C4 4.895 4.895 4 6 4h6c1.105 0 2 .895 2 2v14")
            addPathData("M9 11.5 7.5 14h3L9 16.5")
            addPathData("M3 20h12")
            addPathData("M4 8h10")
        }
        return _chargingPile!!
    }

private var _chargingPile: ImageVector? = null
