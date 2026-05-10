package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextHSix: ImageVector
    get() {
        if (_textHSix != null) return _textHSix!!
        _textHSix = phosphorFillIcon(
            name = "TextHSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 152c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM224 48v160c0 8.837-7.163 16-16 16h-160c-8.837 0-16-7.163-16-16v-160C32 39.163 39.163 32 48 32h160c8.837 0 16 7.163 16 16ZM128 80c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v32h-40v-32c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v80c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-32h40v32c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8ZM208 152c0-17.673-14.327-32-32-32l11.55-20c2.209-3.827 .897-8.721-2.93-10.93-3.827-2.209-8.721-.897-10.93 2.93l-25.4 44-.14 .27c-6.611 11.682-5.228 26.248 3.462 36.478 8.69 10.23 22.841 13.949 35.438 9.314C199.647 177.427 208.013 165.423 208 152Z"),
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
        return _textHSix!!
    }

private var _textHSix: ImageVector? = null
