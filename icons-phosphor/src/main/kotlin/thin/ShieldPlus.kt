package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShieldPlus: ImageVector
    get() {
        if (_shieldPlus != null) return _shieldPlus!!
        _shieldPlus = phosphorThinIcon(
            name = "ShieldPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 164.000 128.000 C 164.000 130.209 162.209 132.000 160.000 132.000 L 132.000 132.000 L 132.000 160.000 C 132.000 162.209 130.209 164.000 128.000 164.000 C 125.791 164.000 124.000 162.209 124.000 160.000 L 124.000 132.000 L 96.000 132.000 C 93.791 132.000 92.000 130.209 92.000 128.000 C 92.000 125.791 93.791 124.000 96.000 124.000 L 124.000 124.000 L 124.000 96.000 C 124.000 93.791 125.791 92.000 128.000 92.000 C 130.209 92.000 132.000 93.791 132.000 96.000 L 132.000 124.000 L 160.000 124.000 C 162.209 124.000 164.000 125.791 164.000 128.000 ZM 220.000 56.000 L 220.000 112.000 C 220.000 163.160 195.270 194.120 174.530 211.100 C 152.130 229.420 129.980 235.600 129.050 235.860 C 128.362 236.047 127.638 236.047 126.950 235.860 C 126.020 235.600 103.870 229.420 81.470 211.100 C 60.730 194.120 36.000 163.160 36.000 112.000 L 36.000 56.000 C 36.000 49.373 41.373 44.000 48.000 44.000 L 208.000 44.000 C 214.627 44.000 220.000 49.373 220.000 56.000 ZM 212.000 56.000 C 212.000 53.791 210.209 52.000 208.000 52.000 L 48.000 52.000 C 45.791 52.000 44.000 53.791 44.000 56.000 L 44.000 112.000 C 44.000 150.440 58.230 181.630 86.290 204.710 C 98.678 214.877 112.811 222.708 128.000 227.820 C 143.187 222.703 157.319 214.873 169.710 204.710 C 197.770 181.630 212.000 150.440 212.000 112.000 Z"),
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
        return _shieldPlus!!
    }

private var _shieldPlus: ImageVector? = null
