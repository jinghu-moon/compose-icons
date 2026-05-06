package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyDirham: ImageVector
    get() {
        if (_currencyDirham != null) return _currencyDirham!!
        _currencyDirham = tablerOutlineIcon(
            name = "CurrencyDirham",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.5 19h-3.5")
            addPathData("M8.599 16.479c-.467-.502-1.215-.624-1.817-.296-.602 .328-.905 1.023-.736 1.687 .169 .664 .768 1.13 1.453 1.13")
            addPathData("M7 4v9")
            addPathData("M15 13h1.888c.537 0 1.034-.287 1.301-.753 .268-.466 .266-1.039-.005-1.503L16 7")
            addPathData("M11 13.01v-.01")
        }
        return _currencyDirham!!
    }

private var _currencyDirham: ImageVector? = null
