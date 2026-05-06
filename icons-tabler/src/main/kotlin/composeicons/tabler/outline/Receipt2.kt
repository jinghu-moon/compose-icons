package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Receipt2: ImageVector
    get() {
        if (_receipt2 != null) return _receipt2!!
        _receipt2 = tablerOutlineIcon(
            name = "Receipt2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 21v-16C5 3.895 5.895 3 7 3h10c1.105 0 2 .895 2 2v16L16 19l-2 2L12 19l-2 2L8 19 5 21")
            addPathData("M14 8h-2.5C10.672 8 10 8.672 10 9.5c0 .828 .672 1.5 1.5 1.5h1c.828 0 1.5 .672 1.5 1.5C14 13.328 13.328 14 12.5 14h-2.5M12 14v1.5M12 6.5v1.5")
        }
        return _receipt2!!
    }

private var _receipt2: ImageVector? = null
