package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.PinTop: ImageVector
    get() {
        if (_pinTop != null) return _pinTop!!
        _pinTop = radixIcon(
            name = "PinTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.252 4.124 C 7.402 4.025 7.598 4.025 7.748 4.124 L 7.819 4.182 L 11.069 7.432 C 11.244 7.608 11.244 7.893 11.069 8.069 C 10.893 8.244 10.608 8.244 10.432 8.069 L 7.950 5.587 L 7.950 13.500 C 7.950 13.749 7.749 13.950 7.500 13.950 C 7.252 13.950 7.050 13.749 7.050 13.500 L 7.050 5.587 L 4.569 8.069 L 4.498 8.126 C 4.324 8.242 4.086 8.222 3.932 8.069 C 3.778 7.915 3.759 7.677 3.874 7.502 L 3.932 7.432 L 7.182 4.182 L 7.252 4.124 ZM 13.500 1.050 C 13.749 1.050 13.950 1.252 13.950 1.500 C 13.950 1.749 13.749 1.950 13.500 1.950 L 1.500 1.950 C 1.252 1.950 1.050 1.749 1.050 1.500 C 1.050 1.252 1.252 1.050 1.500 1.050 L 13.500 1.050 Z"),
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
        return _pinTop!!
    }

private var _pinTop: ImageVector? = null
