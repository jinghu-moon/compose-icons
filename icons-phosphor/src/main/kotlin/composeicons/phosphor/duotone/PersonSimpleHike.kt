package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PersonSimpleHike: ImageVector
    get() {
        if (_personSimpleHike != null) return _personSimpleHike!!
        _personSimpleHike = phosphorDuotoneIcon(
            name = "PersonSimpleHike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 48c0 13.255-10.745 24-24 24C138.745 72 128 61.255 128 48c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24ZM44 132l28 12L96 88 68 76Z"),
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
                pathData = parseSvgPathData("M152 80c17.673 0 32-14.327 32-32C184 30.327 169.673 16 152 16c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32ZM152 32c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM200 144v88c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-80.34c-25.75-2.25-34.35-15.52-42-27.36-2.85-4.39-5.56-8.57-9.13-12.19l-13.4 30.81 37.2 26.57c2.095 1.506 3.335 3.93 3.33 6.51v56c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-51.88L112.93 157.92 79.34 235.19C78.069 238.112 75.186 240.001 72 240c-1.099 .003-2.185-.226-3.19-.67-4.05-1.76-5.907-6.469-4.15-10.52L122.19 96.5c.883-2.029 2.566-3.602 4.65-4.344 2.084-.743 4.383-.589 6.35 .424 2.874 1.5 5.559 3.336 8 5.47 6.37 5.52 10.51 11.91 14.16 17.55 7.68 11.84 13.23 20.4 36.6 20.4 2.13-.013 4.178 .824 5.689 2.325 1.511 1.502 2.361 3.544 2.361 5.675ZM72 152c3.203 .003 6.099-1.906 7.36-4.85l24-56c1.738-4.059-.142-8.759-4.2-10.5l-28-12c-4.059-1.738-8.759 .142-10.5 4.2l-24 56c-1.738 4.059 .142 8.759 4.2 10.5l28 12c.992 .426 2.06 .647 3.14 .65ZM54.51 127.8 72.2 86.5l13.3 5.7L67.8 133.49Z"),
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
        return _personSimpleHike!!
    }

private var _personSimpleHike: ImageVector? = null
