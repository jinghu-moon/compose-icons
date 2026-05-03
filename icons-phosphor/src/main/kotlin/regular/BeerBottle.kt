package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BeerBottle: ImageVector
    get() {
        if (_beerBottle != null) return _beerBottle!!
        _beerBottle = phosphorRegularIcon(
            name = "BeerBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 245.660 42.340 L 213.660 10.340 C 210.534 7.214 205.466 7.214 202.340 10.340 C 199.214 13.466 199.214 18.534 202.340 21.660 L 203.820 23.130 L 148.650 64.510 L 110.430 72.160 C 108.882 72.470 107.460 73.228 106.340 74.340 L 23.000 157.660 C 13.628 167.032 13.628 182.228 23.000 191.600 L 64.400 233.000 C 73.772 242.372 88.968 242.372 98.340 233.000 L 181.660 149.690 C 182.774 148.572 183.533 147.149 183.840 145.600 L 191.490 107.380 L 232.870 52.210 L 234.340 53.690 C 237.466 56.816 242.534 56.816 245.660 53.690 C 248.786 50.564 248.786 45.496 245.660 42.370 ZM 96.000 107.310 L 148.690 160.000 L 104.000 204.690 L 51.310 152.000 ZM 81.370 224.000 C 79.250 224.006 77.215 223.163 75.720 221.660 L 34.340 180.280 C 31.218 177.156 31.218 172.094 34.340 168.970 L 40.000 163.310 L 92.690 216.000 L 87.000 221.660 C 85.506 223.153 83.482 223.994 81.370 224.000 ZM 177.600 99.200 C 176.883 100.154 176.390 101.259 176.160 102.430 L 168.630 140.060 L 160.000 148.690 L 107.310 96.000 L 115.940 87.370 L 153.570 79.840 C 154.741 79.610 155.846 79.117 156.800 78.400 L 215.250 34.560 L 221.440 40.750 Z"),
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
        return _beerBottle!!
    }

private var _beerBottle: ImageVector? = null
