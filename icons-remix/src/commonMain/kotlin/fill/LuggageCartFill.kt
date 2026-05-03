package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LuggageCartFill: ImageVector
    get() {
        if (_luggageCartFill != null) return _luggageCartFill!!
        _luggageCartFill = remixIcon(
            name = "LuggageCartFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.500 20.000 C 6.329 20.000 7.000 20.671 7.000 21.500 C 7.000 22.328 6.329 23.000 5.500 23.000 C 4.672 23.000 4.000 22.328 4.000 21.500 C 4.000 20.671 4.672 20.000 5.500 20.000 ZM 18.500 20.000 C 19.329 20.000 20.000 20.671 20.000 21.500 C 20.000 22.328 19.329 23.000 18.500 23.000 C 17.672 23.000 17.000 22.328 17.000 21.500 C 17.000 20.671 17.672 20.000 18.500 20.000 ZM 2.172 1.757 L 6.000 5.585 L 6.000 16.999 L 20.000 17.000 L 20.000 19.000 L 5.000 19.000 C 4.448 19.000 4.000 18.552 4.000 18.000 L 4.000 6.413 L 0.758 3.172 L 2.172 1.757 ZM 16.000 3.000 C 16.553 3.000 17.000 3.448 17.000 4.000 L 17.000 5.999 L 19.994 6.000 C 20.550 6.000 21.000 6.456 21.000 6.995 L 21.000 15.005 C 21.000 15.554 20.551 16.000 19.994 16.000 L 8.007 16.000 C 7.451 16.000 7.000 15.544 7.000 15.005 L 7.000 6.995 C 7.000 6.446 7.450 6.000 8.007 6.000 L 11.000 5.999 L 11.000 4.000 C 11.000 3.448 11.448 3.000 12.000 3.000 L 16.000 3.000 ZM 11.000 8.000 L 10.000 8.000 L 10.000 14.000 L 11.000 14.000 L 11.000 8.000 ZM 18.000 8.000 L 17.000 8.000 L 17.000 14.000 L 18.000 14.000 L 18.000 8.000 ZM 15.000 5.000 L 13.000 5.000 L 13.000 6.000 L 15.000 6.000 L 15.000 5.000 Z"),
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
        return _luggageCartFill!!
    }

private var _luggageCartFill: ImageVector? = null
