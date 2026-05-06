package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cardboards: ImageVector
    get() {
        if (_cardboards != null) return _cardboards!!
        _cardboards = tablerOutlineIcon(
            name = "Cardboards",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 8v8.5C3 17.881 4.119 19 5.5 19h1.06c.911-.002 1.772-.418 2.34-1.13l1.54-1.92c.38-.473 .953-.748 1.56-.748 .607 0 1.18 .275 1.56 .748l1.54 1.92c.568 .712 1.429 1.128 2.34 1.13h1.06C19.881 19 21 17.881 21 16.5v-8.5C21 6.895 20.105 6 19 6h-14C3.895 6 3 6.895 3 8")
            addPathData("M7 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1C9 11.448 8.552 11 8 11c-.552 0-1 .448-1 1")
            addPathData("M15 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _cardboards!!
    }

private var _cardboards: ImageVector? = null
