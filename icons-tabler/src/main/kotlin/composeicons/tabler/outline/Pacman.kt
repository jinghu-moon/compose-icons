package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pacman: ImageVector
    get() {
        if (_pacman != null) return _pacman!!
        _pacman = tablerOutlineIcon(
            name = "Pacman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.636 5.636C8.447 3.825 10.944 2.871 13.502 3.013c2.557 .143 4.933 1.368 6.531 3.37L14.414 12l5.619 5.617c-2.082 2.603-5.433 3.842-8.708 3.22C8.051 20.214 5.388 17.833 4.405 14.648 3.423 11.463 4.281 7.995 6.636 5.636")
            addPathData("M11.5 7.5c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _pacman!!
    }

private var _pacman: ImageVector? = null
