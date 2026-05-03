package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSquareTwo: ImageVector
    get() {
        if (_numberSquareTwo != null) return _numberSquareTwo!!
        _numberSquareTwo = phosphorThinIcon(
            name = "NumberSquareTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 156.000 176.000 C 156.000 178.209 154.209 180.000 152.000 180.000 L 104.000 180.000 C 102.485 180.000 101.100 179.144 100.422 177.789 C 99.745 176.434 99.891 174.812 100.800 173.600 L 144.000 116.000 C 150.627 107.163 148.837 94.627 140.000 88.000 C 131.163 81.373 118.627 83.163 112.000 92.000 C 110.771 93.634 109.796 95.444 109.110 97.370 C 108.375 99.455 106.090 100.550 104.005 99.815 C 101.920 99.080 100.825 96.795 101.560 94.710 C 102.507 92.016 103.855 89.481 105.560 87.190 C 111.533 79.068 121.410 74.784 131.422 75.973 C 141.433 77.163 150.032 83.643 153.935 92.938 C 157.837 102.234 156.441 112.910 150.280 120.890 L 112.000 172.000 L 152.000 172.000 C 154.209 172.000 156.000 173.791 156.000 176.000 Z"),
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
        return _numberSquareTwo!!
    }

private var _numberSquareTwo: ImageVector? = null
