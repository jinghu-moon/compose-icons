package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TransactionYuan: ImageVector
    get() {
        if (_transactionYuan != null) return _transactionYuan!!
        _transactionYuan = tablerOutlineIcon(
            name = "TransactionYuan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 17h6")
            addPathData("M15 12l3 4.5")
            addPathData("M21 12l-3 4.5v4.5")
            addPathData("M3 5c0 1.105 .895 2 2 2C6.105 7 7 6.105 7 5 7 3.895 6.105 3 5 3 3.895 3 3 3.895 3 5")
            addPathData("M15 5c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C19 3.895 18.105 3 17 3c-1.105 0-2 .895-2 2")
            addPathData("M7 5h8")
            addPathData("M7 5v8c0 1.657 1.343 3 3 3h1")
        }
        return _transactionYuan!!
    }

private var _transactionYuan: ImageVector? = null
