package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShieldChevron: ImageVector
    get() {
        if (_shieldChevron != null) return _shieldChevron!!
        _shieldChevron = phosphorThinIcon(
            name = "ShieldChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 44.000 L 48.000 44.000 C 41.373 44.000 36.000 49.373 36.000 56.000 L 36.000 112.000 C 36.000 163.160 60.730 194.120 81.470 211.100 C 103.870 229.420 126.020 235.600 126.950 235.860 C 127.638 236.047 128.362 236.047 129.050 235.860 C 129.980 235.600 152.130 229.420 174.530 211.100 C 195.270 194.100 220.000 163.160 220.000 112.000 L 220.000 56.000 C 220.000 49.373 214.627 44.000 208.000 44.000 ZM 169.710 204.710 C 157.319 214.873 143.187 222.703 128.000 227.820 C 112.811 222.708 98.678 214.877 86.290 204.710 C 75.408 195.877 66.230 185.131 59.210 173.000 L 128.000 124.880 L 196.790 173.000 C 189.770 185.131 180.592 195.877 169.710 204.710 ZM 212.000 112.000 C 212.000 132.000 208.150 150.000 200.540 165.890 L 130.290 116.720 C 128.914 115.759 127.086 115.759 125.710 116.720 L 55.460 165.890 C 47.850 150.000 44.000 132.000 44.000 112.000 L 44.000 56.000 C 44.000 53.791 45.791 52.000 48.000 52.000 L 208.000 52.000 C 210.209 52.000 212.000 53.791 212.000 56.000 Z"),
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
        return _shieldChevron!!
    }

private var _shieldChevron: ImageVector? = null
