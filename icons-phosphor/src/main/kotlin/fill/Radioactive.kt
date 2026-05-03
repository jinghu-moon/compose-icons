package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Radioactive: ImageVector
    get() {
        if (_radioactive != null) return _radioactive!!
        _radioactive = phosphorFillIcon(
            name = "Radioactive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 116.000 128.000 C 116.000 121.373 121.373 116.000 128.000 116.000 C 134.627 116.000 140.000 121.373 140.000 128.000 C 140.000 134.627 134.627 140.000 128.000 140.000 C 121.373 140.000 116.000 134.627 116.000 128.000 ZM 100.220 131.510 C 100.076 130.346 100.002 129.173 100.000 128.000 C 99.997 116.809 106.659 106.691 116.940 102.270 C 117.983 101.815 118.783 100.938 119.140 99.858 C 119.497 98.778 119.377 97.596 118.810 96.610 L 90.750 48.000 C 88.502 44.101 84.715 41.330 80.319 40.365 C 75.923 39.400 71.324 40.331 67.650 42.930 C 42.753 60.482 26.819 88.082 24.070 118.420 C 23.665 122.946 25.178 127.433 28.240 130.790 C 31.259 134.095 35.524 135.985 40.000 136.000 L 96.260 136.000 C 97.405 135.997 98.493 135.504 99.250 134.646 C 100.007 133.787 100.360 132.646 100.220 131.510 ZM 231.930 118.420 C 229.180 88.082 213.247 60.482 188.350 42.930 C 184.676 40.331 180.077 39.400 175.681 40.365 C 171.285 41.330 167.498 44.101 165.250 48.000 L 137.190 96.610 C 136.623 97.596 136.503 98.778 136.860 99.858 C 137.217 100.938 138.017 101.815 139.060 102.270 C 149.341 106.691 156.003 116.809 156.000 128.000 C 155.998 129.173 155.924 130.346 155.780 131.510 C 155.639 132.653 155.997 133.801 156.763 134.661 C 157.529 135.521 158.629 136.009 159.780 136.000 L 216.000 136.000 C 220.476 135.985 224.741 134.095 227.760 130.790 C 230.822 127.433 232.335 122.946 231.930 118.420 ZM 150.800 151.480 C 150.220 150.483 149.238 149.784 148.106 149.564 C 146.974 149.344 145.801 149.623 144.890 150.330 C 134.898 157.887 121.102 157.887 111.110 150.330 C 110.199 149.623 109.026 149.344 107.894 149.564 C 106.762 149.784 105.780 150.483 105.200 151.480 L 77.250 199.910 C 75.002 203.800 74.493 208.455 75.847 212.739 C 77.202 217.023 80.295 220.539 84.370 222.430 C 112.057 235.190 143.943 235.190 171.630 222.430 C 175.705 220.539 178.798 217.023 180.153 212.739 C 181.507 208.455 180.998 203.800 178.750 199.910 Z"),
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
        return _radioactive!!
    }

private var _radioactive: ImageVector? = null
