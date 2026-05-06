package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileLike: ImageVector
    get() {
        if (_fileLike != null) return _fileLike!!
        _fileLike = tablerOutlineIcon(
            name = "FileLike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17c0-.552 .448-1 1-1h1c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-1C3.448 21 3 20.552 3 20v-3")
            addPathData("M6 20c0 .552 .448 1 1 1h3.756c.442 0 .831-.29 .958-.713l1.2-3c.09-.303 .133-.63-.056-.884C12.67 16.149 12.316 16 12 16h-2v-2.467c-0-.485-.318-.912-.781-1.052-.464-.14-.965 .039-1.234 .442L6 16v4")
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M5 12.1v-7.1C5 3.895 5.895 3 7 3h7l5 5v11c0 1.105-.895 2-2 2h-2.3")
        }
        return _fileLike!!
    }

private var _fileLike: ImageVector? = null
