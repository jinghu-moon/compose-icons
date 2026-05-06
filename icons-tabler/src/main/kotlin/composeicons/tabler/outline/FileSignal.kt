package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileSignal: ImageVector
    get() {
        if (_fileSignal != null) return _fileSignal!!
        _fileSignal = tablerOutlineIcon(
            name = "FileSignal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M17 21h-10C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h7l5 5v11c0 1.105-.895 2-2 2")
            addPathData("M12 14v.01")
            addPathData("M9.525 11.525C8.869 12.181 8.5 13.072 8.5 14c0 .928 .369 1.819 1.025 2.475M14.475 16.475c.656-.656 1.025-1.547 1.025-2.475 0-.928-.369-1.819-1.025-2.475")
        }
        return _fileSignal!!
    }

private var _fileSignal: ImageVector? = null
