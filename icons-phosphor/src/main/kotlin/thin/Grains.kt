package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Grains: ImageVector
    get() {
        if (_grains != null) return _grains!!
        _grains = phosphorThinIcon(
            name = "Grains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 60.000 C 196.330 59.993 184.789 62.432 174.120 67.160 C 161.120 36.380 131.120 21.080 129.790 20.420 C 128.663 19.856 127.337 19.856 126.210 20.420 C 124.890 21.080 94.910 36.420 81.880 67.160 C 71.211 62.432 59.670 59.993 48.000 60.000 C 45.791 60.000 44.000 61.791 44.000 64.000 L 44.000 144.000 C 44.000 190.392 81.608 228.000 128.000 228.000 C 174.392 228.000 212.000 190.392 212.000 144.000 L 212.000 64.000 C 212.000 61.791 210.209 60.000 208.000 60.000 ZM 124.000 219.900 C 83.660 217.718 52.053 184.399 52.000 144.000 L 52.000 124.100 C 92.340 126.282 123.947 159.601 124.000 200.000 ZM 124.000 164.270 C 110.748 136.140 83.058 117.615 52.000 116.100 L 52.000 68.100 C 92.340 70.282 123.947 103.601 124.000 144.000 ZM 89.050 70.750 C 99.120 46.530 121.510 32.280 128.050 28.560 C 134.540 32.280 156.930 46.560 167.000 70.750 C 148.463 81.160 134.536 98.180 128.000 118.410 C 121.476 98.188 107.568 81.170 89.050 70.750 ZM 204.000 144.000 C 203.947 184.399 172.340 217.718 132.000 219.900 L 132.000 200.000 C 132.053 159.601 163.660 126.282 204.000 124.100 ZM 204.000 116.100 C 172.942 117.615 145.252 136.140 132.000 164.270 L 132.000 144.000 C 132.053 103.601 163.660 70.282 204.000 68.100 Z"),
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
        return _grains!!
    }

private var _grains: ImageVector? = null
