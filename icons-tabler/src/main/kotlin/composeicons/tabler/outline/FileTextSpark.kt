package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileTextSpark: ImageVector
    get() {
        if (_fileTextSpark != null) return _fileTextSpark!!
        _fileTextSpark = tablerOutlineIcon(
            name = "FileTextSpark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M12 21h-5C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h7l5 5v3.5")
            addPathData("M9 9h1")
            addPathData("M9 13h6")
            addPathData("M9 17h3")
            addPathData("M19 22.5c.419-1.73 1.77-3.081 3.5-3.5C20.77 18.581 19.419 17.23 19 15.5c-.419 1.73-1.77 3.081-3.5 3.5 1.73 .419 3.081 1.77 3.5 3.5")
        }
        return _fileTextSpark!!
    }

private var _fileTextSpark: ImageVector? = null
