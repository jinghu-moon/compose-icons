package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ReceiptRupee: ImageVector
    get() {
        if (_receiptRupee != null) return _receiptRupee!!
        _receiptRupee = tablerOutlineIcon(
            name = "ReceiptRupee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 21v-16C5 3.895 5.895 3 7 3h10c1.105 0 2 .895 2 2v16L16 19l-2 2L12 19l-2 2L8 19 5 21")
            addPathData("M15 7h-6 1c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3h-1l3 3")
            addPathData("M9 10h6")
        }
        return _receiptRupee!!
    }

private var _receiptRupee: ImageVector? = null
