package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CashEdit: ImageVector
    get() {
        if (_cashEdit != null) return _cashEdit!!
        _cashEdit = tablerOutlineIcon(
            name = "CashEdit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 15h-3C3.448 15 3 14.552 3 14v-8C3 5.448 3.448 5 4 5h12c.552 0 1 .448 1 1v3")
            addPathData("M11 19h-3C7.448 19 7 18.552 7 18v-8C7 9.448 7.448 9 8 9h12c.552 0 1 .448 1 1v1.25")
            addPathData("M18.42 15.61c.82-.82 2.15-.82 2.97 0 .82 .82 .82 2.15 0 2.97L18 22h-3v-3l3.42-3.39")
        }
        return _cashEdit!!
    }

private var _cashEdit: ImageVector? = null
