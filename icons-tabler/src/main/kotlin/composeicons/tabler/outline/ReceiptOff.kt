package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ReceiptOff: ImageVector
    get() {
        if (_receiptOff != null) return _receiptOff!!
        _receiptOff = tablerOutlineIcon(
            name = "ReceiptOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 21v-16M7 3h10c1.105 0 2 .895 2 2v10M19 19.01v1.99L16 19l-2 2L12 19l-2 2L8 19 5 21")
            addPathData("M11 7h4")
            addPathData("M9 11h2")
            addPathData("M13 15h2")
            addPathData("M15 11v.01")
            addPathData("M3 3 21 21")
        }
        return _receiptOff!!
    }

private var _receiptOff: ImageVector? = null
