package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Detective: ImageVector
    get() {
        if (_detective != null) return _detective!!
        _detective = phosphorThinIcon(
            name = "Detective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 116.000 L 218.000 116.000 L 169.350 49.000 C 167.158 45.993 163.695 44.174 159.975 44.074 C 156.256 43.974 152.700 45.605 150.350 48.490 L 137.450 63.380 L 137.350 63.500 C 135.072 66.331 131.634 67.978 128.000 67.978 C 124.366 67.978 120.928 66.331 118.650 63.500 L 118.550 63.380 L 105.660 48.440 C 103.310 45.555 99.754 43.924 96.035 44.024 C 92.315 44.124 88.852 45.943 86.660 48.950 L 38.000 116.000 L 8.000 116.000 C 5.791 116.000 4.000 117.791 4.000 120.000 C 4.000 122.209 5.791 124.000 8.000 124.000 L 248.000 124.000 C 250.209 124.000 252.000 122.209 252.000 120.000 C 252.000 117.791 250.209 116.000 248.000 116.000 ZM 93.130 53.650 C 93.860 52.643 95.017 52.034 96.260 52.000 C 97.502 51.976 98.684 52.530 99.460 53.500 L 99.560 53.620 L 112.450 68.560 C 116.231 73.278 121.954 76.016 128.000 76.000 L 128.000 76.000 C 134.046 76.016 139.769 73.278 143.550 68.560 L 156.440 53.620 L 156.540 53.500 C 157.322 52.538 158.500 51.985 159.740 52.000 C 160.983 52.034 162.140 52.643 162.870 53.650 L 208.150 116.000 L 47.850 116.000 ZM 180.000 148.000 C 162.327 148.000 148.000 162.327 148.000 180.000 L 108.000 180.000 C 107.967 163.111 94.815 149.155 77.957 148.122 C 61.100 147.089 46.342 159.335 44.247 176.093 C 42.152 192.852 53.442 208.353 70.035 211.502 C 86.628 214.650 102.811 204.361 107.000 188.000 L 149.000 188.000 C 153.157 204.099 168.951 214.333 185.344 211.548 C 201.736 208.763 213.265 193.888 211.871 177.319 C 210.478 160.750 196.627 148.008 180.000 148.000 ZM 76.000 204.000 C 62.745 204.000 52.000 193.255 52.000 180.000 C 52.000 166.745 62.745 156.000 76.000 156.000 C 89.255 156.000 100.000 166.745 100.000 180.000 C 100.000 193.255 89.255 204.000 76.000 204.000 ZM 180.000 204.000 C 166.745 204.000 156.000 193.255 156.000 180.000 C 156.000 166.745 166.745 156.000 180.000 156.000 C 193.255 156.000 204.000 166.745 204.000 180.000 C 204.000 193.255 193.255 204.000 180.000 204.000 Z"),
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
        return _detective!!
    }

private var _detective: ImageVector? = null
