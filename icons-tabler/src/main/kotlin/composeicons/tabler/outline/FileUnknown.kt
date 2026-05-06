package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileUnknown: ImageVector
    get() {
        if (_fileUnknown != null) return _fileUnknown!!
        _fileUnknown = tablerOutlineIcon(
            name = "FileUnknown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M17 21h-10C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h7l5 5v11c0 1.105-.895 2-2 2")
            addPathData("M12 17v.01")
            addPathData("M12 14c.694 0 1.297-.475 1.459-1.149 .162-.674-.159-1.372-.777-1.687-.618-.315-1.371-.165-1.822 .362")
        }
        return _fileUnknown!!
    }

private var _fileUnknown: ImageVector? = null
