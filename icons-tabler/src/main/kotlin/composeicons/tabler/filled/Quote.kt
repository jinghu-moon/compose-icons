package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Quote: ImageVector
    get() {
        if (_quote != null) return _quote!!
        _quote = tablerFilledIcon(
            name = "Quote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 5c1.105 0 2 .895 2 2v6c0 3.13-1.65 5.193-4.757 5.97-.348 .09-.717-.014-.967-.271-.25-.257-.343-.629-.244-.974 .099-.345 .376-.61 .725-.695C7.984 16.473 9 15.203 9 13v-1h-3C4.953 12 4.083 11.194 4.005 10.15L4 10v-3C4 5.895 4.895 5 6 5Z")
            addPathData("M18 5c1.105 0 2 .895 2 2v6c0 3.13-1.65 5.193-4.757 5.97-.348 .09-.717-.014-.967-.271-.25-.257-.343-.629-.244-.974 .099-.345 .376-.61 .725-.695C16.984 16.473 18 15.203 18 13v-1h-3c-1.047 0-1.917-.806-1.995-1.85L13 10v-3c0-1.105 .895-2 2-2Z")
        }
        return _quote!!
    }

private var _quote: ImageVector? = null
