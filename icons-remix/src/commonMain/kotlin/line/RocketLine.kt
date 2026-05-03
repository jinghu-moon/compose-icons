package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RocketLine: ImageVector
    get() {
        if (_rocketLine != null) return _rocketLine!!
        _rocketLine = remixIcon(
            name = "RocketLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 13.000 C 5.000 7.912 7.902 3.564 12.000 1.818 C 16.097 3.564 19.000 7.912 19.000 13.000 C 19.000 13.823 18.924 14.626 18.779 15.403 L 20.719 17.235 C 20.885 17.391 20.924 17.639 20.815 17.838 L 18.320 22.413 C 18.187 22.656 17.884 22.745 17.641 22.613 C 17.599 22.590 17.561 22.561 17.527 22.527 L 15.292 20.293 C 15.105 20.105 14.851 20.000 14.585 20.000 L 9.414 20.000 C 9.149 20.000 8.894 20.105 8.707 20.293 L 6.472 22.527 C 6.277 22.723 5.960 22.723 5.765 22.527 C 5.731 22.494 5.702 22.455 5.680 22.413 L 3.184 17.838 C 3.075 17.639 3.115 17.391 3.280 17.235 L 5.220 15.403 C 5.076 14.626 5.000 13.823 5.000 13.000 ZM 6.475 19.696 L 7.292 18.879 C 7.855 18.316 8.618 18.000 9.414 18.000 L 14.585 18.000 C 15.381 18.000 16.144 18.316 16.707 18.879 L 17.524 19.696 L 18.506 17.896 L 17.406 16.857 C 16.912 16.390 16.688 15.705 16.813 15.036 C 16.937 14.372 17.000 13.691 17.000 13.000 C 17.000 9.130 15.005 5.700 12.000 4.040 C 8.995 5.700 7.000 9.130 7.000 13.000 C 7.000 13.691 7.063 14.372 7.186 15.036 C 7.311 15.705 7.087 16.390 6.593 16.857 L 5.494 17.896 L 6.475 19.696 ZM 12.000 13.000 C 10.895 13.000 10.000 12.104 10.000 11.000 C 10.000 9.895 10.895 9.000 12.000 9.000 C 13.104 9.000 14.000 9.895 14.000 11.000 C 14.000 12.104 13.104 13.000 12.000 13.000 Z"),
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
        return _rocketLine!!
    }

private var _rocketLine: ImageVector? = null
