package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatCircleSlash: ImageVector
    get() {
        if (_chatCircleSlash != null) return _chatCircleSlash!!
        _chatCircleSlash = phosphorLightIcon(
            name = "ChatCircleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52.44 36c-2.277-2.113-5.79-2.139-8.098-.06-2.308 2.079-2.647 5.576-.782 8.06L55.07 56.7C23.77 88.698 16.989 137.364 38.35 176.7L26.73 211.56c-1.678 5.031-.369 10.578 3.381 14.329 3.75 3.75 9.297 5.059 14.329 3.381L79.31 217.65c36.195 19.634 80.645 15.579 112.69-10.28L203.56 220c2.231 2.452 6.028 2.631 8.48 .4 2.452-2.231 2.631-6.028 .4-8.48ZM128 218c-15.821 .004-31.363-4.163-45.06-12.08-1.489-.863-3.277-1.045-4.91-.5L40.65 217.88c-.719 .24-1.511 .053-2.047-.483-.536-.536-.723-1.328-.483-2.047L50.58 178c.545-1.633 .363-3.421-.5-4.91C29.987 138.351 35.323 94.507 63.16 65.6L184 198.47C168.086 211.138 148.341 218.025 128 218ZM230 128c-.002 16.858-4.173 33.454-12.14 48.31-1.049 1.944-3.081 3.154-5.29 3.15-2.11-.002-4.064-1.112-5.146-2.923-1.082-1.811-1.133-4.058-.134-5.917C225.327 137.013 220.236 95.687 194.58 67.463 168.924 39.24 128.27 30.241 93.1 45c-2.947 .918-6.109-.549-7.311-3.392C84.587 38.765 85.738 35.474 88.45 34c31.49-13.214 67.502-9.802 95.95 9.09C212.849 61.982 229.963 93.85 230 128Z"),
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
        return _chatCircleSlash!!
    }

private var _chatCircleSlash: ImageVector? = null
