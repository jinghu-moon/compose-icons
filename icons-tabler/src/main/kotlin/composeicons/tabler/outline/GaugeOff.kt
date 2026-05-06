package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GaugeOff: ImageVector
    get() {
        if (_gaugeOff != null) return _gaugeOff!!
        _gaugeOff = tablerOutlineIcon(
            name = "GaugeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.038 16.052C21.788 12.587 21.118 8.39 18.377 5.641 15.636 2.892 11.441 2.211 7.971 3.95M5.638 5.636C2.124 9.151 2.125 14.85 5.64 18.364c3.515 3.514 9.214 3.513 12.728-.002")
            addPathData("M11.283 11.303c-.389 .392-.387 1.025 .005 1.414 .392 .389 1.025 .387 1.414-.004")
            addPathData("M14 10 16 8")
            addPathData("M7 12C7 10.614 7.564 9.36 8.475 8.454M11.094 7.082C11.388 7.028 11.691 7 12 7")
            addPathData("M3 3 21 21")
        }
        return _gaugeOff!!
    }

private var _gaugeOff: ImageVector? = null
