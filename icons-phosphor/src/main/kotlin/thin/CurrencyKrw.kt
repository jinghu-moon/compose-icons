package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyKrw: ImageVector
    get() {
        if (_currencyKrw != null) return _currencyKrw!!
        _currencyKrw = phosphorThinIcon(
            name = "CurrencyKrw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 132.000 L 211.940 132.000 L 235.710 73.510 C 236.538 71.461 235.549 69.128 233.500 68.300 C 231.451 67.472 229.118 68.461 228.290 70.510 L 203.290 132.020 L 156.690 132.020 L 131.690 70.510 C 131.080 68.997 129.612 68.005 127.980 68.005 C 126.348 68.005 124.880 68.997 124.270 70.510 L 99.310 132.000 L 52.690 132.000 L 27.690 70.490 C 26.862 68.441 24.529 67.452 22.480 68.280 C 20.431 69.108 19.442 71.441 20.270 73.490 L 44.060 132.000 L 16.000 132.000 C 13.791 132.000 12.000 133.791 12.000 136.000 C 12.000 138.209 13.791 140.000 16.000 140.000 L 47.310 140.000 L 72.310 201.510 C 72.920 203.023 74.388 204.015 76.020 204.015 C 77.652 204.015 79.120 203.023 79.730 201.510 L 104.730 140.000 L 151.350 140.000 L 176.350 201.510 C 176.960 203.023 178.428 204.015 180.060 204.015 C 181.692 204.015 183.160 203.023 183.770 201.510 L 208.770 140.000 L 240.000 140.000 C 242.209 140.000 244.000 138.209 244.000 136.000 C 244.000 133.791 242.209 132.000 240.000 132.000 ZM 76.000 189.370 L 55.940 140.000 L 96.060 140.000 ZM 107.940 132.000 L 128.000 82.630 L 148.060 132.000 ZM 180.000 189.370 L 159.940 140.000 L 200.060 140.000 Z"),
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
        return _currencyKrw!!
    }

private var _currencyKrw: ImageVector? = null
