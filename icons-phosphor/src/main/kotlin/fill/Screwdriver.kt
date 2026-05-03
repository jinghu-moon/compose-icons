package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Screwdriver: ImageVector
    get() {
        if (_screwdriver != null) return _screwdriver!!
        _screwdriver = phosphorFillIcon(
            name = "Screwdriver",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 233.230 22.750 C 213.530 3.078 181.620 3.078 161.920 22.750 L 108.680 76.000 C 105.678 78.993 103.993 83.060 104.000 87.300 L 104.000 104.000 L 87.170 104.000 C 83.685 104.009 80.296 105.145 77.510 107.240 C 77.221 107.461 76.947 107.702 76.690 107.960 L 68.690 115.960 C 65.689 118.961 64.002 123.031 64.002 127.275 C 64.002 131.519 65.689 135.589 68.690 138.590 L 87.390 157.300 L 10.390 234.350 C 7.264 237.476 7.264 242.544 10.390 245.670 C 13.516 248.796 18.584 248.796 21.710 245.670 L 98.710 168.610 L 117.420 187.320 C 123.668 193.563 133.792 193.563 140.040 187.320 L 148.040 179.320 C 148.299 179.060 148.539 178.783 148.760 178.490 C 150.867 175.710 152.009 172.318 152.010 168.830 L 152.010 152.000 L 168.700 152.000 C 172.944 152.008 177.014 150.315 180.000 147.300 L 233.230 94.070 C 242.688 84.612 248.001 71.785 248.001 58.410 C 248.001 45.035 242.688 32.208 233.230 22.750 ZM 205.660 61.640 L 149.660 117.640 C 146.537 120.766 141.471 120.768 138.345 117.645 C 135.219 114.522 135.217 109.456 138.340 106.330 L 194.340 50.330 C 197.466 47.204 202.534 47.204 205.660 50.330 C 208.786 53.456 208.786 58.524 205.660 61.650 Z"),
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
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null
