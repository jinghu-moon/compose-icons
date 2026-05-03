package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RemixLine: ImageVector
    get() {
        if (_remixLine != null) return _remixLine!!
        _remixLine = remixIcon(
            name = "RemixLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.512 2.000 21.982 6.460 21.999 11.968 C 21.999 11.975 21.999 11.981 21.999 11.988 C 21.999 11.992 22.000 11.996 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 4.000 C 10.075 4.000 8.309 4.680 6.929 5.812 C 7.584 5.610 8.280 5.500 9.000 5.500 C 12.866 5.500 16.000 8.634 16.000 12.500 C 16.000 13.052 15.552 13.500 15.000 13.500 C 14.448 13.500 14.000 13.052 14.000 12.500 C 14.000 9.739 11.761 7.500 9.000 7.500 C 6.389 7.500 4.231 9.501 4.001 12.043 C 4.024 16.441 7.596 20.000 12.000 20.000 C 13.925 20.000 15.690 19.319 17.070 18.187 C 16.415 18.389 15.720 18.500 15.000 18.500 C 11.134 18.500 8.000 15.366 8.000 11.500 C 8.000 10.948 8.448 10.500 9.000 10.500 C 9.552 10.500 10.000 10.948 10.000 11.500 C 10.000 14.261 12.239 16.500 15.000 16.500 C 17.612 16.500 19.768 14.499 19.998 11.956 C 19.974 7.558 16.404 4.000 12.000 4.000 Z"),
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
        return _remixLine!!
    }

private var _remixLine: ImageVector? = null
