package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FloodFill: ImageVector
    get() {
        if (_floodFill != null) return _floodFill!!
        _floodFill = remixIcon(
            name = "FloodFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 17.472 C 17.062 18.422 18.463 19.000 20.000 19.000 L 22.000 19.000 L 22.000 21.000 L 20.000 21.000 C 18.543 21.000 17.177 20.610 16.000 19.930 C 14.824 20.610 13.458 21.000 12.000 21.000 C 10.543 21.000 9.177 20.610 8.000 19.930 C 6.824 20.610 5.458 21.000 4.000 21.000 L 2.000 21.000 L 2.000 19.000 L 4.000 19.000 C 5.537 19.000 6.939 18.422 8.000 17.472 C 9.062 18.422 10.463 19.000 12.000 19.000 C 13.537 19.000 14.939 18.422 16.000 17.472 ZM 12.573 1.532 L 12.673 1.612 L 23.000 11.000 L 20.000 11.000 L 20.000 17.000 C 18.364 17.000 16.912 16.215 16.000 15.000 C 15.088 16.215 13.636 17.000 12.000 17.000 C 10.364 17.000 8.912 16.215 8.000 15.000 C 7.088 16.215 5.636 17.000 4.000 17.000 L 3.999 10.999 L 1.000 11.000 L 11.327 1.612 C 11.645 1.323 12.103 1.274 12.467 1.467 L 12.573 1.532 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _floodFill!!
    }

private var _floodFill: ImageVector? = null
