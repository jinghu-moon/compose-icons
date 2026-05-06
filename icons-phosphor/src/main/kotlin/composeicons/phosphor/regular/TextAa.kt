package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextAa: ImageVector
    get() {
        if (_textAa != null) return _textAa!!
        _textAa = phosphorRegularIcon(
            name = "TextAa",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M87.24 52.59C85.921 49.784 83.1 47.993 80 47.993c-3.1 0-5.921 1.791-7.24 4.597L8.76 188.59c-1.881 3.999-.164 8.764 3.835 10.645 3.999 1.881 8.764 .164 10.645-3.835L39.9 160h80.2l16.66 35.4c1.881 3.999 6.646 5.716 10.645 3.835 3.999-1.881 5.716-6.646 3.835-10.645ZM47.43 144 80 74.79 112.57 144ZM200 96c-12.76 0-22.73 3.47-29.63 10.32-3.004 3.132-2.964 8.088 .091 11.17 3.055 3.082 8.01 3.167 11.169 .19 3.8-3.77 10-5.68 18.37-5.68 13.23 0 24 9 24 20v3.22c-7.099-4.75-15.458-7.264-24-7.22-22.06 0-40 16.15-40 36 0 19.85 17.94 36 40 36 8.545 .037 16.905-2.488 24-7.25 .207 4.418 3.957 7.832 8.375 7.625 4.418-.207 7.832-3.957 7.625-8.375v-60C240 112.15 222.06 96 200 96ZM200 184c-13.23 0-24-9-24-20 0-11 10.77-20 24-20 13.23 0 24 9 24 20 0 11-10.77 20-24 20Z"),
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
        return _textAa!!
    }

private var _textAa: ImageVector? = null
