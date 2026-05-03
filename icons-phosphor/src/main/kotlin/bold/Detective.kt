package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Detective: ImageVector
    get() {
        if (_detective != null) return _detective!!
        _detective = phosphorBoldIcon(
            name = "Detective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 244.000 104.000 L 219.210 104.000 L 175.820 44.240 C 172.179 39.239 166.429 36.204 160.245 36.020 C 154.062 35.836 148.142 38.524 144.210 43.300 L 131.390 58.160 C 131.290 58.270 131.190 58.390 131.100 58.510 C 130.340 59.442 129.202 59.982 128.000 59.982 C 126.798 59.982 125.660 59.442 124.900 58.510 C 124.810 58.390 124.710 58.270 124.610 58.160 L 111.790 43.300 C 107.858 38.524 101.938 35.836 95.755 36.020 C 89.571 36.204 83.821 39.239 80.180 44.240 L 36.790 104.000 L 12.000 104.000 C 5.373 104.000 0.000 109.373 0.000 116.000 C 0.000 122.627 5.373 128.000 12.000 128.000 L 244.000 128.000 C 250.627 128.000 256.000 122.627 256.000 116.000 C 256.000 109.373 250.627 104.000 244.000 104.000 ZM 96.620 62.450 L 106.310 73.690 C 111.628 80.204 119.591 83.983 128.000 83.983 C 136.409 83.983 144.372 80.204 149.690 73.690 L 159.380 62.450 L 189.550 104.000 L 66.450 104.000 ZM 180.000 140.000 C 162.538 140.021 147.100 151.349 141.840 168.000 L 114.160 168.000 C 108.236 149.162 89.451 137.466 69.932 140.463 C 50.413 143.460 36.002 160.253 36.002 180.000 C 36.002 199.747 50.413 216.540 69.932 219.537 C 89.451 222.534 108.236 210.838 114.160 192.000 L 141.840 192.000 C 147.996 211.576 167.967 223.317 188.066 219.178 C 208.165 215.038 221.871 196.361 219.792 175.946 C 217.712 155.531 200.521 140.001 180.000 140.000 ZM 76.000 196.000 C 67.163 196.000 60.000 188.837 60.000 180.000 C 60.000 171.163 67.163 164.000 76.000 164.000 C 84.837 164.000 92.000 171.163 92.000 180.000 C 92.000 188.837 84.837 196.000 76.000 196.000 ZM 180.000 196.000 C 171.163 196.000 164.000 188.837 164.000 180.000 C 164.000 171.163 171.163 164.000 180.000 164.000 C 188.837 164.000 196.000 171.163 196.000 180.000 C 196.000 188.837 188.837 196.000 180.000 196.000 Z"),
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
        return _detective!!
    }

private var _detective: ImageVector? = null
