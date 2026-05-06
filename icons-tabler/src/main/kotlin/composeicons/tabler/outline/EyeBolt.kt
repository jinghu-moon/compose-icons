package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EyeBolt: ImageVector
    get() {
        if (_eyeBolt != null) return _eyeBolt!!
        _eyeBolt = tablerOutlineIcon(
            name = "EyeBolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M13.1 17.936c-.365 .043-.732 .064-1.1 .064C8.4 18 5.4 16 3 12 5.4 8 8.4 6 12 6c3.6 0 6.6 2 9 6")
            addPathData("M19 16l-2 3h4l-2 3")
        }
        return _eyeBolt!!
    }

private var _eyeBolt: ImageVector? = null
