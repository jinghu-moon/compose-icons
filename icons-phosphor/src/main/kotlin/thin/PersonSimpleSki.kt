package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimpleSki: ImageVector
    get() {
        if (_personSimpleSki != null) return _personSimpleSki!!
        _personSimpleSki = phosphorThinIcon(
            name = "PersonSimpleSki",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 172.000 84.000 C 185.255 84.000 196.000 73.255 196.000 60.000 C 196.000 46.745 185.255 36.000 172.000 36.000 C 158.745 36.000 148.000 46.745 148.000 60.000 C 148.000 73.255 158.745 84.000 172.000 84.000 ZM 172.000 44.000 C 180.837 44.000 188.000 51.163 188.000 60.000 C 188.000 68.837 180.837 76.000 172.000 76.000 C 163.163 76.000 156.000 68.837 156.000 60.000 C 156.000 51.163 163.163 44.000 172.000 44.000 ZM 38.880 83.840 L 150.880 116.490 L 157.210 122.820 C 157.949 123.564 158.951 123.988 160.000 124.000 L 200.000 124.000 C 202.209 124.000 204.000 122.209 204.000 120.000 C 204.000 117.791 202.209 116.000 200.000 116.000 L 161.660 116.000 L 130.830 85.170 C 130.080 84.419 129.062 83.997 128.000 83.997 C 126.938 83.997 125.920 84.419 125.170 85.170 L 113.170 97.170 L 41.120 76.170 C 38.999 75.551 36.779 76.769 36.160 78.890 C 35.541 81.011 36.759 83.231 38.880 83.850 ZM 128.000 93.650 L 139.070 104.730 L 121.930 99.730 ZM 234.220 200.920 C 218.035 211.725 197.898 214.811 179.220 209.350 L 22.880 163.830 C 20.759 163.211 19.541 160.991 20.160 158.870 C 20.779 156.749 22.999 155.531 25.120 156.150 L 103.390 178.940 L 136.390 145.940 L 86.900 131.840 C 85.501 131.469 84.411 130.371 84.051 128.969 C 83.691 127.567 84.117 126.080 85.164 125.080 C 86.211 124.081 87.716 123.725 89.100 124.150 L 145.100 140.150 C 146.461 140.540 147.514 141.621 147.870 142.991 C 148.225 144.361 147.830 145.818 146.830 146.820 L 112.150 181.500 L 181.430 201.670 C 197.849 206.476 215.554 203.763 229.780 194.260 C 231.619 193.034 234.104 193.531 235.330 195.370 C 236.556 197.209 236.059 199.694 234.220 200.920 Z"),
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
        return _personSimpleSki!!
    }

private var _personSimpleSki: ImageVector? = null
