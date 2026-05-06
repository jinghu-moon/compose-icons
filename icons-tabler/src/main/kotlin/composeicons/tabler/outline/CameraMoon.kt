package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CameraMoon: ImageVector
    get() {
        if (_cameraMoon != null) return _cameraMoon!!
        _cameraMoon = tablerOutlineIcon(
            name = "CameraMoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.5 20h-6.5C3.895 20 3 19.105 3 18v-9C3 7.895 3.895 7 5 7h1C7.105 7 8 6.105 8 5 8 4.448 8.448 4 9 4h6c.552 0 1 .448 1 1 0 1.105 .895 2 2 2h1c1.105 0 2 .895 2 2v3.5")
            addPathData("M14.815 11.96C14.314 10.603 12.916 9.796 11.49 10.042c-1.426 .246-2.473 1.474-2.491 2.92-.018 1.447 .999 2.7 2.418 2.981")
            addPathData("M18.62 22C16.62 22 15 20.42 15 18.47 15 16.743 16.273 15.305 17.954 15c-.16 .402-.241 .831-.24 1.264 0 1.95 1.621 3.53 3.62 3.53q.342 0 .666-.06C21.479 21.06 20.162 22 18.62 22")
        }
        return _cameraMoon!!
    }

private var _cameraMoon: ImageVector? = null
