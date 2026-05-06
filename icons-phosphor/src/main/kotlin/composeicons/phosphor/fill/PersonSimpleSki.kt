package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleSki: ImageVector
    get() {
        if (_personSimpleSki != null) return _personSimpleSki!!
        _personSimpleSki = phosphorFillIcon(
            name = "PersonSimpleSki",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 60c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28C156.536 88 144 75.464 144 60ZM37.76 87.68l111 32.36 5.61 5.61c1.493 1.496 3.517 2.341 5.63 2.35h40c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-36.69l-4.72-4.72h0L133.69 82.38c-1.501-1.502-3.537-2.346-5.66-2.346-2.123 0-4.159 .844-5.66 2.346L112 92.67 42.24 72.32c-4.242-1.237-8.683 1.198-9.92 5.44-1.237 4.242 1.198 8.683 5.44 9.92ZM238.66 193.15c-1.177-1.767-3.008-2.994-5.09-3.411-2.082-.416-4.244 .012-6.01 1.191-13.239 8.849-29.718 11.375-45 6.9L119.77 179.55l29.9-29.9c2.005-2.004 2.799-4.92 2.088-7.664-.711-2.744-2.822-4.907-5.548-5.686l-56-16c-4.25-1.215-8.68 1.245-9.895 5.495-1.215 4.25 1.245 8.68 5.495 9.895L128.73 148l-26.5 26.49L26.23 152.36c-4.242-1.237-8.683 1.198-9.92 5.44-1.237 4.242 1.198 8.683 5.44 9.92l156.31 45.52c19.822 5.802 41.197 2.525 58.37-8.95 1.78-1.176 3.017-3.014 3.436-5.105 .419-2.092-.015-4.264-1.206-6.035Z"),
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
        return _personSimpleSki!!
    }

private var _personSimpleSki: ImageVector? = null
