package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ReceiptPound: ImageVector
    get() {
        if (_receiptPound != null) return _receiptPound!!
        _receiptPound = tablerOutlineIcon(
            name = "ReceiptPound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 21v-16C5 3.895 5.895 3 7 3h10c1.105 0 2 .895 2 2v16L16 19l-2 2L12 19l-2 2L8 19 5 21")
            addPathData("M15 9C15 7.895 14.105 7 13 7c-1.105 0-2 .895-2 2v4c0 1.105-.895 2-2 2h6")
            addPathData("M9 12h4")
        }
        return _receiptPound!!
    }

private var _receiptPound: ImageVector? = null
