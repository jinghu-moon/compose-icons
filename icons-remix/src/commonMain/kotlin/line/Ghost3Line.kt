package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Ghost3Line: ImageVector
    get() {
        if (_ghost3Line != null) return _ghost3Line!!
        _ghost3Line = remixIcon(
            name = "Ghost3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 16.971 2.000 21.000 6.029 21.000 11.000 L 21.000 19.000 C 21.000 19.265 20.895 19.520 20.707 19.707 L 18.707 21.707 C 18.370 22.044 17.842 22.096 17.445 21.832 L 15.000 20.201 L 12.555 21.832 C 12.219 22.056 11.781 22.056 11.445 21.832 L 9.000 20.201 L 6.555 21.832 C 6.158 22.096 5.630 22.044 5.293 21.707 L 3.293 19.707 C 3.105 19.520 3.000 19.265 3.000 19.000 L 3.000 11.000 C 3.000 6.029 7.029 2.000 12.000 2.000 ZM 12.000 4.000 C 8.134 4.000 5.000 7.134 5.000 11.000 L 5.000 18.586 L 6.127 19.713 L 8.445 18.168 L 8.575 18.095 C 8.889 17.948 9.261 17.972 9.555 18.168 L 12.000 19.798 L 14.445 18.168 L 14.575 18.095 C 14.889 17.948 15.261 17.972 15.555 18.168 L 17.872 19.713 L 19.000 18.586 L 19.000 11.000 C 19.000 7.134 15.866 4.000 12.000 4.000 ZM 9.500 8.000 C 10.328 8.000 11.000 8.672 11.000 9.500 C 11.000 10.328 10.328 11.000 9.500 11.000 C 8.672 11.000 8.000 10.328 8.000 9.500 C 8.000 8.672 8.672 8.000 9.500 8.000 ZM 14.500 8.000 C 15.328 8.000 16.000 8.672 16.000 9.500 C 16.000 10.328 15.328 11.000 14.500 11.000 C 13.672 11.000 13.000 10.328 13.000 9.500 C 13.000 8.672 13.672 8.000 14.500 8.000 Z"),
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
        return _ghost3Line!!
    }

private var _ghost3Line: ImageVector? = null
