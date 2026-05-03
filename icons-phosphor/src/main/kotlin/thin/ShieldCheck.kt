package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) return _shieldCheck!!
        _shieldCheck = phosphorThinIcon(
            name = "ShieldCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 44.000 L 48.000 44.000 C 41.373 44.000 36.000 49.373 36.000 56.000 L 36.000 112.000 C 36.000 163.160 60.730 194.120 81.470 211.100 C 103.870 229.420 126.020 235.600 126.950 235.860 C 127.638 236.047 128.362 236.047 129.050 235.860 C 129.980 235.600 152.130 229.420 174.530 211.100 C 195.270 194.100 220.000 163.160 220.000 112.000 L 220.000 56.000 C 220.000 49.373 214.627 44.000 208.000 44.000 ZM 212.000 112.000 C 212.000 150.440 197.770 181.630 169.710 204.710 C 157.319 214.873 143.187 222.703 128.000 227.820 C 112.811 222.708 98.678 214.877 86.290 204.710 C 58.230 181.630 44.000 150.440 44.000 112.000 L 44.000 56.000 C 44.000 53.791 45.791 52.000 48.000 52.000 L 208.000 52.000 C 210.209 52.000 212.000 53.791 212.000 56.000 ZM 170.830 101.170 C 171.581 101.920 172.003 102.938 172.003 104.000 C 172.003 105.062 171.581 106.080 170.830 106.830 L 114.830 162.830 C 114.080 163.581 113.062 164.003 112.000 164.003 C 110.938 164.003 109.920 163.581 109.170 162.830 L 85.170 138.830 C 83.607 137.267 83.607 134.733 85.170 133.170 C 86.733 131.607 89.267 131.607 90.830 133.170 L 112.000 154.340 L 165.170 101.170 C 165.920 100.419 166.938 99.997 168.000 99.997 C 169.062 99.997 170.080 100.419 170.830 101.170 Z"),
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
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
