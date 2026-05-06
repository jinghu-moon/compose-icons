package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Message2: ImageVector
    get() {
        if (_message2 != null) return _message2!!
        _message2 = tablerFilledIcon(
            name = "Message2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 3c2.209 0 4 1.791 4 4v8c0 2.209-1.791 4-4 4h-2.586l-2.707 2.707c-.356 .356-.922 .392-1.32 .083l-.094-.083L8.585 19h-2.585C3.869 19 2.112 17.329 2.005 15.2L2 15v-8C2 4.791 3.791 3 6 3ZM14 12h-6c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h6c.552 0 1-.448 1-1 0-.552-.448-1-1-1M16 8h-8C7.448 8 7 8.448 7 9c0 .552 .448 1 1 1h8c.552 0 1-.448 1-1C17 8.448 16.552 8 16 8"),
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
        return _message2!!
    }

private var _message2: ImageVector? = null
