package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) return _textStrikethrough!!
        _textStrikethrough = phosphorFillIcon(
            name = "TextStrikethrough",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM82.71 94.58C86 76.57 104.58 64 128 64c18.2 0 33.59 7.41 41.18 19.83 2.303 3.772 1.112 8.697-2.66 11-3.772 2.303-8.697 1.112-11-2.66C150.94 84.66 140.39 80 128 80c-15.3 0-27.73 7.33-29.55 17.42-.686 3.804-3.994 6.574-7.86 6.58-.48 .001-.958-.043-1.43-.13-4.346-.786-7.233-4.944-6.45-9.29ZM192 136h-23.71c5.079 5.407 7.846 12.583 7.71 20 0 20.19-21.08 36-48 36C104.11 192 84.17 179.22 80.57 161.6c-.665-2.836 .265-5.809 2.427-7.762 2.162-1.953 5.214-2.576 7.968-1.627 2.754 .949 4.775 3.319 5.276 6.189 2 9.87 16 17.6 31.76 17.6 17.35 0 32-9.16 32-20 0-9.14-6.76-14.43-25.72-20h-70.28c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h128c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _textStrikethrough!!
    }

private var _textStrikethrough: ImageVector? = null
