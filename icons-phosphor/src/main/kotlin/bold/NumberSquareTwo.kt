package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareTwo: ImageVector
    get() {
        if (_numberSquareTwo != null) return _numberSquareTwo!!
        _numberSquareTwo = phosphorBoldIcon(
            name = "NumberSquareTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 52.000 L 204.000 52.000 ZM 137.570 111.240 C 139.491 108.699 140.323 105.498 139.882 102.343 C 139.441 99.188 137.764 96.337 135.220 94.420 C 129.929 90.435 122.409 91.491 118.420 96.780 C 117.675 97.755 117.087 98.842 116.680 100.000 C 114.471 106.249 107.614 109.524 101.365 107.315 C 95.116 105.106 91.841 98.249 94.050 92.000 C 95.285 88.533 97.038 85.272 99.250 82.330 C 111.218 66.452 133.792 63.282 149.670 75.250 C 165.548 87.218 168.718 109.792 156.750 125.670 L 128.000 164.000 L 152.000 164.000 C 158.627 164.000 164.000 169.373 164.000 176.000 C 164.000 182.627 158.627 188.000 152.000 188.000 L 104.000 188.000 C 99.455 188.000 95.300 185.432 93.267 181.367 C 91.234 177.301 91.673 172.436 94.400 168.800 Z"),
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
        return _numberSquareTwo!!
    }

private var _numberSquareTwo: ImageVector? = null
