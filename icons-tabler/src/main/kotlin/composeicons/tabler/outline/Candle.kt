package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Candle: ImageVector
    get() {
        if (_candle != null) return _candle!!
        _candle = tablerOutlineIcon(
            name = "Candle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 21h6v-10c0-.552-.448-1-1-1h-4c-.552 0-1 .448-1 1v10")
            addPathData("M12 2l1.465 1.638c.728 .783 .712 1.999-.036 2.762-.748 .763-1.964 .803-2.761 .091C9.871 5.779 9.775 4.566 10.45 3.737L12 2")
        }
        return _candle!!
    }

private var _candle: ImageVector? = null
