package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PokerChip: ImageVector
    get() {
        if (_pokerChip != null) return _pokerChip!!
        _pokerChip = phosphorBoldIcon(
            name = "PokerChip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 164C108.118 164 92 147.882 92 128c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36ZM161.06 78C154.673 73.739 147.521 70.754 140 69.21v-24.34c13.891 1.994 27.056 7.456 38.28 15.88ZM116 69.21C108.479 70.754 101.327 73.739 94.94 78L77.72 60.75C88.944 52.326 102.109 46.864 116 44.87ZM78 94.94c-4.261 6.387-7.246 13.539-8.79 21.06h-24.34C46.866 102.109 52.327 88.945 60.75 77.72ZM69.21 140c1.544 7.521 4.529 14.673 8.79 21.06L60.75 178.28C52.327 167.055 46.866 153.891 44.87 140ZM94.94 178c6.387 4.261 13.539 7.246 21.06 8.79v24.34C102.109 209.136 88.944 203.674 77.72 195.25ZM140 186.79c7.521-1.544 14.673-4.529 21.06-8.79l17.22 17.22c-11.221 8.435-24.386 13.907-38.28 15.91ZM178 161.06c4.261-6.387 7.246-13.539 8.79-21.06h24.34c-1.996 13.891-7.457 27.055-15.88 38.28ZM186.79 116C185.246 108.479 182.261 101.327 178 94.94L195.22 77.72c8.433 11.222 13.905 24.387 15.91 38.28Z"),
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
