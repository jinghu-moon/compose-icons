package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberCircleTwo: ImageVector
    get() {
        if (_numberCircleTwo != null) return _numberCircleTwo!!
        _numberCircleTwo = phosphorThinIcon(
            name = "NumberCircleTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 150.360 120.850 L 112.000 172.000 L 152.000 172.000 C 154.209 172.000 156.000 173.791 156.000 176.000 C 156.000 178.209 154.209 180.000 152.000 180.000 L 104.000 180.000 C 102.485 180.000 101.100 179.144 100.422 177.789 C 99.745 176.434 99.891 174.812 100.800 173.600 L 144.000 116.000 C 150.627 107.163 148.837 94.627 140.000 88.000 C 131.163 81.373 118.627 83.163 112.000 92.000 C 110.769 93.632 109.794 95.443 109.110 97.370 C 108.375 99.455 106.090 100.550 104.005 99.815 C 101.920 99.080 100.825 96.795 101.560 94.710 C 102.505 92.015 103.853 89.480 105.560 87.190 C 111.533 79.068 121.410 74.784 131.422 75.973 C 141.433 77.163 150.032 83.643 153.935 92.938 C 157.837 102.234 156.441 112.910 150.280 120.890 Z"),
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
        return _numberCircleTwo!!
    }

private var _numberCircleTwo: ImageVector? = null
