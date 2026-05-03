package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EdgeFill: ImageVector
    get() {
        if (_edgeFill != null) return _edgeFill!!
        _edgeFill = remixIcon(
            name = "EdgeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.645 8.586 C 20.475 7.875 20.204 7.138 19.871 6.565 C 19.100 5.236 18.407 4.328 16.694 3.245 C 14.981 2.162 13.077 2.000 12.171 2.000 C 9.756 2.000 7.960 2.860 6.646 3.887 C 3.345 6.470 3.001 11.000 3.001 11.000 C 3.001 11.000 4.222 8.955 6.541 7.474 C 7.944 6.579 9.942 6.000 11.569 6.000 C 15.886 6.000 16.001 10.000 16.001 10.000 L 9.001 10.000 C 9.001 8.000 10.001 7.000 10.001 7.000 C 10.001 7.000 5.001 9.000 5.001 14.044 C 5.001 14.531 4.998 15.416 5.249 16.327 C 5.481 17.170 5.949 18.032 6.381 18.680 C 7.602 20.512 9.426 21.294 10.297 21.584 C 11.293 21.916 12.326 22.000 13.307 22.000 C 16.027 22.000 18.184 21.114 19.001 20.725 L 19.001 16.553 C 18.243 17.007 16.322 18.000 14.001 18.000 C 9.001 18.000 9.001 14.000 9.001 14.000 L 21.001 14.000 L 21.001 11.510 C 21.001 11.510 20.962 9.917 20.645 8.586 Z"),
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
        return _edgeFill!!
    }

private var _edgeFill: ImageVector? = null
