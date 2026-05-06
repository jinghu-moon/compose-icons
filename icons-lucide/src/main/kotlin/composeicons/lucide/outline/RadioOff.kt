package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RadioOff: ImageVector
    get() {
        if (_radioOff != null) return _radioOff!!
        _radioOff = lucideOutlineIcon(
            name = "RadioOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.414 13.414c-.502 .52-1.246 .728-1.945 .545-.699-.183-1.245-.729-1.428-1.428-.183-.699 .025-1.443 .545-1.945")
            addPathData("M16.247 7.761c1.205 1.207 1.839 2.869 1.744 4.572")
            addPathData("M19.075 4.933c2.809 2.812 3.686 7.02 2.234 10.72")
            addPathData("M2 2 22 22")
            addPathData("M4.925 19.067C1.025 15.163 1.025 8.837 4.925 4.933")
            addPathData("M7.753 16.239C5.415 13.897 5.415 10.103 7.753 7.761")
        }
        return _radioOff!!
    }

private var _radioOff: ImageVector? = null
