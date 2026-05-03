package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Airplane: ImageVector
    get() {
        if (_airplane != null) return _airplane!!
        _airplane = phosphorBoldIcon(
            name = "Airplane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 237.370 125.270 L 164.000 88.580 L 164.000 48.000 C 164.000 28.118 147.882 12.000 128.000 12.000 C 108.118 12.000 92.000 28.118 92.000 48.000 L 92.000 88.580 L 18.630 125.270 C 14.567 127.303 12.001 131.457 12.000 136.000 L 12.000 168.000 C 11.999 171.595 13.610 175.001 16.390 177.281 C 19.169 179.560 22.825 180.474 26.350 179.770 L 92.000 166.640 L 92.000 179.000 L 79.510 191.510 C 77.260 193.762 75.997 196.816 76.000 200.000 L 76.000 232.000 C 76.000 235.982 77.976 239.705 81.274 241.938 C 84.572 244.170 88.763 244.620 92.460 243.140 L 128.000 228.920 L 163.540 243.140 C 164.958 243.710 166.472 244.002 168.000 244.000 C 174.627 244.000 180.000 238.627 180.000 232.000 L 180.000 200.000 C 180.003 196.816 178.740 193.762 176.490 191.510 L 164.000 179.000 L 164.000 166.640 L 229.650 179.770 C 233.175 180.474 236.831 179.560 239.610 177.281 C 242.390 175.001 244.001 171.595 244.000 168.000 L 244.000 136.000 C 243.999 131.457 241.433 127.303 237.370 125.270 ZM 220.000 153.360 L 154.350 140.230 C 150.825 139.526 147.169 140.440 144.390 142.719 C 141.610 144.999 139.999 148.405 140.000 152.000 L 140.000 184.000 C 139.997 187.184 141.260 190.238 143.510 192.490 L 156.000 205.000 L 156.000 214.310 L 132.460 204.890 C 129.597 203.744 126.403 203.744 123.540 204.890 L 100.000 214.280 L 100.000 205.000 L 112.490 192.520 C 114.747 190.260 116.010 187.194 116.000 184.000 L 116.000 152.000 C 116.001 148.405 114.390 144.999 111.610 142.719 C 108.831 140.440 105.175 139.526 101.650 140.230 L 36.000 153.360 L 36.000 143.420 L 109.370 106.730 C 113.433 104.697 115.999 100.543 116.000 96.000 L 116.000 48.000 C 116.000 41.373 121.373 36.000 128.000 36.000 C 134.627 36.000 140.000 41.373 140.000 48.000 L 140.000 96.000 C 140.001 100.543 142.567 104.697 146.630 106.730 L 220.000 143.420 Z"),
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
        return _airplane!!
    }

private var _airplane: ImageVector? = null
