package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhotoScan: ImageVector
    get() {
        if (_photoScan != null) return _photoScan!!
        _photoScan = tablerOutlineIcon(
            name = "PhotoScan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8h.01")
            addPathData("M6 13 8.644 10.356c.227-.227 .535-.355 .856-.355 .321 0 .629 .128 .856 .355L14 14")
            addPathData("M13 13l1.644-1.644c.227-.227 .535-.355 .856-.355 .321 0 .629 .128 .856 .355L18 13")
            addPathData("M4 8v-2C4 4.895 4.895 4 6 4h2")
            addPathData("M4 16v2c0 1.105 .895 2 2 2h2")
            addPathData("M16 4h2c1.105 0 2 .895 2 2v2")
            addPathData("M16 20h2c1.105 0 2-.895 2-2v-2")
        }
        return _photoScan!!
    }

private var _photoScan: ImageVector? = null
