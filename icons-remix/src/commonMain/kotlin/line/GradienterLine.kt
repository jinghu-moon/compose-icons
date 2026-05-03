package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GradienterLine: ImageVector
    get() {
        if (_gradienterLine != null) return _gradienterLine!!
        _gradienterLine = remixIcon(
            name = "GradienterLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.049 13.000 L 4.062 13.000 C 4.554 16.946 7.920 20.000 12.000 20.000 C 16.080 20.000 19.446 16.946 19.938 13.000 L 21.951 13.000 C 21.449 18.053 17.185 22.000 12.000 22.000 C 6.815 22.000 2.551 18.053 2.049 13.000 ZM 2.049 11.000 C 2.551 5.947 6.815 2.000 12.000 2.000 C 17.185 2.000 21.449 5.947 21.951 11.000 L 19.938 11.000 C 19.446 7.054 16.080 4.000 12.000 4.000 C 7.920 4.000 4.554 7.054 4.062 11.000 L 2.049 11.000 ZM 12.000 14.000 C 10.895 14.000 10.000 13.105 10.000 12.000 C 10.000 10.895 10.895 10.000 12.000 10.000 C 13.104 10.000 14.000 10.895 14.000 12.000 C 14.000 13.105 13.104 14.000 12.000 14.000 Z"),
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
        return _gradienterLine!!
    }

private var _gradienterLine: ImageVector? = null
