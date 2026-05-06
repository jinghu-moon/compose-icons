package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyRenminbi: ImageVector
    get() {
        if (_currencyRenminbi != null) return _currencyRenminbi!!
        _currencyRenminbi = tablerOutlineIcon(
            name = "CurrencyRenminbi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 9v8c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M19 9h-14")
            addPathData("M19 5h-14")
            addPathData("M9 9v4c0 2.5-.667 4-2 6")
        }
        return _currencyRenminbi!!
    }

private var _currencyRenminbi: ImageVector? = null
