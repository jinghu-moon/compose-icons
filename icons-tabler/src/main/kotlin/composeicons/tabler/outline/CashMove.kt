package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CashMove: ImageVector
    get() {
        if (_cashMove != null) return _cashMove!!
        _cashMove = tablerOutlineIcon(
            name = "CashMove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 15h-3C3.448 15 3 14.552 3 14v-8C3 5.448 3.448 5 4 5h12c.552 0 1 .448 1 1v3")
            addPathData("M12 19h-4C7.448 19 7 18.552 7 18v-8C7 9.448 7.448 9 8 9h12c.552 0 1 .448 1 1v2.5")
            addPathData("M15.92 13.437c-.271-.921-1.158-1.52-2.113-1.427-.955 .093-1.71 .852-1.798 1.808-.088 .956 .516 1.839 1.438 2.105")
            addPathData("M16 19h6")
            addPathData("M19 16l3 3-3 3")
        }
        return _cashMove!!
    }

private var _cashMove: ImageVector? = null
