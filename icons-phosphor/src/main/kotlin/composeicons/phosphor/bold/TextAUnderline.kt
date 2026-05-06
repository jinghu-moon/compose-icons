package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextAUnderline: ImageVector
    get() {
        if (_textAUnderline != null) return _textAUnderline!!
        _textAUnderline = phosphorBoldIcon(
            name = "TextAUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M58.89 178.86c2.883 1.365 6.192 1.526 9.194 .447 3.002-1.079 5.451-3.309 6.806-6.197L90.44 140h75.12l15.58 33.11c2.822 5.998 9.972 8.572 15.97 5.75 5.998-2.822 8.572-9.972 5.75-15.97l-64-136C136.882 22.682 132.65 19.995 128 19.995c-4.65 0-8.882 2.687-10.86 6.895l-64 136c-1.356 2.88-1.512 6.181-.433 9.176 1.078 2.995 3.303 5.439 6.183 6.794ZM128 60.18 154.27 116h-52.54ZM228 216c0 6.627-5.373 12-12 12h-176c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h176c6.627 0 12 5.373 12 12Z"),
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
