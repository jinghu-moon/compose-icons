package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CashMoveBack: ImageVector
    get() {
        if (_cashMoveBack != null) return _cashMoveBack!!
        _cashMoveBack = tablerOutlineIcon(
            name = "CashMoveBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 15h-3C3.448 15 3 14.552 3 14v-8C3 5.448 3.448 5 4 5h12c.552 0 1 .448 1 1v3")
            addPathData("M12 19h-4C7.448 19 7 18.552 7 18v-8C7 9.448 7.448 9 8 9h12c.552 0 1 .448 1 1v2.5")
            addPathData("M15.914 13.417c-.28-.918-1.173-1.508-2.127-1.405-.954 .103-1.701 .869-1.779 1.826-.078 .957 .534 1.834 1.459 2.09")
            addPathData("M16 19h6")
            addPathData("M19 16l-3 3 3 3")
        }
        return _cashMoveBack!!
    }

private var _cashMoveBack: ImageVector? = null
