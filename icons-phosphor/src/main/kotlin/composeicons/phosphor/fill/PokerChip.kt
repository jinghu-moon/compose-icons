package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PokerChip: ImageVector
    get() {
        if (_pokerChip != null) return _pokerChip!!
        _pokerChip = phosphorFillIcon(
            name = "PokerChip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM60.4 71.72 77.47 88.79c-7.067 9.041-11.559 19.825-13 31.21h-24.1C41.978 102.243 48.966 85.4 60.4 71.72ZM40.37 136h24.15c1.441 11.385 5.933 22.169 13 31.21L60.4 184.28C48.966 170.6 41.978 153.757 40.37 136ZM120 215.63c-17.753-1.599-34.596-8.576-48.28-20L88.79 178.56c9.05 7.038 19.833 11.502 31.21 12.92ZM120 64.52c-11.385 1.441-22.169 5.933-31.21 13L71.72 60.4C85.404 48.976 102.247 41.999 120 40.4ZM215.63 120h-24.15C190.054 108.62 185.579 97.837 178.53 88.79L195.6 71.72c11.434 13.68 18.422 30.523 20.03 48.28ZM136 40.37c17.753 1.599 34.596 8.576 48.28 20L167.21 77.47C158.169 70.403 147.385 65.911 136 64.47ZM136 215.63v-24.15c11.38-1.426 22.163-5.901 31.21-12.95l17.07 17.07C170.6 207.034 153.757 214.022 136 215.63ZM195.6 184.28 178.53 167.21c7.049-9.047 11.524-19.83 12.95-31.21h24.15c-1.608 17.757-8.596 34.6-20.03 48.28Z"),
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
