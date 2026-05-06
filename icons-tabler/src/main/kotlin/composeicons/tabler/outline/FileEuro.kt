package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileEuro: ImageVector
    get() {
        if (_fileEuro != null) return _fileEuro!!
        _fileEuro = tablerOutlineIcon(
            name = "FileEuro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M17 21h-10C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h7l5 5v11c0 1.105-.895 2-2 2")
            addPathData("M12 14h-3")
            addPathData("M14 11.172c-1.243-.44-2.628-.017-3.413 1.044-.785 1.06-.785 2.509 0 3.569 .785 1.06 2.169 1.484 3.413 1.044")
        }
        return _fileEuro!!
    }

private var _fileEuro: ImageVector? = null
