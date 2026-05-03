package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextB: ImageVector
    get() {
        if (_textB != null) return _textB!!
        _textB = phosphorLightIcon(
            name = "TextB",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 174.690 116.410 C 188.364 105.139 193.493 86.499 187.511 69.820 C 181.528 53.140 165.720 42.010 148.000 42.000 L 80.000 42.000 C 76.686 42.000 74.000 44.686 74.000 48.000 L 74.000 200.000 C 74.000 203.314 76.686 206.000 80.000 206.000 L 160.000 206.000 C 182.531 205.998 201.744 189.677 205.390 167.443 C 209.036 145.209 196.040 123.607 174.690 116.410 ZM 86.000 54.000 L 148.000 54.000 C 164.569 54.000 178.000 67.431 178.000 84.000 C 178.000 100.569 164.569 114.000 148.000 114.000 L 86.000 114.000 ZM 160.000 194.000 L 86.000 194.000 L 86.000 126.000 L 160.000 126.000 C 178.778 126.000 194.000 141.222 194.000 160.000 C 194.000 178.778 178.778 194.000 160.000 194.000 Z"),
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
        return _textB!!
    }

private var _textB: ImageVector? = null
