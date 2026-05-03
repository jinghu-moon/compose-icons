package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ReadCvLogo: ImageVector
    get() {
        if (_readCvLogo != null) return _readCvLogo!!
        _readCvLogo = phosphorLightIcon(
            name = "ReadCvLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 210.430 41.220 L 80.180 18.220 C 72.578 16.901 65.341 21.982 64.000 29.580 L 34.250 198.580 C 33.605 202.237 34.439 206.001 36.570 209.043 C 38.700 212.085 41.952 214.156 45.610 214.800 L 175.860 237.800 L 175.860 237.800 C 176.672 237.948 177.495 238.021 178.320 238.020 C 185.083 237.965 190.841 233.084 192.000 226.420 L 221.750 57.420 C 223.083 49.824 218.021 42.580 210.430 41.220 ZM 210.000 55.360 L 180.250 224.360 C 180.161 224.885 179.866 225.353 179.430 225.660 C 178.996 225.963 178.461 226.081 177.940 225.990 L 47.650 203.000 C 47.114 202.915 46.635 202.616 46.324 202.171 C 46.012 201.725 45.896 201.173 46.000 200.640 L 75.750 31.640 C 75.839 31.115 76.134 30.647 76.570 30.340 C 77.015 30.030 77.565 29.907 78.100 30.000 L 208.350 53.000 C 208.886 53.085 209.365 53.384 209.676 53.829 C 209.988 54.275 210.104 54.827 210.000 55.360 ZM 186.110 75.510 C 185.623 78.391 183.132 80.502 180.210 80.510 C 179.858 80.510 179.507 80.480 179.160 80.420 L 96.160 65.760 C 93.991 65.449 92.165 63.982 91.394 61.931 C 90.624 59.880 91.032 57.573 92.459 55.911 C 93.887 54.249 96.107 53.498 98.250 53.950 L 181.250 68.600 C 184.492 69.179 186.661 72.263 186.110 75.510 ZM 180.560 107.000 C 180.073 109.881 177.582 111.992 174.660 112.000 C 174.324 111.997 173.990 111.964 173.660 111.900 L 90.660 97.250 C 87.396 96.673 85.218 93.559 85.795 90.295 C 86.372 87.031 89.486 84.853 92.750 85.430 L 175.750 100.090 C 178.971 100.693 181.113 103.770 180.560 107.000 ZM 133.560 131.190 C 133.051 134.055 130.560 136.141 127.650 136.140 C 127.298 136.139 126.947 136.109 126.600 136.050 L 85.110 128.720 C 82.941 128.409 81.115 126.942 80.344 124.891 C 79.574 122.840 79.982 120.533 81.409 118.871 C 82.837 117.209 85.057 116.458 87.200 116.910 L 128.690 124.230 C 130.260 124.512 131.654 125.408 132.562 126.720 C 133.470 128.031 133.818 129.651 133.530 131.220 Z"),
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
        return _readCvLogo!!
    }

private var _readCvLogo: ImageVector? = null
