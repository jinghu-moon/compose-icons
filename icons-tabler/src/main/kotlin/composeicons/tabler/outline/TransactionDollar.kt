package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TransactionDollar: ImageVector
    get() {
        if (_transactionDollar != null) return _transactionDollar!!
        _transactionDollar = tablerOutlineIcon(
            name = "TransactionDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.8 13C20.431 12.36 19.739 11.975 19 12h-2c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2h2c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-2c-.739 .025-1.431-.36-1.8-1")
            addPathData("M18 11v10")
            addPathData("M3 5c0 1.105 .895 2 2 2C6.105 7 7 6.105 7 5 7 3.895 6.105 3 5 3 3.895 3 3 3.895 3 5")
            addPathData("M15 5c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C19 3.895 18.105 3 17 3c-1.105 0-2 .895-2 2")
            addPathData("M7 5h8")
            addPathData("M7 5v8c0 1.657 1.343 3 3 3h1")
        }
        return _transactionDollar!!
    }

private var _transactionDollar: ImageVector? = null
