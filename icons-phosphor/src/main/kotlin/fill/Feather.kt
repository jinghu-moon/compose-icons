package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Feather: ImageVector
    get() {
        if (_feather != null) return _feather!!
        _feather = phosphorFillIcon(
            name = "Feather",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 211.840 134.810 L 152.050 195.280 L 152.050 195.280 C 149.092 198.274 145.059 199.959 140.850 199.960 L 75.320 199.960 L 45.660 229.660 C 42.534 232.786 37.466 232.786 34.340 229.660 C 31.214 226.534 31.214 221.466 34.340 218.340 L 56.930 195.760 L 56.930 195.760 L 124.700 128.000 L 209.000 128.000 C 210.612 128.003 212.065 128.973 212.685 130.460 C 213.306 131.948 212.972 133.663 211.840 134.810 ZM 216.700 30.570 C 191.267 9.640 154.102 11.431 130.800 34.710 L 121.200 44.190 C 120.444 44.931 120.012 45.941 120.000 47.000 L 120.000 110.000 L 175.000 55.000 C 178.145 52.012 183.099 52.075 186.167 55.143 C 189.235 58.211 189.298 63.165 186.310 66.310 L 140.710 112.000 L 229.090 112.000 C 230.587 112.003 231.961 111.170 232.650 109.840 C 246.780 82.974 240.121 49.880 216.700 30.570 ZM 62.830 167.230 L 104.000 126.060 L 104.000 70.760 C 103.997 69.148 103.027 67.695 101.540 67.075 C 100.052 66.454 98.337 66.788 97.190 67.920 L 60.690 104.000 C 57.680 106.993 55.991 111.065 56.000 115.310 L 56.000 164.400 C 55.999 166.019 56.973 167.479 58.469 168.098 C 59.964 168.718 61.686 168.375 62.830 167.230 Z"),
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
        return _feather!!
    }

private var _feather: ImageVector? = null
