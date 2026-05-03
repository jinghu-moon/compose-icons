package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BearSmileFill: ImageVector
    get() {
        if (_bearSmileFill != null) return _bearSmileFill!!
        _bearSmileFill = remixIcon(
            name = "BearSmileFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.500 2.000 C 19.985 2.000 22.000 4.015 22.000 6.500 C 22.000 7.856 21.400 9.072 20.451 9.897 C 20.806 10.864 21.000 11.910 21.000 13.000 C 21.000 17.971 16.971 22.000 12.000 22.000 C 7.029 22.000 3.000 17.971 3.000 13.000 C 3.000 11.910 3.194 10.864 3.549 9.897 C 2.600 9.072 2.000 7.856 2.000 6.500 C 2.000 4.015 4.015 2.000 6.500 2.000 C 8.126 2.000 9.550 2.862 10.341 4.154 C 10.877 4.053 11.433 4.000 12.000 4.000 C 12.567 4.000 13.123 4.053 13.661 4.153 C 14.450 2.862 15.875 2.000 17.500 2.000 ZM 10.000 13.000 L 8.000 13.000 C 8.000 15.209 9.791 17.000 12.000 17.000 C 14.209 17.000 16.000 15.209 16.000 13.000 L 14.000 13.000 C 14.000 14.105 13.105 15.000 12.000 15.000 C 10.895 15.000 10.000 14.105 10.000 13.000 Z"),
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
        return _bearSmileFill!!
    }

private var _bearSmileFill: ImageVector? = null
