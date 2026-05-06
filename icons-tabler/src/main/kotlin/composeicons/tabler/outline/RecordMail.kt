package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RecordMail: ImageVector
    get() {
        if (_recordMail != null) return _recordMail!!
        _recordMail = tablerOutlineIcon(
            name = "RecordMail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C10 10.343 8.657 9 7 9 5.343 9 4 10.343 4 12")
            addPathData("M14 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C20 10.343 18.657 9 17 9c-1.657 0-3 1.343-3 3")
            addPathData("M7 15h10")
        }
        return _recordMail!!
    }

private var _recordMail: ImageVector? = null
