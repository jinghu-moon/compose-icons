package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Anchor: ImageVector
    get() {
        if (_anchor != null) return _anchor!!
        _anchor = phosphorThinIcon(
            name = "Anchor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 140.000 C 213.791 140.000 212.000 141.791 212.000 144.000 C 212.000 172.940 193.000 178.130 170.950 184.140 C 156.660 188.040 141.130 192.280 132.000 204.380 L 132.000 124.000 L 168.000 124.000 C 170.209 124.000 172.000 122.209 172.000 120.000 C 172.000 117.791 170.209 116.000 168.000 116.000 L 132.000 116.000 L 132.000 83.710 C 146.535 81.612 156.980 68.640 155.928 53.992 C 154.876 39.344 142.686 27.997 128.000 27.997 C 113.314 27.997 101.124 39.344 100.072 53.992 C 99.020 68.640 109.465 81.612 124.000 83.710 L 124.000 116.000 L 88.000 116.000 C 85.791 116.000 84.000 117.791 84.000 120.000 C 84.000 122.209 85.791 124.000 88.000 124.000 L 124.000 124.000 L 124.000 204.380 C 114.870 192.280 99.340 188.040 85.050 184.140 C 63.050 178.140 44.050 172.940 44.050 144.000 C 44.050 141.791 42.259 140.000 40.050 140.000 C 37.841 140.000 36.050 141.791 36.050 144.000 C 36.050 179.060 60.990 185.860 83.050 191.860 C 105.110 197.860 124.000 203.060 124.000 232.000 C 124.000 234.209 125.791 236.000 128.000 236.000 C 130.209 236.000 132.000 234.209 132.000 232.000 C 132.000 203.060 151.000 197.870 173.050 191.860 C 195.100 185.850 220.000 179.060 220.000 144.000 C 220.000 141.791 218.209 140.000 216.000 140.000 ZM 108.000 56.000 C 108.000 44.954 116.954 36.000 128.000 36.000 C 139.046 36.000 148.000 44.954 148.000 56.000 C 148.000 67.046 139.046 76.000 128.000 76.000 C 116.954 76.000 108.000 67.046 108.000 56.000 Z"),
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
        return _anchor!!
    }

private var _anchor: ImageVector? = null
