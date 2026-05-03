package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LightningBolt: ImageVector
    get() {
        if (_lightningBolt != null) return _lightningBolt!!
        _lightningBolt = radixIcon(
            name = "LightningBolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.156 0.137 C 8.299 0.002 8.511 -0.039 8.696 0.040 C 8.908 0.131 9.031 0.355 8.993 0.582 L 8.090 6.000 L 12.500 6.000 C 12.689 6.000 12.863 6.107 12.947 6.276 C 13.032 6.446 13.014 6.648 12.900 6.800 L 6.900 14.800 C 6.762 14.984 6.516 15.050 6.304 14.960 C 6.092 14.869 5.969 14.645 6.007 14.418 L 6.910 9.000 L 2.500 9.000 C 2.311 9.000 2.137 8.893 2.053 8.724 C 1.968 8.554 1.986 8.352 2.100 8.200 L 8.100 0.200 L 8.156 0.137 ZM 3.500 8.000 L 7.500 8.000 C 7.647 8.000 7.787 8.065 7.882 8.177 C 7.977 8.289 8.017 8.437 7.993 8.582 L 7.330 12.559 L 11.500 7.000 L 7.500 7.000 C 7.353 7.000 7.213 6.935 7.118 6.823 C 7.023 6.711 6.983 6.563 7.007 6.418 L 7.669 2.441 L 3.500 8.000 Z"),
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
        return _lightningBolt!!
    }

private var _lightningBolt: ImageVector? = null
