package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BarcodeOff: ImageVector
    get() {
        if (_barcodeOff != null) return _barcodeOff!!
        _barcodeOff = tablerOutlineIcon(
            name = "BarcodeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 7v-1C4 5.448 4.224 4.948 4.586 4.586")
            addPathData("M4 17v1c0 1.105 .895 2 2 2h2")
            addPathData("M16 4h2c1.105 0 2 .895 2 2v1")
            addPathData("M16 20h2c.551 0 1.05-.223 1.412-.584")
            addPathData("M5 11h1v2h-1v-2")
            addPathData("M10 11v2")
            addPathData("M15 11v.01")
            addPathData("M19 11v2")
            addPathData("M3 3 21 21")
        }
        return _barcodeOff!!
    }

private var _barcodeOff: ImageVector? = null
