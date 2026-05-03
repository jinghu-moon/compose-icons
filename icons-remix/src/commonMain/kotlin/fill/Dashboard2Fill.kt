package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Dashboard2Fill: ImageVector
    get() {
        if (_dashboard2Fill != null) return _dashboard2Fill!!
        _dashboard2Fill = remixIcon(
            name = "Dashboard2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 5.000 C 8.134 5.000 5.000 8.134 5.000 12.000 C 5.000 13.852 5.720 15.537 6.894 16.789 L 7.050 16.950 L 8.464 15.535 C 7.560 14.631 7.000 13.381 7.000 12.000 C 7.000 9.239 9.239 7.000 12.000 7.000 C 12.448 7.000 12.882 7.059 13.295 7.169 L 14.858 5.608 C 13.985 5.217 13.018 5.000 12.000 5.000 ZM 18.392 9.143 L 16.831 10.705 C 16.941 11.118 17.000 11.552 17.000 12.000 C 17.000 13.381 16.440 14.631 15.535 15.535 L 16.950 16.950 C 18.216 15.683 19.000 13.933 19.000 12.000 C 19.000 10.982 18.783 10.016 18.392 9.143 ZM 16.243 6.343 L 12.517 10.068 C 12.352 10.024 12.179 10.000 12.000 10.000 C 10.895 10.000 10.000 10.895 10.000 12.000 C 10.000 13.105 10.895 14.000 12.000 14.000 C 13.105 14.000 14.000 13.105 14.000 12.000 C 14.000 11.821 13.976 11.648 13.932 11.483 L 17.657 7.757 L 16.243 6.343 Z"),
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
        return _dashboard2Fill!!
    }

private var _dashboard2Fill: ImageVector? = null
