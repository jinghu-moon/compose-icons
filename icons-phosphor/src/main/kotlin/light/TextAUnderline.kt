package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextAUnderline: ImageVector
    get() {
        if (_textAUnderline != null) return _textAUnderline!!
        _textAUnderline = phosphorLightIcon(
            name = "TextAUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 61.450 173.430 C 62.892 174.112 64.547 174.192 66.048 173.652 C 67.549 173.111 68.774 171.995 69.450 170.550 L 86.630 134.000 L 169.370 134.000 L 186.570 170.550 C 187.558 172.655 189.674 174.000 192.000 174.000 C 192.882 174.002 193.753 173.808 194.550 173.430 C 195.995 172.754 197.111 171.529 197.652 170.028 C 198.192 168.527 198.112 166.872 197.430 165.430 L 133.430 29.430 C 132.441 27.326 130.325 25.982 128.000 25.982 C 125.675 25.982 123.559 27.326 122.570 29.430 L 58.570 165.430 C 57.888 166.872 57.808 168.527 58.348 170.028 C 58.889 171.529 60.005 172.754 61.450 173.430 ZM 128.000 46.090 L 163.720 122.000 L 92.280 122.000 ZM 222.000 216.000 C 222.000 219.314 219.314 222.000 216.000 222.000 L 40.000 222.000 C 36.686 222.000 34.000 219.314 34.000 216.000 C 34.000 212.686 36.686 210.000 40.000 210.000 L 216.000 210.000 C 219.314 210.000 222.000 212.686 222.000 216.000 Z"),
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
        return _textAUnderline!!
    }

private var _textAUnderline: ImageVector? = null
