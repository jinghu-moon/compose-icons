package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Swatches: ImageVector
    get() {
        if (_swatches != null) return _swatches!!
        _swatches = phosphorRegularIcon(
            name = "Swatches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 88.000 180.000 C 88.000 186.627 82.627 192.000 76.000 192.000 C 69.373 192.000 64.000 186.627 64.000 180.000 C 64.000 173.373 69.373 168.000 76.000 168.000 C 82.627 168.000 88.000 173.373 88.000 180.000 ZM 240.000 156.190 L 240.000 208.000 C 240.000 216.837 232.837 224.000 224.000 224.000 L 76.000 224.000 C 73.339 224.002 70.682 223.774 68.060 223.320 C 44.245 218.975 28.413 196.208 32.630 172.370 L 57.630 29.240 C 58.348 25.063 60.699 21.344 64.165 18.904 C 67.631 16.465 71.926 15.506 76.100 16.240 L 130.840 26.000 C 139.511 27.563 145.287 35.842 143.760 44.520 L 131.680 113.520 L 199.490 89.000 C 207.765 86.011 216.900 90.264 219.940 98.520 L 239.000 150.690 C 239.612 152.462 239.950 154.316 240.000 156.190 ZM 103.000 184.870 L 128.000 41.740 L 73.460 32.000 L 48.460 175.100 C 45.743 190.252 55.766 204.755 70.900 207.570 C 78.089 208.859 85.494 207.213 91.460 203.000 C 97.578 198.745 101.735 192.214 103.000 184.870 ZM 116.780 195.000 L 224.000 156.110 L 204.920 104.000 L 128.500 131.700 L 118.720 187.620 C 118.285 190.131 117.636 192.600 116.780 195.000 ZM 224.000 173.120 L 127.740 208.000 L 224.000 208.000 Z"),
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
        return _swatches!!
    }

private var _swatches: ImageVector? = null
