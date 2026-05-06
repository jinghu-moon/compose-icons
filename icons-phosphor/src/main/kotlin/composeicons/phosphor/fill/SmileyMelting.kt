package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SmileyMelting: ImageVector
    get() {
        if (_smileyMelting != null) return _smileyMelting!!
        _smileyMelting = phosphorFillIcon(
            name = "SmileyMelting",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.6 176h-15.36C243.006 132.242 231.903 78.512 193.658 47.362 155.413 16.212 100.547 16.212 62.302 47.362 24.057 78.512 12.954 132.242 35.72 176h-15.32C13.758 175.919 8.26 181.143 8 187.78c-.059 3.221 1.179 6.33 3.436 8.628 2.257 2.298 5.343 3.593 8.564 3.592h60c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-7.84c-3.814-.007-7.13 2.616-8 6.33-.505 2.364 .087 4.83 1.61 6.708 1.523 1.878 3.813 2.967 6.23 2.962h127.73c4.281 .053 7.879-3.205 8.25-7.47 .147-2.212-.631-4.386-2.147-6.003-1.517-1.617-3.636-2.532-5.853-2.527h-55.98c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h7.79c4.083-.019 7.543-3.012 8.15-7.05 .272-2.27-.441-4.549-1.959-6.259C156.464 184.98 154.287 184.001 152 184h-16c-14.93 0-30.59-5.78-43-15.85C79.45 157.15 72 142.88 72 128c-.002-3.014 .236-6.023 .71-9 .625-4.312 4.51-7.385 8.85-7 2.183 .245 4.17 1.376 5.494 3.129 1.324 1.753 1.869 3.974 1.506 6.141-.37 2.224-.557 4.475-.56 6.73 0 22.16 26.26 40 48 40h15.44c13.5 0 24.86 11.05 24.55 24.55-.021 .947-.098 1.892-.23 2.83-.183 1.163 .157 2.348 .928 3.239 .771 .89 1.895 1.396 3.072 1.381h56.24c3.221 .001 6.307-1.294 8.564-3.592 2.257-2.298 3.495-5.407 3.436-8.628-.26-6.637-5.758-11.861-12.4-11.78ZM127.9 93.56c-.81 6.17-6.203 10.697-12.42 10.427-6.217-.271-11.196-5.249-11.467-11.467-.271-6.217 4.256-11.61 10.427-12.42 3.697-.485 7.41 .776 10.047 3.413 2.637 2.637 3.898 6.35 3.413 10.047ZM175.9 141.56c-.81 6.17-6.203 10.697-12.42 10.427-6.217-.271-11.196-5.249-11.467-11.467-.271-6.217 4.256-11.61 10.427-12.42 3.697-.485 7.41 .776 10.047 3.413 2.637 2.637 3.898 6.35 3.413 10.047Z"),
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
        return _smileyMelting!!
    }

private var _smileyMelting: ImageVector? = null
