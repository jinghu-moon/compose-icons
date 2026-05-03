package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Egg: ImageVector
    get() {
        if (_egg != null) return _egg!!
        _egg = phosphorThinIcon(
            name = "Egg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 92.870 20.000 44.000 86.520 44.000 152.000 C 44.000 198.392 81.608 236.000 128.000 236.000 C 174.392 236.000 212.000 198.392 212.000 152.000 C 212.000 86.520 163.130 20.000 128.000 20.000 ZM 128.000 228.000 C 86.045 227.956 52.044 193.955 52.000 152.000 C 52.000 123.540 62.000 92.270 79.330 66.220 C 94.810 43.000 113.910 28.000 128.000 28.000 C 142.090 28.000 161.190 43.000 176.670 66.220 C 194.000 92.270 204.000 123.540 204.000 152.000 C 203.956 193.955 169.955 227.956 128.000 228.000 Z"),
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
        return _egg!!
    }

private var _egg: ImageVector? = null
