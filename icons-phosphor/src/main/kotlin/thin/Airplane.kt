package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Airplane: ImageVector
    get() {
        if (_airplane != null) return _airplane!!
        _airplane = phosphorThinIcon(
            name = "Airplane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 233.790 132.420 L 156.000 93.530 L 156.000 48.000 C 156.000 32.536 143.464 20.000 128.000 20.000 C 112.536 20.000 100.000 32.536 100.000 48.000 L 100.000 93.530 L 22.210 132.420 C 20.855 133.098 19.999 134.484 20.000 136.000 L 20.000 168.000 C 20.001 169.197 20.538 170.331 21.464 171.090 C 22.389 171.849 23.606 172.153 24.780 171.920 L 100.000 156.920 L 100.000 182.380 L 85.170 197.170 C 84.420 197.921 83.999 198.939 84.000 200.000 L 84.000 232.000 C 84.001 233.328 84.660 234.569 85.760 235.312 C 86.860 236.056 88.258 236.205 89.490 235.710 L 128.000 220.310 L 166.510 235.710 C 166.983 235.904 167.489 236.003 168.000 236.000 C 168.799 236.003 169.581 235.762 170.240 235.310 C 171.339 234.567 171.999 233.327 172.000 232.000 L 172.000 200.000 C 172.001 198.939 171.580 197.921 170.830 197.170 L 156.000 182.340 L 156.000 156.880 L 231.220 171.880 C 232.387 172.112 233.597 171.812 234.521 171.062 C 235.445 170.312 235.987 169.190 236.000 168.000 L 236.000 136.000 C 236.001 134.484 235.145 133.098 233.790 132.420 ZM 228.000 163.120 L 152.780 148.120 C 151.613 147.888 150.403 148.188 149.479 148.938 C 148.555 149.688 148.013 150.810 148.000 152.000 L 148.000 184.000 C 147.999 185.061 148.420 186.079 149.170 186.830 L 164.000 201.660 L 164.000 226.090 L 129.490 212.290 C 128.528 211.901 127.452 211.901 126.490 212.290 L 92.000 226.090 L 92.000 201.660 L 106.830 186.830 C 107.580 186.079 108.001 185.061 108.000 184.000 L 108.000 152.000 C 107.999 150.803 107.462 149.669 106.536 148.910 C 105.611 148.151 104.394 147.847 103.220 148.080 L 28.000 163.120 L 28.000 138.470 L 105.790 99.580 C 107.145 98.902 108.001 97.516 108.000 96.000 L 108.000 48.000 C 108.000 36.954 116.954 28.000 128.000 28.000 C 139.046 28.000 148.000 36.954 148.000 48.000 L 148.000 96.000 C 147.999 97.516 148.855 98.902 150.210 99.580 L 228.000 138.470 Z"),
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
        return _airplane!!
    }

private var _airplane: ImageVector? = null
