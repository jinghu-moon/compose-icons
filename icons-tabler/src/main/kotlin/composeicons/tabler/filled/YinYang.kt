package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.YinYang: ImageVector
    get() {
        if (_yinYang != null) return _yinYang!!
        _yinYang = tablerFilledIcon(
            name = "YinYang",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 3.34c4.167 2.406 6.03 7.439 4.433 11.979-1.597 4.539-6.201 7.298-10.957 6.565C5.72 21.15 2.161 17.134 2.005 12.324L2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34ZM8 5.072C4.864 6.883 3.336 10.573 4.273 14.071 5.21 17.568 8.379 20 12 20l.2-.005c2.129-.107 3.8-1.864 3.8-3.995 0-2.131-1.671-3.888-3.8-3.995L12 12C9.83 12 8.055 10.27 8.001 8.1 7.947 5.931 9.633 4.113 11.8 4.005L12 4C10.596 4 9.216 4.37 8 5.072ZM12 6.5c-.828 0-1.5 .672-1.5 1.5 0 .828 .672 1.5 1.5 1.5 .828 0 1.5-.672 1.5-1.5C13.5 7.172 12.828 6.5 12 6.5")
            addPathData("M12 14.5c.828 0 1.5 .672 1.5 1.5 0 .828-.672 1.5-1.5 1.5-.828 0-1.5-.672-1.5-1.5 0-.828 .672-1.5 1.5-1.5")
        }
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
