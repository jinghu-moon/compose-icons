package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyTaka: ImageVector
    get() {
        if (_currencyTaka != null) return _currencyTaka!!
        _currencyTaka = tablerOutlineIcon(
            name = "CurrencyTaka",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.5 15.5c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M7 7C7 5.895 7.895 5 9 5c1.105 0 2 .895 2 2v9c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3v-.5")
            addPathData("M8 11h6")
        }
        return _currencyTaka!!
    }

private var _currencyTaka: ImageVector? = null
