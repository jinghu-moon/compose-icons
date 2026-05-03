package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Rewind: ImageVector
    get() {
        if (_rewind != null) return _rewind!!
        _rewind = phosphorThinIcon(
            name = "Rewind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 221.850 61.480 C 218.021 59.385 213.357 59.535 209.670 61.870 L 124.000 116.430 L 124.000 71.840 C 124.031 67.513 121.664 63.525 117.850 61.480 C 114.021 59.385 109.357 59.535 105.670 61.870 L 17.480 118.000 C 14.068 120.167 12.000 123.928 12.000 127.970 C 12.000 132.012 14.068 135.773 17.480 137.940 L 105.670 194.100 C 109.357 196.435 114.021 196.585 117.850 194.490 C 121.654 192.450 124.020 188.476 124.000 184.160 L 124.000 139.570 L 209.670 194.130 C 213.357 196.465 218.021 196.615 221.850 194.520 C 225.664 192.475 228.031 188.487 228.000 184.160 L 228.000 71.840 C 228.031 67.513 225.664 63.525 221.850 61.480 ZM 116.000 184.160 C 116.010 185.562 115.239 186.854 114.000 187.510 C 112.744 188.204 111.208 188.154 110.000 187.380 L 21.780 131.220 C 20.671 130.525 19.998 129.309 19.998 128.000 C 19.998 126.691 20.671 125.475 21.780 124.780 L 110.000 68.620 C 110.635 68.210 111.374 67.991 112.130 67.990 C 112.798 67.994 113.455 68.166 114.040 68.490 C 115.279 69.146 116.050 70.438 116.040 71.840 ZM 220.000 184.160 C 220.010 185.562 219.239 186.854 218.000 187.510 C 216.744 188.204 215.208 188.154 214.000 187.380 L 125.820 131.220 C 124.711 130.525 124.038 129.309 124.038 128.000 C 124.038 126.691 124.711 125.475 125.820 124.780 L 214.000 68.620 C 214.635 68.210 215.374 67.991 216.130 67.990 C 216.798 67.994 217.455 68.166 218.040 68.490 C 219.279 69.146 220.050 70.438 220.040 71.840 Z"),
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
        return _rewind!!
    }

private var _rewind: ImageVector? = null
