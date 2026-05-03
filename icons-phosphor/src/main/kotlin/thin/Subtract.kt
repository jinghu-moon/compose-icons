package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Subtract: ImageVector
    get() {
        if (_subtract != null) return _subtract!!
        _subtract = phosphorThinIcon(
            name = "Subtract",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 171.170 84.820 C 165.423 46.163 131.294 18.166 92.259 20.088 C 53.224 22.010 22.010 53.224 20.088 92.259 C 18.166 131.294 46.163 165.423 84.820 171.170 C 90.567 209.827 124.696 237.824 163.731 235.902 C 202.766 233.980 233.980 202.766 235.902 163.731 C 237.824 124.696 209.827 90.567 171.170 84.820 ZM 228.000 160.000 C 227.995 164.387 227.570 168.764 226.730 173.070 L 169.390 115.730 C 171.121 109.296 171.999 102.663 172.000 96.000 C 172.000 95.000 172.000 94.000 171.930 93.060 C 204.416 98.762 228.083 127.018 228.000 160.000 ZM 146.810 152.460 L 205.140 210.800 C 198.399 216.798 190.533 221.397 182.000 224.330 L 124.220 166.550 C 132.517 163.213 140.163 158.443 146.810 152.460 ZM 152.460 146.810 C 158.444 140.160 163.214 132.511 166.550 124.210 L 224.330 182.000 C 221.398 190.537 216.799 198.406 210.800 205.150 ZM 28.000 96.000 C 28.000 58.445 58.445 28.000 96.000 28.000 C 133.555 28.000 164.000 58.445 164.000 96.000 C 164.000 133.555 133.555 164.000 96.000 164.000 C 58.461 163.961 28.039 133.539 28.000 96.000 ZM 93.060 171.930 C 94.060 171.930 95.060 172.000 96.000 172.000 C 102.663 171.999 109.296 171.121 115.730 169.390 L 173.070 226.730 C 168.764 227.570 164.387 227.995 160.000 228.000 C 127.018 228.083 98.762 204.416 93.060 171.930 Z"),
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
        return _subtract!!
    }

private var _subtract: ImageVector? = null
