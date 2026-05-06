package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChessBishop: ImageVector
    get() {
        if (_chessBishop != null) return _chessBishop!!
        _chessBishop = tablerOutlineIcon(
            name = "ChessBishop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 16l-1.447 .724c-.339 .169-.553 .515-.553 .894v2.382h12v-2.382c-0-.379-.214-.725-.553-.894L16 16h-8")
            addPathData("M11 4c0 .552 .448 1 1 1 .552 0 1-.448 1-1C13 3.448 12.552 3 12 3c-.552 0-1 .448-1 1")
            addPathData("M9.5 16C7.833 16 7 14.331 7 13 7 9.333 8.667 7 12 6c3.333 1 5 3.427 5 7 0 1.284-.775 2.881-2.325 3h-.175-5")
            addPathData("M15 8l-3 3")
            addPathData("M12 5v1")
        }
        return _chessBishop!!
    }

private var _chessBishop: ImageVector? = null
