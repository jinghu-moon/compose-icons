package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LockClosed: ImageVector
    get() {
        if (_lockClosed != null) return _lockClosed!!
        _lockClosed = radixIcon(
            name = "LockClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.501 .978c1.074 0 1.968 .344 2.59 1.014 .616 .664 .909 1.587 .909 2.642v1.366h1c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-9c-.552 0-1-.448-1-1v-6c0-.552 .448-1 1-1h1v-1.364C4 3.581 4.293 2.657 4.91 1.993 5.532 1.323 6.427 .978 7.501 .978ZM3 13h9v-6h-9v6ZM7.501 1.978c-.855 0-1.461 .269-1.857 .695C5.243 3.105 5 3.76 5 4.636v1.364h5v-1.366C10 3.757 9.759 3.103 9.358 2.672 8.963 2.246 8.357 1.978 7.501 1.978Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _lockClosed!!
    }

private var _lockClosed: ImageVector? = null
