package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.PinRight: ImageVector
    get() {
        if (_pinRight != null) return _pinRight!!
        _pinRight = radixIcon(
            name = "PinRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.876 7.252 C 9.975 7.402 9.975 7.598 9.876 7.748 L 9.818 7.819 L 6.568 11.069 C 6.392 11.244 6.107 11.244 5.931 11.069 C 5.756 10.893 5.756 10.608 5.931 10.432 L 8.413 7.950 L 0.500 7.950 C 0.251 7.950 0.050 7.749 0.050 7.500 C 0.050 7.252 0.251 7.050 0.500 7.050 L 8.413 7.050 L 5.931 4.569 L 5.874 4.498 C 5.758 4.324 5.778 4.086 5.931 3.932 C 6.085 3.778 6.323 3.759 6.498 3.874 L 6.568 3.932 L 9.818 7.182 L 9.876 7.252 ZM 12.950 13.500 C 12.950 13.749 12.748 13.950 12.500 13.950 C 12.251 13.950 12.050 13.749 12.050 13.500 L 12.050 1.500 C 12.050 1.252 12.251 1.050 12.500 1.050 C 12.748 1.050 12.950 1.252 12.950 1.500 L 12.950 13.500 Z"),
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
        return _pinRight!!
    }

private var _pinRight: ImageVector? = null
