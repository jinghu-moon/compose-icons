package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MoonFoggyLine: ImageVector
    get() {
        if (_moonFoggyLine != null) return _moonFoggyLine!!
        _moonFoggyLine = remixIcon(
            name = "MoonFoggyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 20.334 L 16.000 18.135 C 17.699 17.237 19.012 15.705 19.623 13.854 C 19.093 13.950 18.550 14.000 18.000 14.000 C 13.029 14.000 9.000 9.971 9.000 5.000 C 9.000 4.954 9.000 4.909 9.001 4.863 C 7.041 5.899 5.603 7.776 5.150 10.000 L 3.118 10.000 C 3.794 5.738 7.304 2.420 11.656 2.037 C 11.235 2.937 11.000 3.941 11.000 5.000 C 11.000 8.866 14.134 12.000 18.000 12.000 C 19.475 12.000 20.844 11.544 21.972 10.765 C 21.990 11.007 22.000 11.253 22.000 11.500 C 22.000 15.511 19.515 18.941 16.000 20.334 ZM 7.000 20.000 L 14.000 20.000 L 14.000 22.000 L 7.000 22.000 L 7.000 20.000 ZM 4.000 12.000 L 10.000 12.000 L 10.000 14.000 L 4.000 14.000 L 4.000 12.000 ZM 2.000 16.000 L 12.000 16.000 L 12.000 18.000 L 2.000 18.000 L 2.000 16.000 Z"),
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
        return _moonFoggyLine!!
    }

private var _moonFoggyLine: ImageVector? = null
