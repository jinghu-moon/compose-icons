package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileInfinity: ImageVector
    get() {
        if (_fileInfinity != null) return _fileInfinity!!
        _fileInfinity = tablerOutlineIcon(
            name = "FileInfinity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.536 17.586c-.82-.781-2.109-.781-2.929 0-.387 .368-.607 .879-.607 1.414 0 .535 .219 1.046 .607 1.414 .809 .781 2.12 .781 2.929 0 .809-.781-.805 .778 0 0l1.46-1.41 1.46-1.419")
            addPathData("M15.54 17.582 17 19.002l1.46 1.41c.809 .78-.805-.779 0 0 .805 .779 2.12 .781 2.929 0 .387-.368 .607-.879 .607-1.414 0-.535-.219-1.046-.607-1.414-.82-.781-2.109-.781-2.929 0")
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M9.5 21h-2.5C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h7l5 5v6")
        }
        return _fileInfinity!!
    }

private var _fileInfinity: ImageVector? = null
