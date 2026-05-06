package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ladle: ImageVector
    get() {
        if (_ladle != null) return _ladle!!
        _ladle = tablerOutlineIcon(
            name = "Ladle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 14v1c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-9C15 4.343 16.343 3 18 3c1.657 0 3 1.343 3 3")
            addPathData("M9 16c-.663 0-1.3-.036-1.896-.102l-.5-.064C4.481 15.526 3 14.821 3 14c0-.82 1.482-1.526 3.603-1.834l.5-.064C7.733 12.033 8.366 11.999 9 12c.663 0 1.3 .036 1.896 .102l.5 .064C13.519 12.474 15 13.179 15 14c0 .82-1.482 1.526-3.603 1.834l-.5 .064C10.267 15.967 9.634 16.001 9 16")
        }
        return _ladle!!
    }

private var _ladle: ImageVector? = null
