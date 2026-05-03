package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.PinLeft: ImageVector
    get() {
        if (_pinLeft != null) return _pinLeft!!
        _pinLeft = radixIcon(
            name = "PinLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.124 7.748 C 5.025 7.598 5.025 7.402 5.124 7.252 L 5.182 7.181 L 8.432 3.931 C 8.608 3.756 8.893 3.756 9.069 3.931 C 9.244 4.107 9.244 4.392 9.069 4.568 L 6.587 7.050 L 14.500 7.050 C 14.749 7.050 14.950 7.251 14.950 7.500 C 14.950 7.748 14.749 7.950 14.500 7.950 L 6.587 7.950 L 9.069 10.431 L 9.126 10.502 C 9.242 10.676 9.222 10.914 9.069 11.068 C 8.915 11.222 8.677 11.241 8.502 11.126 L 8.432 11.068 L 5.182 7.818 L 5.124 7.748 ZM 2.050 1.500 C 2.050 1.251 2.252 1.050 2.500 1.050 C 2.749 1.050 2.950 1.251 2.950 1.500 L 2.950 13.500 C 2.950 13.748 2.749 13.950 2.500 13.950 C 2.252 13.950 2.050 13.748 2.050 13.500 L 2.050 1.500 Z"),
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
        return _pinLeft!!
    }

private var _pinLeft: ImageVector? = null
