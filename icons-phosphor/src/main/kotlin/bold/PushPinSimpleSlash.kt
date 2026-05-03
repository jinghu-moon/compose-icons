package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PushPinSimpleSlash: ImageVector
    get() {
        if (_pushPinSimpleSlash != null) return _pushPinSimpleSlash!!
        _pushPinSimpleSlash = phosphorBoldIcon(
            name = "PushPinSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.880 207.930 L 56.880 31.930 C 54.012 28.697 49.628 27.256 45.401 28.157 C 41.175 29.058 37.759 32.162 36.459 36.284 C 35.159 40.405 36.175 44.907 39.120 48.070 L 62.000 73.190 L 45.930 164.000 L 40.000 164.000 C 33.373 164.000 28.000 169.373 28.000 176.000 C 28.000 182.627 33.373 188.000 40.000 188.000 L 116.000 188.000 L 116.000 240.000 C 116.000 246.627 121.373 252.000 128.000 252.000 C 134.627 252.000 140.000 246.627 140.000 240.000 L 140.000 188.000 L 166.330 188.000 L 199.120 224.070 C 203.598 228.880 211.111 229.194 215.974 224.774 C 220.837 220.355 221.241 212.846 216.880 207.930 ZM 70.300 164.000 L 82.370 95.640 L 144.510 164.000 ZM 90.060 40.000 C 90.060 33.373 95.433 28.000 102.060 28.000 L 192.000 28.000 C 198.627 28.000 204.000 33.373 204.000 40.000 C 204.000 46.627 198.627 52.000 192.000 52.000 L 190.300 52.000 L 205.630 138.840 C 206.185 141.975 205.472 145.202 203.647 147.811 C 201.822 150.420 199.035 152.197 195.900 152.750 C 195.206 152.869 194.504 152.929 193.800 152.930 C 187.979 152.920 183.004 148.734 182.000 143.000 L 165.930 52.000 L 102.060 52.000 C 95.433 52.000 90.060 46.627 90.060 40.000 Z"),
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
        return _pushPinSimpleSlash!!
    }

private var _pushPinSimpleSlash: ImageVector? = null
