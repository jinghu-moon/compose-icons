package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FireSimple: ImageVector
    get() {
        if (_fireSimple != null) return _fireSimple!!
        _fireSimple = phosphorFillIcon(
            name = "FireSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 143.380 17.850 C 141.379 16.186 138.693 15.600 136.180 16.278 C 133.668 16.957 131.642 18.815 130.750 21.260 L 108.750 81.670 L 84.590 58.260 C 82.949 56.668 80.705 55.855 78.425 56.025 C 76.145 56.195 74.047 57.332 72.660 59.150 C 51.000 87.530 40.000 116.080 40.000 144.000 C 40.000 192.601 79.399 232.000 128.000 232.000 C 176.601 232.000 216.000 192.601 216.000 144.000 C 216.000 84.550 165.210 36.000 143.380 17.850 Z"),
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
        return _fireSimple!!
    }

private var _fireSimple: ImageVector? = null
