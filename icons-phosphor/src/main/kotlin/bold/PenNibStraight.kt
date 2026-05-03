package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PenNibStraight: ImageVector
    get() {
        if (_penNibStraight != null) return _penNibStraight!!
        _penNibStraight = phosphorBoldIcon(
            name = "PenNibStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 225.920 122.110 C 225.820 121.920 225.730 121.740 225.620 121.550 L 196.000 68.850 L 196.000 32.000 C 196.000 20.954 187.046 12.000 176.000 12.000 L 80.000 12.000 C 68.954 12.000 60.000 20.954 60.000 32.000 L 60.000 68.870 L 30.380 121.550 C 30.268 121.734 30.168 121.924 30.080 122.120 C 26.746 128.818 27.453 136.820 31.910 142.830 C 32.000 142.960 32.090 143.080 32.190 143.200 L 118.630 251.490 C 120.907 254.340 124.357 255.999 128.005 255.999 C 131.653 255.999 135.103 254.340 137.380 251.490 L 223.810 143.200 C 223.910 143.080 224.000 142.960 224.090 142.830 C 228.546 136.816 229.253 128.812 225.920 122.110 ZM 172.000 36.000 L 172.000 60.000 L 84.000 60.000 L 84.000 36.000 ZM 128.000 144.000 C 122.477 144.000 118.000 139.523 118.000 134.000 C 118.000 128.477 122.477 124.000 128.000 124.000 C 133.523 124.000 138.000 128.477 138.000 134.000 C 138.000 139.523 133.523 144.000 128.000 144.000 ZM 140.000 209.740 L 140.000 165.810 C 155.368 160.013 164.395 144.058 161.449 127.899 C 158.502 111.740 144.425 99.998 128.000 99.998 C 111.575 99.998 97.498 111.740 94.551 127.899 C 91.605 144.058 100.632 160.013 116.000 165.810 L 116.000 209.730 L 52.830 130.590 L 79.000 84.000 L 177.000 84.000 L 203.190 130.590 Z"),
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
        return _penNibStraight!!
    }

private var _penNibStraight: ImageVector? = null
