package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ReceiptEuro: ImageVector
    get() {
        if (_receiptEuro != null) return _receiptEuro!!
        _receiptEuro = tablerOutlineIcon(
            name = "ReceiptEuro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 21v-16C5 3.895 5.895 3 7 3h10c1.105 0 2 .895 2 2v16L16 19l-2 2L12 19l-2 2L8 19 5 21")
            addPathData("M15 7.8C14.477 7.298 13.828 7 13.125 7 11.398 7 10 8.791 10 11c0 2.209 1.398 4 3.125 4 .703 0 1.352-.298 1.874-.8")
            addPathData("M9 11h4")
        }
        return _receiptEuro!!
    }

private var _receiptEuro: ImageVector? = null
