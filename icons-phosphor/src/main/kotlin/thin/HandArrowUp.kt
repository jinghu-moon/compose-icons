package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandArrowUp: ImageVector
    get() {
        if (_handArrowUp != null) return _handArrowUp!!
        _handArrowUp = phosphorThinIcon(
            name = "HandArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 227.900 144.240 C 222.832 140.338 216.231 139.032 210.060 140.710 L 160.750 152.000 C 162.879 148.359 164.001 144.218 164.000 140.000 C 164.000 126.745 153.255 116.000 140.000 116.000 L 89.940 116.000 C 82.510 115.978 75.380 118.931 70.140 124.200 L 46.340 148.000 L 16.000 148.000 C 9.373 148.000 4.000 153.373 4.000 160.000 L 4.000 200.000 C 4.000 206.627 9.373 212.000 16.000 212.000 L 120.000 212.000 C 120.337 212.002 120.673 211.962 121.000 211.880 L 185.000 195.880 C 185.204 195.827 185.405 195.760 185.600 195.680 L 224.420 179.140 L 224.640 179.040 C 230.998 175.862 235.269 169.630 235.938 162.553 C 236.607 155.476 233.580 148.554 227.930 144.240 ZM 12.000 200.000 L 12.000 160.000 C 12.000 157.791 13.791 156.000 16.000 156.000 L 44.000 156.000 L 44.000 204.000 L 16.000 204.000 C 13.791 204.000 12.000 202.209 12.000 200.000 ZM 221.130 171.830 L 182.720 188.200 L 119.510 204.000 L 52.000 204.000 L 52.000 153.660 L 75.800 129.860 C 79.541 126.096 84.633 123.986 89.940 124.000 L 140.000 124.000 C 148.837 124.000 156.000 131.163 156.000 140.000 C 156.000 148.837 148.837 156.000 140.000 156.000 L 112.000 156.000 C 109.791 156.000 108.000 157.791 108.000 160.000 C 108.000 162.209 109.791 164.000 112.000 164.000 L 144.000 164.000 C 144.303 164.001 144.605 163.968 144.900 163.900 L 211.900 148.490 L 212.060 148.490 C 218.277 146.842 224.738 150.140 227.048 156.143 C 229.359 162.145 226.778 168.924 221.060 171.870 ZM 157.130 58.830 C 156.379 58.080 155.957 57.062 155.957 56.000 C 155.957 54.938 156.379 53.920 157.130 53.170 L 189.130 21.170 C 189.880 20.419 190.898 19.997 191.960 19.997 C 193.022 19.997 194.040 20.419 194.790 21.170 L 226.790 53.170 C 228.353 54.733 228.353 57.267 226.790 58.830 C 225.227 60.393 222.693 60.393 221.130 58.830 L 196.000 33.660 L 196.000 104.000 C 196.000 106.209 194.209 108.000 192.000 108.000 C 189.791 108.000 188.000 106.209 188.000 104.000 L 188.000 33.660 L 162.830 58.830 C 162.080 59.581 161.062 60.003 160.000 60.003 C 158.938 60.003 157.920 59.581 157.170 58.830 Z"),
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
        return _handArrowUp!!
    }

private var _handArrowUp: ImageVector? = null
