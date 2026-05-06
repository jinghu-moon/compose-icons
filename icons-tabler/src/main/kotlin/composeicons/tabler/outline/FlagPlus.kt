package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FlagPlus: ImageVector
    get() {
        if (_flagPlus != null) return _flagPlus!!
        _flagPlus = tablerOutlineIcon(
            name = "FlagPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.433 15.315C13.514 15.115 12.671 14.659 12 14 10.056 12.094 6.944 12.094 5 14v-9C6.944 3.094 10.056 3.094 12 5c1.944 1.906 5.056 1.906 7 0v7")
            addPathData("M5 21v-7")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _flagPlus!!
    }

private var _flagPlus: ImageVector? = null
