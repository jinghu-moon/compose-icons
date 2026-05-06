package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Report: ImageVector
    get() {
        if (_report != null) return _report!!
        _report = tablerOutlineIcon(
            name = "Report",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 5h-2C4.895 5 4 5.895 4 7v12c0 1.105 .895 2 2 2h5.697")
            addPathData("M18 14v4h4")
            addPathData("M18 11v-4C18 5.895 17.105 5 16 5h-2")
            addPathData("M8 5C8 3.895 8.895 3 10 3h2c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-2C8.895 7 8 6.105 8 5")
            addPathData("M14 18c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4")
            addPathData("M8 11h4")
            addPathData("M8 15h3")
        }
        return _report!!
    }

private var _report: ImageVector? = null
