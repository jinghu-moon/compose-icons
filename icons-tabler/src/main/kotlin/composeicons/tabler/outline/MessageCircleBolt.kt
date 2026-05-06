package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessageCircleBolt: ImageVector
    get() {
        if (_messageCircleBolt != null) return _messageCircleBolt!!
        _messageCircleBolt = tablerOutlineIcon(
            name = "MessageCircleBolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.038 19.927C11.207 20.119 9.359 19.798 7.7 19L3 20 4.3 16.1C1.976 12.663 2.874 8.228 6.4 5.726 9.926 3.225 14.99 3.43 18.245 6.206c1.993 1.7 2.93 4.043 2.746 6.346")
            addPathData("M19 16l-2 3h4l-2 3")
        }
        return _messageCircleBolt!!
    }

private var _messageCircleBolt: ImageVector? = null
