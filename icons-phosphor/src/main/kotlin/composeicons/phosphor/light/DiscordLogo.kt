package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DiscordLogo: ImageVector
    get() {
        if (_discordLogo != null) return _discordLogo!!
        _discordLogo = phosphorLightIcon(
            name = "DiscordLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M102 140c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM164 130c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM237.64 191.08l-67 29.71c-1.82 .796-3.784 1.208-5.77 1.21-5.9 .006-11.183-3.654-13.25-9.18L143 189.43c-4.93 .37-9.92 .58-15 .58-5.08 0-10.06-.21-15-.58l-8.63 23.39c-2.066 5.523-7.344 9.182-13.24 9.18-1.986-.002-3.95-.414-5.77-1.21l-67-29.71c-6.233-2.751-9.581-9.59-7.93-16.2L40 58.5c1.385-5.406 5.834-9.482 11.34-10.39L87.4 42.19c7.213-1.173 14.138 3.323 16 10.39l3.69 14.53c13.901-1.48 27.919-1.48 41.82 0l3.69-14.53c1.862-7.067 8.787-11.563 16-10.39l36.06 5.92c5.506 .908 9.955 4.984 11.34 10.39l29.53 116.38c1.656 6.6-1.673 13.435-7.89 16.2ZM233.94 177.83 204.41 61.45c-.22-.792-.887-1.38-1.7-1.5L166.65 54c-1.071-.192-2.115 .455-2.42 1.5l-3.36 13.24c5.643 .969 11.234 2.224 16.75 3.76 2.951 .758 4.866 3.608 4.452 6.627-.414 3.019-3.025 5.248-6.072 5.183-.548 .002-1.094-.076-1.62-.23C159.264 79.978 143.663 77.933 128 78c-15.663-.067-31.264 1.978-46.38 6.08-2.084 .644-4.353 .107-5.927-1.404C74.119 81.166 73.489 78.92 74.048 76.812c.558-2.109 2.217-3.748 4.332-4.282 5.516-1.536 11.107-2.791 16.75-3.76L91.77 55.53C91.482 54.47 90.431 53.806 89.35 54L53.29 60c-.813 .12-1.48 .708-1.7 1.5L22.06 177.83c-.213 .94 .274 1.899 1.16 2.28l67 29.7c.561 .246 1.199 .246 1.76 0 .524-.217 .936-.64 1.14-1.17l7.58-20.55c-7.538-1.049-14.998-2.599-22.33-4.64-2.115-.534-3.774-2.173-4.332-4.282-.558-2.109 .071-4.354 1.645-5.865 1.574-1.51 3.843-2.048 5.927-1.404 15.119 4.11 30.723 6.161 46.39 6.1 15.663 .067 31.264-1.978 46.38-6.08 2.084-.644 4.353-.107 5.927 1.404 1.574 1.51 2.204 3.756 1.645 5.865-.558 2.109-2.217 3.748-4.332 4.282-7.332 2.041-14.792 3.591-22.33 4.64l7.58 20.55c.204 .53 .616 .953 1.14 1.17 .561 .246 1.199 .246 1.76 0l67-29.7c.899-.379 1.393-1.351 1.17-2.3Z"),
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
        return _discordLogo!!
    }

private var _discordLogo: ImageVector? = null
