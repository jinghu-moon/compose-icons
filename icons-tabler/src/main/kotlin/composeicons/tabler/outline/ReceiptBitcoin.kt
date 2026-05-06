package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ReceiptBitcoin: ImageVector
    get() {
        if (_receiptBitcoin != null) return _receiptBitcoin!!
        _receiptBitcoin = tablerOutlineIcon(
            name = "ReceiptBitcoin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 21v-16C5 3.895 5.895 3 7 3h10c1.105 0 2 .895 2 2v16L16 19l-2 2L12 19l-2 2L8 19 5 21")
            addPathData("M9 7h4.09C14.145 7 15 7.895 15 9c0 1.105-.855 2-1.91 2 1.055 0 1.91 .895 1.91 2 0 1.105-.855 2-1.91 2h-4.09")
            addPathData("M10 11h4")
            addPathData("M10 6v10-9")
            addPathData("M13 6v1")
            addPathData("M13 15v1")
        }
        return _receiptBitcoin!!
    }

private var _receiptBitcoin: ImageVector? = null
