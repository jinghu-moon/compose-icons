package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Flag: ImageVector
    get() {
        if (_flag != null) return _flag!!
        _flag = phosphorDuotoneIcon(
            name = "Flag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 56v120C160 231.43 112 120.57 48 176v-120C112 .57 160 111.43 224 56Z"),
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
                pathData = parseSvgPathData("M42.76 50C41.019 51.509 40.013 53.696 40 56v168c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-44.23c26.79-21.16 49.87-9.75 76.45 3.41 16.4 8.11 34.06 16.85 53 16.85 13.93 0 28.54-4.75 43.82-18 1.741-1.509 2.747-3.696 2.76-6v-120.03c-.007-3.136-1.846-5.979-4.704-7.271-2.858-1.292-6.206-.795-8.566 1.271-28 24.23-51.72 12.49-79.21-1.12C111.07 34.76 78.78 18.79 42.76 50ZM216 172.25c-26.79 21.16-49.87 9.74-76.45-3.41C114.55 156.49 86.74 142.71 56 160.44v-100.65c26.79-21.16 49.87-9.75 76.45 3.4 25 12.35 52.82 26.13 83.55 8.4Z"),
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
        return _flag!!
    }

private var _flag: ImageVector? = null
