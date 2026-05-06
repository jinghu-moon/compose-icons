package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileTypeXml: ImageVector
    get() {
        if (_fileTypeXml != null) return _fileTypeXml!!
        _fileTypeXml = tablerOutlineIcon(
            name = "FileTypeXml",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M5 12v-7C5 3.895 5.895 3 7 3h7l5 5v4")
            addPathData("M4 15l4 6")
            addPathData("M4 21 8 15")
            addPathData("M19 15v6h3")
            addPathData("M11 21v-6l2.5 3L16 15v6")
        }
        return _fileTypeXml!!
    }

private var _fileTypeXml: ImageVector? = null
