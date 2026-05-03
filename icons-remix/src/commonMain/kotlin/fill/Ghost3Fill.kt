package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Ghost3Fill: ImageVector
    get() {
        if (_ghost3Fill != null) return _ghost3Fill!!
        _ghost3Fill = remixIcon(
            name = "Ghost3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 16.971 2.000 21.000 6.029 21.000 11.000 L 21.000 19.000 C 21.000 19.265 20.895 19.520 20.707 19.707 L 18.707 21.707 C 18.370 22.044 17.842 22.096 17.445 21.832 L 15.000 20.201 L 12.555 21.832 C 12.219 22.056 11.781 22.056 11.445 21.832 L 9.000 20.201 L 6.555 21.832 C 6.158 22.096 5.630 22.044 5.293 21.707 L 3.293 19.707 C 3.105 19.520 3.000 19.265 3.000 19.000 L 3.000 11.000 C 3.000 6.029 7.029 2.000 12.000 2.000 ZM 9.500 8.000 C 8.672 8.000 8.000 8.672 8.000 9.500 C 8.000 10.328 8.672 11.000 9.500 11.000 C 10.328 11.000 11.000 10.328 11.000 9.500 C 11.000 8.672 10.328 8.000 9.500 8.000 ZM 14.500 8.000 C 13.672 8.000 13.000 8.672 13.000 9.500 C 13.000 10.328 13.672 11.000 14.500 11.000 C 15.328 11.000 16.000 10.328 16.000 9.500 C 16.000 8.672 15.328 8.000 14.500 8.000 Z"),
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
        return _ghost3Fill!!
    }

private var _ghost3Fill: ImageVector? = null
