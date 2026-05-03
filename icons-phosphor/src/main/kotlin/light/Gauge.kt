package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Gauge: ImageVector
    get() {
        if (_gauge != null) return _gauge!!
        _gauge = phosphorLightIcon(
            name = "Gauge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 205.650 74.080 C 185.077 53.465 157.124 41.917 128.000 42.000 L 127.610 42.000 C 67.170 42.210 18.000 92.060 18.000 153.130 L 18.000 176.000 C 18.000 183.732 24.268 190.000 32.000 190.000 L 224.000 190.000 C 231.732 190.000 238.000 183.732 238.000 176.000 L 238.000 152.000 C 238.080 122.744 226.427 94.677 205.650 74.080 ZM 226.000 176.000 C 226.000 177.105 225.105 178.000 224.000 178.000 L 115.780 178.000 L 172.850 99.530 C 174.713 96.851 174.094 93.174 171.455 91.253 C 168.816 89.333 165.127 89.873 163.150 92.470 L 100.940 178.000 L 32.000 178.000 C 30.895 178.000 30.000 177.105 30.000 176.000 L 30.000 153.130 C 30.004 149.411 30.211 145.696 30.620 142.000 L 56.000 142.000 C 59.314 142.000 62.000 139.314 62.000 136.000 C 62.000 132.686 59.314 130.000 56.000 130.000 L 32.710 130.000 C 42.600 88.400 78.530 56.860 122.000 54.190 L 122.000 80.000 C 122.000 83.314 124.686 86.000 128.000 86.000 C 131.314 86.000 134.000 83.314 134.000 80.000 L 134.000 54.190 C 177.337 56.850 213.763 87.695 223.530 130.000 L 200.000 130.000 C 196.686 130.000 194.000 132.686 194.000 136.000 C 194.000 139.314 196.686 142.000 200.000 142.000 L 225.500 142.000 C 225.830 145.300 226.000 148.640 226.000 152.000 Z"),
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
        return _gauge!!
    }

private var _gauge: ImageVector? = null
