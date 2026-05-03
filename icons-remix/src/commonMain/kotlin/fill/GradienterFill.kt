package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GradienterFill: ImageVector
    get() {
        if (_gradienterFill != null) return _gradienterFill!!
        _gradienterFill = remixIcon(
            name = "GradienterFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 ZM 8.126 11.000 L 4.062 11.000 C 4.021 11.328 4.000 11.661 4.000 12.000 C 4.000 12.339 4.021 12.672 4.062 13.000 L 8.126 13.000 C 8.044 12.680 8.000 12.345 8.000 12.000 C 8.000 11.655 8.044 11.320 8.126 11.000 ZM 15.874 11.000 C 15.956 11.320 16.000 11.655 16.000 12.000 C 16.000 12.345 15.956 12.680 15.874 13.000 L 19.938 13.000 C 19.979 12.672 20.000 12.339 20.000 12.000 C 20.000 11.661 19.979 11.328 19.938 11.000 L 15.874 11.000 ZM 12.000 14.000 C 13.105 14.000 14.000 13.105 14.000 12.000 C 14.000 10.895 13.105 10.000 12.000 10.000 C 10.895 10.000 10.000 10.895 10.000 12.000 C 10.000 13.105 10.895 14.000 12.000 14.000 Z"),
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
        return _gradienterFill!!
    }

private var _gradienterFill: ImageVector? = null
