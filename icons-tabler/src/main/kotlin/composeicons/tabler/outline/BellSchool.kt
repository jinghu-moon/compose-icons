package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BellSchool: ImageVector
    get() {
        if (_bellSchool != null) return _bellSchool!!
        _bellSchool = tablerOutlineIcon(
            name = "BellSchool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 10c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C16 6.686 13.314 4 10 4 6.686 4 4 6.686 4 10")
            addPathData("M13.5 15h.5c1.105 0 2 .895 2 2v1c0 1.105-.895 2-2 2h-8C4.895 20 4 19.105 4 18v-1c0-1.105 .895-2 2-2h.5")
            addPathData("M16 17c1.774-.237 3.333-1.293 4.212-2.852 .878-1.559 .973-3.441 .255-5.08L20 8")
            addPathData("M10 10v.01")
            addPathData("M19 8c0 .552 .448 1 1 1 .552 0 1-.448 1-1C21 7.448 20.552 7 20 7c-.552 0-1 .448-1 1")
        }
        return _bellSchool!!
    }

private var _bellSchool: ImageVector? = null
