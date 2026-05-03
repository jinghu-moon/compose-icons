package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CodaLogo: ImageVector
    get() {
        if (_codaLogo != null) return _codaLogo!!
        _codaLogo = phosphorBoldIcon(
            name = "CodaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 92.000 C 182.850 91.931 189.577 93.829 195.380 97.470 C 200.304 100.619 206.552 100.832 211.680 98.027 C 216.807 95.222 219.997 89.844 220.000 84.000 L 220.000 48.000 C 220.000 36.954 211.046 28.000 200.000 28.000 L 56.000 28.000 C 44.954 28.000 36.000 36.954 36.000 48.000 L 36.000 208.000 C 36.000 219.046 44.954 228.000 56.000 228.000 L 200.000 228.000 C 211.046 228.000 220.000 219.046 220.000 208.000 L 220.000 172.000 C 219.996 166.160 216.810 160.787 211.689 157.981 C 206.568 155.174 200.324 155.381 195.400 158.520 C 188.820 162.740 183.510 164.280 176.480 164.000 L 176.000 164.000 C 156.118 164.000 140.000 147.882 140.000 128.000 C 140.000 108.118 156.118 92.000 176.000 92.000 ZM 175.760 188.000 C 182.638 188.340 189.516 187.320 196.000 185.000 L 196.000 204.000 L 60.000 204.000 L 60.000 52.000 L 196.000 52.000 L 196.000 71.300 C 189.562 69.102 182.803 67.987 176.000 68.000 C 142.863 67.934 115.946 94.743 115.880 127.880 C 115.814 161.017 142.623 187.934 175.760 188.000 Z"),
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
        return _codaLogo!!
    }

private var _codaLogo: ImageVector? = null
