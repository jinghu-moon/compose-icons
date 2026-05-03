package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cricket: ImageVector
    get() {
        if (_cricket != null) return _cricket!!
        _cricket = phosphorThinIcon(
            name = "Cricket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.490 84.200 L 187.800 31.510 C 185.548 29.251 182.490 27.981 179.300 27.981 C 176.110 27.981 173.052 29.251 170.800 31.510 L 63.520 138.830 C 61.261 141.082 59.991 144.140 59.991 147.330 C 59.991 150.520 61.261 153.578 63.520 155.830 L 87.000 179.310 L 37.170 229.170 C 35.607 230.733 35.607 233.267 37.170 234.830 C 38.733 236.393 41.267 236.393 42.830 234.830 L 92.690 185.000 L 116.200 208.510 C 118.452 210.769 121.510 212.039 124.700 212.039 C 127.890 212.039 130.948 210.769 133.200 208.510 L 240.490 101.170 C 245.176 96.484 245.176 88.886 240.490 84.200 ZM 127.490 202.830 C 126.740 203.581 125.722 204.003 124.660 204.003 C 123.598 204.003 122.580 203.581 121.830 202.830 L 98.340 179.310 L 130.830 146.830 C 132.393 145.267 132.393 142.733 130.830 141.170 C 129.267 139.607 126.733 139.607 125.170 141.170 L 92.690 173.660 L 69.170 150.140 C 68.419 149.390 67.997 148.372 67.997 147.310 C 67.997 146.248 68.419 145.230 69.170 144.480 L 105.660 108.000 L 164.000 108.000 L 164.000 166.340 ZM 234.830 95.510 L 172.000 158.340 L 172.000 104.000 C 172.000 101.791 170.209 100.000 168.000 100.000 L 113.660 100.000 L 176.490 37.170 C 177.240 36.419 178.258 35.997 179.320 35.997 C 180.382 35.997 181.400 36.419 182.150 37.170 L 234.830 89.850 C 235.581 90.600 236.003 91.618 236.003 92.680 C 236.003 93.742 235.581 94.760 234.830 95.510 ZM 60.000 84.000 C 73.255 84.000 84.000 73.255 84.000 60.000 C 84.000 46.745 73.255 36.000 60.000 36.000 C 46.745 36.000 36.000 46.745 36.000 60.000 C 36.000 73.255 46.745 84.000 60.000 84.000 ZM 60.000 44.000 C 68.837 44.000 76.000 51.163 76.000 60.000 C 76.000 68.837 68.837 76.000 60.000 76.000 C 51.163 76.000 44.000 68.837 44.000 60.000 C 44.000 51.163 51.163 44.000 60.000 44.000 Z"),
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
        return _cricket!!
    }

private var _cricket: ImageVector? = null
