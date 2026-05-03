package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShippingContainer: ImageVector
    get() {
        if (_shippingContainer != null) return _shippingContainer!!
        _shippingContainer = phosphorBoldIcon(
            name = "ShippingContainer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 237.500 66.800 L 131.300 36.460 C 129.675 35.998 127.972 35.882 126.300 36.120 L 21.170 51.120 C 11.332 52.570 4.032 60.996 4.000 70.940 L 4.000 185.060 C 4.042 194.997 11.339 203.412 21.170 204.860 L 126.300 219.860 C 126.863 219.940 127.431 219.980 128.000 219.980 C 129.116 219.981 130.227 219.826 131.300 219.520 L 237.500 189.200 C 246.055 186.722 251.957 178.907 252.000 170.000 L 252.000 86.000 C 251.960 77.092 246.057 69.275 237.500 66.800 ZM 92.000 116.000 L 84.000 116.000 L 84.000 66.410 L 116.000 61.840 L 116.000 194.160 L 84.000 189.590 L 84.000 140.000 L 92.000 140.000 C 98.627 140.000 104.000 134.627 104.000 128.000 C 104.000 121.373 98.627 116.000 92.000 116.000 ZM 28.000 74.410 L 60.000 69.840 L 60.000 116.000 L 52.000 116.000 C 45.373 116.000 40.000 121.373 40.000 128.000 C 40.000 134.627 45.373 140.000 52.000 140.000 L 60.000 140.000 L 60.000 186.160 L 28.000 181.590 ZM 228.000 167.000 L 140.000 192.140 L 140.000 63.910 L 228.000 89.050 Z"),
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
        return _shippingContainer!!
    }

private var _shippingContainer: ImageVector? = null
