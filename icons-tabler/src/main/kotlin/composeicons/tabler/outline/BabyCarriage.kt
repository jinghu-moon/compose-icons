package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) return _babyCarriage!!
        _babyCarriage = tablerOutlineIcon(
            name = "BabyCarriage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C10 17.895 9.105 17 8 17c-1.105 0-2 .895-2 2")
            addPathData("M16 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M2 5h2.5L6.132 9.897c.817 2.451 3.11 4.103 5.693 4.103h2.675C17.538 14 20 11.538 20 8.5 20 5.462 17.538 3 14.5 3h-.5v6")
            addPathData("M6 9h14")
            addPathData("M9 17l1-3")
            addPathData("M16 14l1 3")
        }
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
