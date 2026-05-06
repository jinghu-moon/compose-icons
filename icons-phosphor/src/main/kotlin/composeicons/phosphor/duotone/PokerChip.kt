package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PokerChip: ImageVector
    get() {
        if (_pokerChip != null) return _pokerChip!!
        _pokerChip = phosphorDuotoneIcon(
            name = "PokerChip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 32C74.981 32 32 74.981 32 128c0 53.019 42.981 96 96 96 53.019 0 96-42.981 96-96C224 74.981 181.019 32 128 32ZM128 184C97.072 184 72 158.928 72 128 72 97.072 97.072 72 128 72c30.928 0 56 25.072 56 56 0 30.928-25.072 56-56 56Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 176C101.49 176 80 154.51 80 128c0-26.51 21.49-48 48-48 26.51 0 48 21.49 48 48-.028 26.498-21.502 47.972-48 48ZM167.21 77.47C158.169 70.403 147.385 65.911 136 64.47v-24.1c17.753 1.599 34.596 8.576 48.28 20ZM120 64.52c-11.385 1.441-22.169 5.933-31.21 13L71.72 60.4C85.404 48.976 102.247 41.999 120 40.4ZM77.47 88.79c-7.067 9.041-11.559 19.825-13 31.21h-24.1c1.599-17.753 8.576-34.596 20-48.28ZM64.52 136c1.441 11.385 5.933 22.169 13 31.21L60.4 184.28C48.976 170.596 41.999 153.753 40.4 136ZM88.79 178.53c9.047 7.049 19.83 11.524 31.21 12.95v24.15c-17.753-1.599-34.596-8.576-48.28-20ZM136 191.48c11.38-1.426 22.163-5.901 31.21-12.95l17.07 17.07c-13.684 11.424-30.527 18.401-48.28 20ZM178.53 167.21c7.049-9.047 11.524-19.83 12.95-31.21h24.15c-1.599 17.753-8.576 34.596-20 48.28ZM191.48 120C190.054 108.62 185.579 97.837 178.53 88.79L195.6 71.72c11.424 13.684 18.401 30.527 20 48.28Z"),
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
