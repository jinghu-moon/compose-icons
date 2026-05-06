package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChalkboardTeacher: ImageVector
    get() {
        if (_chalkboardTeacher != null) return _chalkboardTeacher!!
        _chalkboardTeacher = tablerOutlineIcon(
            name = "ChalkboardTeacher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 19h-3C3.895 19 3 18.105 3 17v-10C3 5.895 3.895 5 5 5h14c1.105 0 2 .895 2 2v11c0 .552-.448 1-1 1")
            addPathData("M12 14c0 1.105 .896 2 2.001 2 1.105-0 2-.896 2-2.001-0-1.105-.896-2-2.001-2-1.105 0-2 .896-2 2.001")
            addPathData("M17 19c0-1.105-.895-2-2-2h-2c-1.105 0-2 .895-2 2")
        }
        return _chalkboardTeacher!!
    }

private var _chalkboardTeacher: ImageVector? = null
