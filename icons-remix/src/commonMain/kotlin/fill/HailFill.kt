package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HailFill: ImageVector
    get() {
        if (_hailFill != null) return _hailFill!!
        _hailFill = remixIcon(
            name = "HailFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.995 17.794 C 18.888 15.681 17.140 14.000 15.000 14.000 C 14.622 14.000 14.256 14.052 13.910 14.150 C 13.520 12.349 11.918 11.000 10.000 11.000 C 7.791 11.000 6.000 12.791 6.000 15.000 C 6.000 16.079 6.428 17.059 7.122 17.778 C 3.610 16.934 1.000 13.772 1.000 10.000 C 1.000 5.582 4.582 2.000 9.000 2.000 C 12.395 2.000 15.296 4.115 16.458 7.099 C 16.795 7.034 17.144 7.000 17.500 7.000 C 20.538 7.000 23.000 9.462 23.000 12.500 C 23.000 15.019 21.306 17.143 18.995 17.794 ZM 10.000 17.000 C 8.895 17.000 8.000 16.105 8.000 15.000 C 8.000 13.895 8.895 13.000 10.000 13.000 C 11.105 13.000 12.000 13.895 12.000 15.000 C 12.000 16.105 11.105 17.000 10.000 17.000 ZM 15.000 20.000 C 13.895 20.000 13.000 19.105 13.000 18.000 C 13.000 16.895 13.895 16.000 15.000 16.000 C 16.105 16.000 17.000 16.895 17.000 18.000 C 17.000 19.105 16.105 20.000 15.000 20.000 ZM 10.000 23.000 C 8.895 23.000 8.000 22.105 8.000 21.000 C 8.000 19.895 8.895 19.000 10.000 19.000 C 11.105 19.000 12.000 19.895 12.000 21.000 C 12.000 22.105 11.105 23.000 10.000 23.000 Z"),
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
        return _hailFill!!
    }

private var _hailFill: ImageVector? = null
