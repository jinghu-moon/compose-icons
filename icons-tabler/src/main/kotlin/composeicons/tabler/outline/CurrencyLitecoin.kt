package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyLitecoin: ImageVector
    get() {
        if (_currencyLitecoin != null) return _currencyLitecoin!!
        _currencyLitecoin = tablerOutlineIcon(
            name = "CurrencyLitecoin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 19h-8.194c-.58 0-1.131-.252-1.511-.69-.38-.438-.551-1.019-.469-1.593L9.5 5")
            addPathData("M14 9 5 13")
        }
        return _currencyLitecoin!!
    }

private var _currencyLitecoin: ImageVector? = null
