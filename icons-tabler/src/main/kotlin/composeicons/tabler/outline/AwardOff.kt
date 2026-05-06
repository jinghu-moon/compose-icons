package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AwardOff: ImageVector
    get() {
        if (_awardOff != null) return _awardOff!!
        _awardOff = tablerOutlineIcon(
            name = "AwardOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.72 12.704c1.877-2.39 1.671-5.805-.48-7.952C14.089 2.605 10.673 2.405 8.287 4.286M6.532 6.526c-1.031 2.275-.545 4.95 1.22 6.717 1.765 1.767 4.44 2.256 6.716 1.227")
            addPathData("M12 15l3.4 5.89 1.598-3.233 .707 .046M18.813 14.801 17.196 12.001")
            addPathData("M6.802 12 3.402 17.89 7 17.657l1.598 3.232L11.998 15")
            addPathData("M3 3 21 21")
        }
        return _awardOff!!
    }

private var _awardOff: ImageVector? = null
