package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileTypeVue: ImageVector
    get() {
        if (_fileTypeVue != null) return _fileTypeVue!!
        _fileTypeVue = tablerOutlineIcon(
            name = "FileTypeVue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M5 12v-7C5 3.895 5.895 3 7 3h7l5 5v4")
            addPathData("M4 15l2 6L8 15")
            addPathData("M11 15v4.5c0 .828 .672 1.5 1.5 1.5C13.328 21 14 20.328 14 19.5v-4.5")
            addPathData("M20 15h-3v6h3")
            addPathData("M17 18h2")
        }
        return _fileTypeVue!!
    }

private var _fileTypeVue: ImageVector? = null
