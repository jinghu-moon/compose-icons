package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileTypeZip: ImageVector
    get() {
        if (_fileTypeZip != null) return _fileTypeZip!!
        _fileTypeZip = tablerOutlineIcon(
            name = "FileTypeZip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M5 12v-7C5 3.895 5.895 3 7 3h7l5 5v4")
            addPathData("M16 18h1.5C18.328 18 19 17.328 19 16.5 19 15.672 18.328 15 17.5 15h-1.5v6")
            addPathData("M12 15v6")
            addPathData("M5 15h3L5 21h3")
        }
        return _fileTypeZip!!
    }

private var _fileTypeZip: ImageVector? = null
