package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Leaf: ImageVector
    get() {
        if (_leaf != null) return _leaf!!
        _leaf = phosphorThinIcon(
            name = "Leaf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 219.450 40.310 C 219.332 38.284 217.716 36.668 215.690 36.550 C 141.060 32.160 81.460 54.390 56.240 96.000 C 39.000 124.560 39.900 158.370 58.800 191.540 L 37.170 213.170 C 35.607 214.733 35.607 217.267 37.170 218.830 C 38.733 220.393 41.267 220.393 42.830 218.830 L 64.460 197.190 C 81.850 207.100 99.460 212.080 116.290 212.080 C 131.719 212.094 146.849 207.829 160.000 199.760 C 201.610 174.540 223.840 114.930 219.450 40.310 ZM 155.820 192.920 C 130.450 208.290 100.260 207.670 70.340 191.310 L 162.840 98.820 C 164.403 97.257 164.403 94.723 162.840 93.160 C 161.277 91.597 158.743 91.597 157.180 93.160 L 64.690 185.660 C 48.330 155.740 47.690 125.550 63.080 100.180 C 86.340 61.770 141.720 41.000 211.660 44.340 C 215.000 114.280 194.230 169.660 155.820 192.920 Z"),
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
        return _leaf!!
    }

private var _leaf: ImageVector? = null
