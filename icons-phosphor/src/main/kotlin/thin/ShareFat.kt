package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShareFat: ImageVector
    get() {
        if (_shareFat != null) return _shareFat!!
        _shareFat = phosphorThinIcon(
            name = "ShareFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 234.830 109.170 L 154.830 29.170 C 153.686 28.025 151.964 27.682 150.469 28.302 C 148.973 28.921 147.999 30.381 148.000 32.000 L 148.000 76.090 C 94.000 78.530 27.570 129.640 20.060 195.090 C 19.628 198.521 21.486 201.832 24.640 203.250 C 25.706 203.755 26.870 204.018 28.050 204.020 C 30.251 204.014 32.349 203.089 33.840 201.470 L 33.840 201.470 C 45.370 189.200 87.130 149.740 148.000 148.070 L 148.000 192.000 C 147.999 193.619 148.973 195.079 150.469 195.698 C 151.964 196.318 153.686 195.975 154.830 194.830 L 234.830 114.830 C 235.581 114.080 236.003 113.062 236.003 112.000 C 236.003 110.938 235.581 109.920 234.830 109.170 ZM 156.000 182.330 L 156.000 144.000 C 156.000 141.791 154.209 140.000 152.000 140.000 C 124.610 140.000 97.920 147.170 72.660 161.300 C 56.125 170.573 41.071 182.269 28.000 196.000 L 30.920 198.740 L 28.000 196.000 C 31.360 166.790 47.550 138.520 73.600 116.430 C 97.530 96.110 126.830 84.000 152.000 84.000 C 154.209 84.000 156.000 82.209 156.000 80.000 L 156.000 41.660 L 226.340 112.000 Z"),
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
        return _shareFat!!
    }

private var _shareFat: ImageVector? = null
