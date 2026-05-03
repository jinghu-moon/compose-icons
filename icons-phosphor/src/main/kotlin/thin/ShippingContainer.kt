package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShippingContainer: ImageVector
    get() {
        if (_shippingContainer != null) return _shippingContainer!!
        _shippingContainer = phosphorThinIcon(
            name = "ShippingContainer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 235.300 74.500 L 129.100 44.150 C 128.557 43.999 127.988 43.961 127.430 44.040 L 22.300 59.060 C 16.402 59.930 12.025 64.979 12.000 70.940 L 12.000 185.060 C 12.025 191.021 16.402 196.070 22.300 196.940 L 127.430 211.940 C 127.620 211.955 127.810 211.955 128.000 211.940 C 128.372 211.940 128.742 211.890 129.100 211.790 L 235.300 181.500 C 240.437 180.031 243.983 175.343 244.000 170.000 L 244.000 86.000 C 243.983 80.657 240.437 75.969 235.300 74.500 ZM 96.000 124.000 L 76.000 124.000 L 76.000 59.470 L 124.000 52.610 L 124.000 203.390 L 76.000 196.530 L 76.000 132.000 L 96.000 132.000 C 98.209 132.000 100.000 130.209 100.000 128.000 C 100.000 125.791 98.209 124.000 96.000 124.000 ZM 20.000 185.060 L 20.000 70.940 C 19.980 68.936 21.446 67.226 23.430 66.940 L 68.000 60.610 L 68.000 124.000 L 48.000 124.000 C 45.791 124.000 44.000 125.791 44.000 128.000 C 44.000 130.209 45.791 132.000 48.000 132.000 L 68.000 132.000 L 68.000 195.390 L 23.430 189.000 C 21.469 188.718 20.010 187.042 20.000 185.060 ZM 236.000 170.000 C 235.997 171.783 234.815 173.350 233.100 173.840 L 132.000 202.700 L 132.000 53.300 L 233.100 82.190 C 234.804 82.677 235.984 84.228 236.000 86.000 Z"),
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
        return _shippingContainer!!
    }

private var _shippingContainer: ImageVector? = null
