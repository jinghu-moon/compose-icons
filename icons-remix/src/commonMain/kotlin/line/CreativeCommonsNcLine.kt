package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CreativeCommonsNcLine: ImageVector
    get() {
        if (_creativeCommonsNcLine != null) return _creativeCommonsNcLine!!
        _creativeCommonsNcLine = remixIcon(
            name = "CreativeCommonsNcLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 C 2.000 17.523 6.477 22.000 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 C 22.000 6.477 17.523 2.000 12.000 2.000 ZM 7.094 5.680 C 8.449 4.627 10.151 4.000 12.000 4.000 C 16.418 4.000 20.000 7.582 20.000 12.000 C 20.000 13.849 19.373 15.551 18.320 16.906 L 16.165 14.751 C 16.378 14.383 16.500 13.956 16.500 13.500 C 16.500 12.119 15.381 11.000 14.000 11.000 L 10.000 11.000 C 9.724 11.000 9.500 10.776 9.500 10.500 C 9.500 10.224 9.724 10.000 10.000 10.000 L 15.500 10.000 L 15.500 8.000 L 13.000 8.000 L 13.000 6.000 L 11.000 6.000 L 11.000 8.000 L 10.000 8.000 C 9.818 8.000 9.641 8.019 9.470 8.056 L 7.094 5.680 ZM 5.680 7.094 L 7.835 9.249 C 7.622 9.617 7.500 10.044 7.500 10.500 C 7.500 11.881 8.619 13.000 10.000 13.000 L 14.000 13.000 C 14.276 13.000 14.500 13.224 14.500 13.500 C 14.500 13.776 14.276 14.000 14.000 14.000 L 8.500 14.000 L 8.500 16.000 L 11.000 16.000 L 11.000 18.000 L 13.000 18.000 L 13.000 16.000 L 14.000 16.000 C 14.182 16.000 14.359 15.981 14.530 15.944 L 16.906 18.320 C 15.551 19.373 13.849 20.000 12.000 20.000 C 7.582 20.000 4.000 16.418 4.000 12.000 C 4.000 10.151 4.627 8.449 5.680 7.094 Z"),
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
        return _creativeCommonsNcLine!!
    }

private var _creativeCommonsNcLine: ImageVector? = null
