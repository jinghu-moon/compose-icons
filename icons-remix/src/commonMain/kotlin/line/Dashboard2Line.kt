package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Dashboard2Line: ImageVector
    get() {
        if (_dashboard2Line != null) return _dashboard2Line!!
        _dashboard2Line = remixIcon(
            name = "Dashboard2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 ZM 12.000 5.000 C 13.018 5.000 13.985 5.217 14.858 5.608 L 13.295 7.169 C 12.882 7.059 12.448 7.000 12.000 7.000 C 9.239 7.000 7.000 9.239 7.000 12.000 C 7.000 13.381 7.560 14.631 8.464 15.535 L 7.050 16.950 L 6.894 16.789 C 5.720 15.537 5.000 13.852 5.000 12.000 C 5.000 8.134 8.134 5.000 12.000 5.000 ZM 18.392 9.143 C 18.783 10.016 19.000 10.982 19.000 12.000 C 19.000 13.933 18.216 15.683 16.950 16.950 L 15.535 15.535 C 16.440 14.631 17.000 13.381 17.000 12.000 C 17.000 11.552 16.941 11.118 16.831 10.705 L 18.392 9.143 ZM 16.243 6.343 L 17.657 7.757 L 13.932 11.483 C 13.976 11.648 14.000 11.821 14.000 12.000 C 14.000 13.105 13.105 14.000 12.000 14.000 C 10.895 14.000 10.000 13.105 10.000 12.000 C 10.000 10.895 10.895 10.000 12.000 10.000 C 12.179 10.000 12.352 10.024 12.517 10.068 L 16.243 6.343 Z"),
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
        return _dashboard2Line!!
    }

private var _dashboard2Line: ImageVector? = null
