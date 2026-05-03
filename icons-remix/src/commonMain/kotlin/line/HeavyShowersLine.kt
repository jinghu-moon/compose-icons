package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HeavyShowersLine: ImageVector
    get() {
        if (_heavyShowersLine != null) return _heavyShowersLine!!
        _heavyShowersLine = remixIcon(
            name = "HeavyShowersLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 16.930 C 2.609 15.547 1.000 12.961 1.000 10.000 C 1.000 5.582 4.582 2.000 9.000 2.000 C 12.395 2.000 15.296 4.115 16.458 7.099 C 16.795 7.034 17.144 7.000 17.500 7.000 C 20.538 7.000 23.000 9.462 23.000 12.500 C 23.000 15.018 21.309 17.140 19.000 17.793 L 19.000 15.663 C 20.183 15.101 21.000 13.896 21.000 12.500 C 21.000 10.567 19.433 9.000 17.500 9.000 C 16.521 9.000 15.635 9.402 15.000 10.051 C 15.000 10.034 15.000 10.017 15.000 10.000 C 15.000 6.686 12.314 4.000 9.000 4.000 C 5.686 4.000 3.000 6.686 3.000 10.000 C 3.000 11.777 3.773 13.374 5.000 14.472 L 5.000 16.930 ZM 7.000 14.000 L 9.000 14.000 L 9.000 20.000 L 7.000 20.000 L 7.000 14.000 ZM 15.000 14.000 L 17.000 14.000 L 17.000 20.000 L 15.000 20.000 L 15.000 14.000 ZM 11.000 17.000 L 13.000 17.000 L 13.000 23.000 L 11.000 23.000 L 11.000 17.000 Z"),
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
        return _heavyShowersLine!!
    }

private var _heavyShowersLine: ImageVector? = null
