package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CreativeCommonsNcFill: ImageVector
    get() {
        if (_creativeCommonsNcFill != null) return _creativeCommonsNcFill!!
        _creativeCommonsNcFill = remixIcon(
            name = "CreativeCommonsNcFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.256 5.672 L 7.835 9.249 C 7.622 9.617 7.500 10.044 7.500 10.500 C 7.500 11.881 8.619 13.000 10.000 13.000 L 14.000 13.000 L 14.090 13.008 C 14.323 13.050 14.500 13.255 14.500 13.500 C 14.500 13.776 14.276 14.000 14.000 14.000 L 8.500 14.000 L 8.500 16.000 L 11.000 16.000 L 11.000 18.000 L 13.000 18.000 L 13.000 16.000 L 14.000 16.000 C 14.182 16.000 14.359 15.981 14.530 15.944 L 18.328 19.744 C 16.604 21.154 14.401 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 9.599 2.846 7.396 4.256 5.672 ZM 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 14.401 21.154 16.604 19.744 18.328 L 16.165 14.751 C 16.378 14.383 16.500 13.956 16.500 13.500 C 16.500 12.119 15.381 11.000 14.000 11.000 L 10.000 11.000 L 9.910 10.992 C 9.677 10.950 9.500 10.745 9.500 10.500 C 9.500 10.224 9.724 10.000 10.000 10.000 L 15.500 10.000 L 15.500 8.000 L 13.000 8.000 L 13.000 6.000 L 11.000 6.000 L 11.000 8.000 L 10.000 8.000 C 9.819 8.000 9.642 8.019 9.471 8.056 L 5.672 4.256 C 7.396 2.846 9.599 2.000 12.000 2.000 Z"),
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
        return _creativeCommonsNcFill!!
    }

private var _creativeCommonsNcFill: ImageVector? = null
