package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.PinBottom: ImageVector
    get() {
        if (_pinBottom != null) return _pinBottom!!
        _pinBottom = radixIcon(
            name = "PinBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.748 10.876 C 7.598 10.975 7.402 10.975 7.252 10.876 L 7.181 10.818 L 3.931 7.568 C 3.756 7.392 3.756 7.107 3.931 6.931 C 4.107 6.756 4.392 6.756 4.568 6.931 L 7.050 9.413 L 7.050 1.500 C 7.050 1.251 7.251 1.050 7.500 1.050 C 7.748 1.050 7.950 1.251 7.950 1.500 L 7.950 9.413 L 10.431 6.931 L 10.502 6.874 C 10.676 6.758 10.914 6.778 11.068 6.931 C 11.222 7.085 11.241 7.323 11.126 7.498 L 11.068 7.568 L 7.818 10.818 L 7.748 10.876 ZM 1.500 13.950 C 1.251 13.950 1.050 13.748 1.050 13.500 C 1.050 13.251 1.251 13.050 1.500 13.050 L 13.500 13.050 C 13.748 13.050 13.950 13.251 13.950 13.500 C 13.950 13.748 13.748 13.950 13.500 13.950 L 1.500 13.950 Z"),
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
        return _pinBottom!!
    }

private var _pinBottom: ImageVector? = null
