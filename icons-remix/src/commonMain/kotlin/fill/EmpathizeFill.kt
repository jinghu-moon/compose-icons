package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EmpathizeFill: ImageVector
    get() {
        if (_empathizeFill != null) return _empathizeFill!!
        _empathizeFill = remixIcon(
            name = "EmpathizeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.364 10.979 C 19.926 12.541 19.926 15.074 18.364 16.636 L 12.708 22.293 C 12.317 22.683 11.684 22.683 11.293 22.293 L 5.636 16.636 C 4.074 15.074 4.074 12.541 5.636 10.979 C 7.199 9.417 9.731 9.417 11.293 10.979 L 12.000 11.686 L 12.708 10.979 C 14.270 9.417 16.802 9.417 18.364 10.979 ZM 12.000 1.000 C 14.210 1.000 16.000 2.791 16.000 5.000 C 16.000 7.209 14.210 9.000 12.000 9.000 C 9.791 9.000 8.000 7.209 8.000 5.000 C 8.000 2.791 9.791 1.000 12.000 1.000 Z"),
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
        return _empathizeFill!!
    }

private var _empathizeFill: ImageVector? = null
