package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EmpathizeLine: ImageVector
    get() {
        if (_empathizeLine != null) return _empathizeLine!!
        _empathizeLine = remixIcon(
            name = "EmpathizeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.364 10.979 C 19.926 12.541 19.926 15.074 18.364 16.636 L 12.708 22.293 C 12.317 22.683 11.684 22.683 11.293 22.293 L 5.636 16.636 C 4.074 15.074 4.074 12.541 5.636 10.979 C 7.199 9.417 9.731 9.417 11.293 10.979 L 12.000 11.686 L 12.708 10.979 C 14.270 9.417 16.802 9.417 18.364 10.979 ZM 7.051 12.393 C 6.270 13.174 6.270 14.441 7.051 15.222 L 12.000 20.172 L 16.950 15.222 C 17.731 14.441 17.731 13.174 16.950 12.393 C 16.169 11.612 14.903 11.612 14.120 12.395 L 11.998 14.513 L 9.879 12.393 C 9.098 11.612 7.832 11.612 7.051 12.393 ZM 12.000 1.000 C 14.210 1.000 16.000 2.791 16.000 5.000 C 16.000 7.209 14.210 9.000 12.000 9.000 C 9.791 9.000 8.000 7.209 8.000 5.000 C 8.000 2.791 9.791 1.000 12.000 1.000 ZM 12.000 3.000 C 10.896 3.000 10.000 3.895 10.000 5.000 C 10.000 6.105 10.896 7.000 12.000 7.000 C 13.105 7.000 14.000 6.105 14.000 5.000 C 14.000 3.895 13.105 3.000 12.000 3.000 Z"),
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
        return _empathizeLine!!
    }

private var _empathizeLine: ImageVector? = null
