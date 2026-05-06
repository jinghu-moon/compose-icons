package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ReceiptRefund: ImageVector
    get() {
        if (_receiptRefund != null) return _receiptRefund!!
        _receiptRefund = tablerOutlineIcon(
            name = "ReceiptRefund",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 21v-16C5 3.895 5.895 3 7 3h10c1.105 0 2 .895 2 2v16L16 19l-2 2L12 19l-2 2L8 19 5 21")
            addPathData("M15 14v-2c0-1.105-.895-2-2-2h-4L11 8M11 12 9 10")
        }
        return _receiptRefund!!
    }

private var _receiptRefund: ImageVector? = null
