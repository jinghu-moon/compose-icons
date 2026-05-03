package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Hoodie: ImageVector
    get() {
        if (_hoodie != null) return _hoodie!!
        _hoodie = phosphorThinIcon(
            name = "Hoodie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 234.000 122.750 L 179.710 41.340 C 177.481 37.998 173.727 35.994 169.710 36.000 L 86.270 36.000 C 82.253 35.994 78.499 37.998 76.270 41.340 L 22.000 122.750 C 20.071 125.638 19.487 129.219 20.400 132.570 L 41.840 211.160 C 43.266 216.384 48.015 220.006 53.430 220.000 L 80.000 220.000 C 86.627 220.000 92.000 214.627 92.000 208.000 L 92.000 188.000 L 164.000 188.000 L 164.000 208.000 C 164.000 214.627 169.373 220.000 176.000 220.000 L 202.570 220.000 C 207.978 219.997 212.716 216.377 214.140 211.160 L 235.580 132.570 C 236.499 129.222 235.922 125.641 234.000 122.750 ZM 80.000 180.000 C 77.791 180.000 76.000 178.209 76.000 176.000 L 76.000 62.000 L 108.000 80.860 L 108.000 136.000 C 108.000 138.209 109.791 140.000 112.000 140.000 C 114.209 140.000 116.000 138.209 116.000 136.000 L 116.000 85.570 L 126.000 91.450 C 127.253 92.188 128.807 92.188 130.060 91.450 L 140.060 85.570 L 140.060 128.000 C 140.060 130.209 141.851 132.000 144.060 132.000 C 146.269 132.000 148.060 130.209 148.060 128.000 L 148.060 80.850 L 180.000 62.000 L 180.000 176.000 C 180.000 178.209 178.209 180.000 176.000 180.000 ZM 82.940 45.780 C 83.682 44.667 84.932 43.999 86.270 44.000 L 169.730 44.000 C 171.068 43.999 172.318 44.667 173.060 45.780 L 178.330 53.690 L 128.000 83.360 L 77.670 53.690 ZM 84.000 208.000 C 84.000 210.209 82.209 212.000 80.000 212.000 L 53.430 212.000 C 51.629 211.996 50.053 210.788 49.580 209.050 L 28.140 130.460 C 27.836 129.345 28.029 128.152 28.670 127.190 L 68.000 68.200 L 68.000 176.000 C 68.000 182.627 73.373 188.000 80.000 188.000 L 84.000 188.000 ZM 227.860 130.460 L 206.420 209.050 C 205.947 210.788 204.371 211.996 202.570 212.000 L 176.000 212.000 C 173.791 212.000 172.000 210.209 172.000 208.000 L 172.000 188.000 L 176.000 188.000 C 182.627 188.000 188.000 182.627 188.000 176.000 L 188.000 68.200 L 227.330 127.200 C 227.968 128.160 228.161 129.348 227.860 130.460 Z"),
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
        return _hoodie!!
    }

private var _hoodie: ImageVector? = null
