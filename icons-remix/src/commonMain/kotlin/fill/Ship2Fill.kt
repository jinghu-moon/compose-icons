package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Ship2Fill: ImageVector
    get() {
        if (_ship2Fill != null) return _ship2Fill!!
        _ship2Fill = remixIcon(
            name = "Ship2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 4.000 L 14.446 4.000 C 14.790 4.000 15.111 4.178 15.294 4.470 L 18.750 10.000 L 23.158 10.000 C 23.434 10.000 23.658 10.224 23.658 10.500 C 23.658 10.584 23.637 10.666 23.597 10.739 L 19.660 17.957 C 19.444 17.985 19.224 18.000 19.000 18.000 C 17.364 18.000 15.912 17.215 15.000 16.000 C 14.088 17.215 12.636 18.000 11.000 18.000 C 9.364 18.000 7.912 17.215 7.000 16.000 C 6.088 17.215 4.636 18.000 3.000 18.000 C 2.814 18.000 2.630 17.990 2.449 17.970 L 1.214 11.179 C 1.116 10.635 1.476 10.115 2.019 10.016 C 2.078 10.005 2.138 10.000 2.198 10.000 L 3.000 10.000 L 3.000 5.000 C 3.000 4.448 3.448 4.000 4.000 4.000 L 5.000 4.000 L 5.000 1.000 L 9.000 1.000 L 9.000 4.000 ZM 5.000 10.000 L 16.392 10.000 L 13.892 6.000 L 5.000 6.000 L 5.000 10.000 ZM 3.000 20.000 C 4.537 20.000 5.938 19.422 7.000 18.472 C 8.062 19.422 9.463 20.000 11.000 20.000 C 12.537 20.000 13.939 19.422 15.000 18.472 C 16.062 19.422 17.463 20.000 19.000 20.000 L 21.000 20.000 L 21.000 22.000 L 19.000 22.000 C 17.543 22.000 16.177 21.610 15.000 20.930 C 13.823 21.610 12.457 22.000 11.000 22.000 C 9.543 22.000 8.177 21.610 7.000 20.930 C 5.823 21.610 4.457 22.000 3.000 22.000 L 1.000 22.000 L 1.000 20.000 L 3.000 20.000 Z"),
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
        return _ship2Fill!!
    }

private var _ship2Fill: ImageVector? = null
