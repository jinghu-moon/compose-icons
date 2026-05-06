package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextTSlash: ImageVector
    get() {
        if (_textTSlash != null) return _textTSlash!!
        _textTSlash = phosphorFillIcon(
            name = "TextTSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM128 72h48c4.418 0 8 3.582 8 8v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-8h-40c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM189.27 198c-1.597 1.398-3.683 2.104-5.8 1.964-2.117-.141-4.092-1.117-5.49-2.714l-42-48v26.75h12c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-39.98c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h12v-45L88 94.43v1.57c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16c.001-1.075 .215-2.139 .63-3.13L66 69.27C63.401 65.929 63.855 61.141 67.035 58.347c3.181-2.794 7.987-2.626 10.965 .383L190 186.73c2.903 3.316 2.576 8.356-.73 11.27Z"),
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
        return _textTSlash!!
    }

private var _textTSlash: ImageVector? = null
