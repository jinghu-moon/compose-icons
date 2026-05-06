package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DiscountOff: ImageVector
    get() {
        if (_discountOff != null) return _discountOff!!
        _discountOff = tablerOutlineIcon(
            name = "DiscountOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 15l3-3M14 10 15 9")
            addPathData("M9.148 9.145c-.146 .142-.191 .358-.113 .547 .077 .188 .262 .31 .465 .308 .131 0 .256-.051 .35-.142")
            addPathData("M14.148 14.145c-.146 .142-.191 .358-.113 .547 .077 .188 .262 .31 .465 .308 .131 0 .256-.051 .35-.142")
            addPathData("M5.641 5.631C2.123 9.143 2.119 14.842 5.631 18.36c3.512 3.517 9.211 3.522 12.729 .009M20.04 16.051C21.79 12.584 21.119 8.386 18.376 5.638 15.633 2.889 11.436 2.21 7.966 3.953")
            addPathData("M3 3 21 21")
        }
        return _discountOff!!
    }

private var _discountOff: ImageVector? = null
