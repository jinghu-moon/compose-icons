package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Funnel: ImageVector
    get() {
        if (_funnel != null) return _funnel!!
        _funnel = phosphorBoldIcon(
            name = "Funnel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 234.290 47.910 C 231.088 40.670 223.917 36.000 216.000 36.000 L 40.000 36.000 C 32.085 36.001 24.915 40.669 21.712 47.908 C 18.510 55.146 19.877 63.592 25.200 69.450 L 25.320 69.590 L 92.000 140.750 L 92.000 216.000 C 91.999 223.378 96.060 230.157 102.565 233.637 C 109.070 237.118 116.963 236.735 123.100 232.640 L 155.100 211.310 C 160.664 207.598 164.004 201.349 164.000 194.660 L 164.000 140.750 L 230.670 69.590 L 230.790 69.450 C 236.116 63.595 237.488 55.150 234.290 47.910 ZM 143.290 127.800 C 141.190 130.015 140.014 132.948 140.000 136.000 L 140.000 192.520 L 116.000 208.520 L 116.000 136.000 C 115.997 132.953 114.835 130.022 112.750 127.800 L 49.230 60.000 L 206.770 60.000 Z"),
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
        return _funnel!!
    }

private var _funnel: ImageVector? = null
