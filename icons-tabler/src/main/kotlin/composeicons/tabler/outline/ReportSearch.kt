package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ReportSearch: ImageVector
    get() {
        if (_reportSearch != null) return _reportSearch!!
        _reportSearch = tablerOutlineIcon(
            name = "ReportSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 5h-2C4.895 5 4 5.895 4 7v12c0 1.105 .895 2 2 2h5.697")
            addPathData("M18 12v-5C18 5.895 17.105 5 16 5h-2")
            addPathData("M8 5C8 3.895 8.895 3 10 3h2c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-2C8.895 7 8 6.105 8 5")
            addPathData("M8 11h4")
            addPathData("M8 15h3")
            addPathData("M14 17.5C14 18.881 15.119 20 16.5 20 17.881 20 19 18.881 19 17.5 19 16.119 17.881 15 16.5 15 15.119 15 14 16.119 14 17.5")
            addPathData("M18.5 19.5 21 22")
        }
        return _reportSearch!!
    }

private var _reportSearch: ImageVector? = null
