package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileTypeDoc: ImageVector
    get() {
        if (_fileTypeDoc != null) return _fileTypeDoc!!
        _fileTypeDoc = tablerOutlineIcon(
            name = "FileTypeDoc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M5 12v-7C5 3.895 5.895 3 7 3h7l5 5v4")
            addPathData("M5 15v6h1c1.105 0 2-.895 2-2v-2C8 15.895 7.105 15 6 15h-1")
            addPathData("M20 16.5C20 15.672 19.328 15 18.5 15 17.672 15 17 15.672 17 16.5v3c0 .828 .672 1.5 1.5 1.5C19.328 21 20 20.328 20 19.5")
            addPathData("M12.5 15c.828 0 1.5 .672 1.5 1.5v3C14 20.328 13.328 21 12.5 21 11.672 21 11 20.328 11 19.5v-3C11 15.672 11.672 15 12.5 15")
        }
        return _fileTypeDoc!!
    }

private var _fileTypeDoc: ImageVector? = null
