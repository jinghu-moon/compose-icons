package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandArrowDown: ImageVector
    get() {
        if (_handArrowDown != null) return _handArrowDown!!
        _handArrowDown = phosphorThinIcon(
            name = "HandArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 227.900 144.240 C 222.832 140.338 216.231 139.032 210.060 140.710 L 160.750 152.000 C 162.879 148.359 164.001 144.218 164.000 140.000 C 164.000 126.745 153.255 116.000 140.000 116.000 L 89.940 116.000 C 82.510 115.978 75.380 118.931 70.140 124.200 L 46.340 148.000 L 16.000 148.000 C 9.373 148.000 4.000 153.373 4.000 160.000 L 4.000 200.000 C 4.000 206.627 9.373 212.000 16.000 212.000 L 120.000 212.000 C 120.337 212.002 120.673 211.962 121.000 211.880 L 185.000 195.880 C 185.204 195.827 185.405 195.760 185.600 195.680 L 224.420 179.140 L 224.640 179.040 C 230.998 175.862 235.269 169.630 235.938 162.553 C 236.607 155.476 233.580 148.554 227.930 144.240 ZM 12.000 200.000 L 12.000 160.000 C 12.000 157.791 13.791 156.000 16.000 156.000 L 44.000 156.000 L 44.000 204.000 L 16.000 204.000 C 13.791 204.000 12.000 202.209 12.000 200.000 ZM 221.130 171.830 L 182.720 188.200 L 119.510 204.000 L 52.000 204.000 L 52.000 153.660 L 75.800 129.860 C 79.541 126.096 84.633 123.986 89.940 124.000 L 140.000 124.000 C 148.837 124.000 156.000 131.163 156.000 140.000 C 156.000 148.837 148.837 156.000 140.000 156.000 L 112.000 156.000 C 109.791 156.000 108.000 157.791 108.000 160.000 C 108.000 162.209 109.791 164.000 112.000 164.000 L 144.000 164.000 C 144.303 164.001 144.605 163.968 144.900 163.900 L 211.900 148.490 L 212.060 148.490 C 218.277 146.842 224.738 150.140 227.048 156.143 C 229.359 162.145 226.778 168.924 221.060 171.870 ZM 157.130 74.830 C 155.567 73.267 155.567 70.733 157.130 69.170 C 158.693 67.607 161.227 67.607 162.790 69.170 L 188.000 94.340 L 188.000 24.000 C 188.000 21.791 189.791 20.000 192.000 20.000 C 194.209 20.000 196.000 21.791 196.000 24.000 L 196.000 94.340 L 221.170 69.170 C 222.733 67.607 225.267 67.607 226.830 69.170 C 228.393 70.733 228.393 73.267 226.830 74.830 L 194.830 106.830 C 194.080 107.581 193.062 108.003 192.000 108.003 C 190.938 108.003 189.920 107.581 189.170 106.830 Z"),
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
        return _handArrowDown!!
    }

private var _handArrowDown: ImageVector? = null
