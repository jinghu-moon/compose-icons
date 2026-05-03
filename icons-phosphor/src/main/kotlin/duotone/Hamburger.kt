package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Hamburger: ImageVector
    get() {
        if (_hamburger != null) return _hamburger!!
        _hamburger = phosphorDuotoneIcon(
            name = "Hamburger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 188.000 176.000 L 208.000 168.730 L 208.000 184.000 C 208.000 201.673 193.673 216.000 176.000 216.000 L 80.000 216.000 C 62.327 216.000 48.000 201.673 48.000 184.000 L 48.000 167.270 L 68.000 160.000 L 108.000 176.000 L 148.000 160.000 ZM 215.820 86.280 C 209.320 55.550 172.480 32.000 128.000 32.000 C 83.520 32.000 46.680 55.550 40.180 86.280 C 39.656 88.660 40.245 91.150 41.782 93.042 C 43.318 94.935 45.633 96.024 48.070 96.000 L 207.930 96.000 C 210.367 96.024 212.682 94.935 214.218 93.042 C 215.755 91.150 216.344 88.660 215.820 86.280 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 48.070 104.000 L 207.930 104.000 C 212.781 104.025 217.381 101.847 220.437 98.080 C 223.493 94.312 224.675 89.362 223.650 84.620 C 216.220 49.500 176.000 24.000 128.000 24.000 C 80.000 24.000 39.780 49.500 32.350 84.620 C 31.325 89.362 32.507 94.312 35.563 98.080 C 38.619 101.847 43.219 104.025 48.070 104.000 ZM 128.000 40.000 C 167.820 40.000 202.210 60.610 207.930 88.000 L 48.070 88.000 L 48.000 87.930 C 53.790 60.610 88.180 40.000 128.000 40.000 ZM 229.260 152.480 L 188.130 167.480 L 151.000 152.570 C 149.093 151.808 146.967 151.808 145.060 152.570 L 108.060 167.380 L 71.000 152.570 C 69.176 151.841 67.147 151.809 65.300 152.480 L 21.300 168.480 C 17.441 170.179 15.562 174.581 17.007 178.543 C 18.452 182.504 22.723 184.664 26.770 183.480 L 40.000 178.690 L 40.000 184.000 C 40.000 206.091 57.909 224.000 80.000 224.000 L 176.000 224.000 C 198.091 224.000 216.000 206.091 216.000 184.000 L 216.000 174.330 L 234.730 167.520 C 237.592 166.682 239.751 164.322 240.330 161.397 C 240.910 158.471 239.814 155.466 237.488 153.601 C 235.161 151.735 231.990 151.319 229.260 152.520 ZM 200.000 184.000 C 200.000 197.255 189.255 208.000 176.000 208.000 L 80.000 208.000 C 66.745 208.000 56.000 197.255 56.000 184.000 L 56.000 172.880 L 67.870 168.560 L 105.000 183.430 C 106.907 184.192 109.033 184.192 110.940 183.430 L 147.940 168.620 L 184.940 183.430 C 186.764 184.159 188.793 184.191 190.640 183.520 L 199.910 180.150 ZM 16.000 128.000 C 16.000 123.582 19.582 120.000 24.000 120.000 L 232.000 120.000 C 236.418 120.000 240.000 123.582 240.000 128.000 C 240.000 132.418 236.418 136.000 232.000 136.000 L 24.000 136.000 C 19.582 136.000 16.000 132.418 16.000 128.000 Z"),
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
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
