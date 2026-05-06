package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PodiumOff: ImageVector
    get() {
        if (_podiumOff != null) return _podiumOff!!
        _podiumOff = tablerOutlineIcon(
            name = "PodiumOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 8h7l-.621 2.485c-.223 .89-1.022 1.515-1.94 1.515h-.439M12 12h-4.439C6.643 12 5.844 11.375 5.621 10.485L5 8h3")
            addPathData("M7 8v-1M7.864 3.894C8.427 3.321 9.197 2.999 10 3")
            addPathData("M8 12l1 9")
            addPathData("M15.599 15.613 15 21")
            addPathData("M7 21h10")
            addPathData("M3 3 21 21")
        }
        return _podiumOff!!
    }

private var _podiumOff: ImageVector? = null
