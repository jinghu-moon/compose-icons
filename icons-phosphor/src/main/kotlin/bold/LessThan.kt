package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LessThan: ImageVector
    get() {
        if (_lessThan != null) return _lessThan!!
        _lessThan = phosphorBoldIcon(
            name = "LessThan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 210.840 205.130 C 209.478 208.011 207.026 210.232 204.024 211.304 C 201.023 212.375 197.718 212.208 194.840 210.840 L 42.840 138.840 C 38.655 136.853 35.987 132.633 35.987 128.000 C 35.987 123.367 38.655 119.147 42.840 117.160 L 194.840 45.160 C 198.723 43.269 203.322 43.609 206.884 46.053 C 210.445 48.496 212.419 52.664 212.052 56.968 C 211.685 61.271 209.034 65.045 205.110 66.850 L 76.000 128.000 L 205.100 189.150 C 207.981 190.507 210.205 192.953 211.282 195.950 C 212.359 198.948 212.200 202.250 210.840 205.130 Z"),
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
        return _lessThan!!
    }

private var _lessThan: ImageVector? = null
