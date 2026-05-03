package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.StackOverflowLogo: ImageVector
    get() {
        if (_stackOverflowLogo != null) return _stackOverflowLogo!!
        _stackOverflowLogo = phosphorBoldIcon(
            name = "StackOverflowLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 151.670 L 220.000 216.000 C 220.000 222.627 214.627 228.000 208.000 228.000 L 48.000 228.000 C 41.373 228.000 36.000 222.627 36.000 216.000 L 36.000 151.670 C 36.000 145.043 41.373 139.670 48.000 139.670 C 54.627 139.670 60.000 145.043 60.000 151.670 L 60.000 203.900 L 196.000 203.900 L 196.000 151.670 C 196.000 145.043 201.373 139.670 208.000 139.670 C 214.627 139.670 220.000 145.043 220.000 151.670 ZM 88.000 183.810 L 168.000 183.810 C 174.523 183.622 179.713 178.280 179.713 171.755 C 179.713 165.230 174.523 159.888 168.000 159.700 L 88.000 159.700 C 81.477 159.888 76.287 165.230 76.287 171.755 C 76.287 178.280 81.477 183.622 88.000 183.810 ZM 96.200 113.000 L 171.370 140.490 C 177.627 142.757 184.538 139.522 186.805 133.265 C 189.072 127.008 185.837 120.097 179.580 117.830 L 104.410 90.350 C 98.155 88.083 91.247 91.315 88.980 97.570 C 86.713 103.825 89.945 110.733 96.200 113.000 ZM 128.000 49.290 L 189.290 100.930 C 194.366 105.186 201.931 104.523 206.190 99.450 C 210.462 94.343 209.801 86.742 204.710 82.450 L 143.440 30.820 C 141.000 28.774 137.848 27.782 134.676 28.061 C 131.505 28.341 128.574 29.869 126.530 32.310 C 122.274 37.413 122.931 44.994 128.000 49.290 Z"),
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
        return _stackOverflowLogo!!
    }

private var _stackOverflowLogo: ImageVector? = null
