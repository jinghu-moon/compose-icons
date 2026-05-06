package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ReceiptDollar: ImageVector
    get() {
        if (_receiptDollar != null) return _receiptDollar!!
        _receiptDollar = tablerOutlineIcon(
            name = "ReceiptDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 21v-16C5 3.895 5.895 3 7 3h10c1.105 0 2 .895 2 2v16L16 19l-2 2L12 19l-2 2L8 19 5 21")
            addPathData("M14.8 8C14.431 7.36 13.739 6.975 13 7h-2C9.895 7 9 7.895 9 9c0 1.105 .895 2 2 2h2c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-2c-.739 .025-1.431-.36-1.8-1")
            addPathData("M12 6v10")
        }
        return _receiptDollar!!
    }

private var _receiptDollar: ImageVector? = null
