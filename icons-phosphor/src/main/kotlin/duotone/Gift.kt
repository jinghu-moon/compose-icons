package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Gift: ImageVector
    get() {
        if (_gift != null) return _gift!!
        _gift = phosphorDuotoneIcon(
            name = "Gift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 128.000 L 208.000 200.000 C 208.000 204.418 204.418 208.000 200.000 208.000 L 56.000 208.000 C 51.582 208.000 48.000 204.418 48.000 200.000 L 48.000 128.000 Z"),
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
        pathData = parseSvgPathData("M 216.000 72.000 L 180.920 72.000 C 181.310 71.670 181.710 71.350 182.090 71.000 C 188.230 65.545 191.820 57.781 192.000 49.570 C 192.266 40.590 188.815 31.897 182.464 25.544 C 176.112 19.190 167.420 15.737 158.440 16.000 C 150.226 16.177 142.457 19.768 137.000 25.910 C 133.265 30.239 130.228 35.124 128.000 40.390 C 125.772 35.124 122.735 30.239 119.000 25.910 C 113.543 19.768 105.774 16.177 97.560 16.000 C 88.580 15.737 79.888 19.190 73.536 25.544 C 67.185 31.897 63.735 40.590 64.000 49.570 C 64.180 57.781 67.770 65.545 73.910 71.000 C 74.290 71.330 74.690 71.650 75.080 72.000 L 40.000 72.000 C 31.163 72.000 24.000 79.163 24.000 88.000 L 24.000 120.000 C 24.000 128.837 31.163 136.000 40.000 136.000 L 40.000 200.000 C 40.000 208.837 47.163 216.000 56.000 216.000 L 200.000 216.000 C 208.837 216.000 216.000 208.837 216.000 200.000 L 216.000 136.000 C 224.837 136.000 232.000 128.837 232.000 120.000 L 232.000 88.000 C 232.000 79.163 224.837 72.000 216.000 72.000 ZM 149.000 36.510 C 151.561 33.682 155.185 32.051 159.000 32.010 L 159.490 32.010 C 163.958 32.038 168.226 33.864 171.333 37.075 C 174.439 40.287 176.121 44.614 176.000 49.080 C 175.959 52.895 174.328 56.519 171.500 59.080 C 162.010 67.480 146.260 70.440 136.500 71.480 C 137.700 60.890 141.000 45.500 149.000 36.510 ZM 84.910 36.870 C 88.009 33.771 92.207 32.021 96.590 32.000 L 97.080 32.000 C 100.895 32.041 104.519 33.672 107.080 36.500 C 115.470 45.980 118.430 61.700 119.470 71.420 C 109.750 70.420 94.030 67.420 84.550 59.030 C 81.722 56.469 80.091 52.845 80.050 49.030 C 79.925 44.488 81.667 40.093 84.870 36.870 ZM 40.000 88.000 L 120.000 88.000 L 120.000 120.000 L 40.000 120.000 ZM 56.000 136.000 L 120.000 136.000 L 120.000 200.000 L 56.000 200.000 ZM 200.000 200.000 L 136.000 200.000 L 136.000 136.000 L 200.000 136.000 ZM 216.000 120.000 L 136.000 120.000 L 136.000 88.000 L 216.000 88.000 L 216.000 120.000 Z"),
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
        return _gift!!
    }

private var _gift: ImageVector? = null
