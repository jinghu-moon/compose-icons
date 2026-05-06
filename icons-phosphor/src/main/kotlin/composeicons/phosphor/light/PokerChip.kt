package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PokerChip: ImageVector
    get() {
        if (_pokerChip != null) return _pokerChip!!
        _pokerChip = phosphorLightIcon(
            name = "PokerChip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 178C100.386 178 78 155.614 78 128c0-27.614 22.386-50 50-50 27.614 0 50 22.386 50 50-.033 27.601-22.399 49.967-50 50ZM167.37 80.14C157.877 72.3 146.255 67.479 134 66.3v-28.1c19.688 1.305 38.395 9.07 53.22 22.09ZM122 66.3C109.745 67.479 98.123 72.3 88.63 80.14L68.78 60.29C83.605 47.27 102.312 39.505 122 38.2ZM80.14 88.63C72.3 98.123 67.479 109.745 66.3 122h-28.1C39.503 102.312 47.268 83.604 60.29 68.78ZM66.3 134c1.179 12.255 6 23.877 13.84 33.37L60.29 187.22C47.268 172.396 39.503 153.688 38.2 134ZM88.63 175.86c9.493 7.84 21.115 12.661 33.37 13.84v28.1C102.312 216.495 83.605 208.73 68.78 195.71ZM134 189.7c12.255-1.179 23.877-6 33.37-13.84l19.85 19.85C172.395 208.73 153.688 216.495 134 217.8ZM175.86 167.37c7.84-9.493 12.661-21.115 13.84-33.37h28.1c-1.303 19.688-9.068 38.396-22.09 53.22ZM189.7 122C188.521 109.745 183.7 98.123 175.86 88.63L195.71 68.78c13.022 14.824 20.787 33.532 22.09 53.22Z"),
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
        return _pokerChip!!
    }

private var _pokerChip: ImageVector? = null
