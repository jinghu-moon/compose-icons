package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RefreshLine: ImageVector
    get() {
        if (_refreshLine != null) return _refreshLine!!
        _refreshLine = remixIcon(
            name = "RefreshLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.463 4.433 C 7.216 2.917 9.501 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 14.136 21.330 16.116 20.189 17.741 L 17.000 12.000 L 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 C 9.850 4.000 7.898 4.848 6.460 6.228 L 5.463 4.433 ZM 18.537 19.567 C 16.784 21.083 14.499 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 9.864 2.670 7.884 3.811 6.259 L 7.000 12.000 L 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 14.150 20.000 16.102 19.152 17.540 17.772 L 18.537 19.567 Z"),
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
        return _refreshLine!!
    }

private var _refreshLine: ImageVector? = null
