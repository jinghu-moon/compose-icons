package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileImport: ImageVector
    get() {
        if (_fileImport != null) return _fileImport!!
        _fileImport = tablerOutlineIcon(
            name = "FileImport",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M5 13v-8C5 3.895 5.895 3 7 3h7l5 5v11c0 1.105-.895 2-2 2h-5.5M2 19h7M6 16l3 3L6 22")
        }
        return _fileImport!!
    }

private var _fileImport: ImageVector? = null
