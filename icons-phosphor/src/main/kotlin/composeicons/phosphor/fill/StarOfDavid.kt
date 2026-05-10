package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.StarOfDavid: ImageVector
    get() {
        if (_starOfDavid != null) return _starOfDavid!!
        _starOfDavid = phosphorFillIcon(
            name = "StarOfDavid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M201.21 128 231 76c1.436-2.486 1.429-5.551-.018-8.031C229.536 65.489 226.871 63.974 224 64h-59.35L135 12C133.577 9.503 130.924 7.962 128.05 7.962c-2.874 0-5.527 1.541-6.95 4.038L91.33 64h-59.33c-2.862-.008-5.51 1.514-6.945 3.991-1.434 2.477-1.436 5.531-.005 8.009l29.72 52L25.05 180c-1.436 2.486-1.429 5.551 .018 8.031 1.447 2.48 4.111 3.995 6.982 3.969h59.28l29.72 52c1.423 2.497 4.076 4.038 6.95 4.038 2.874 0 5.527-1.541 6.95-4.038l29.7-52h59.35c2.871 .026 5.536-1.489 6.982-3.969 1.447-2.48 1.453-5.545 .018-8.031ZM182.79 128l-27.42 48h-54.75L73.2 128 100.62 80h54.75Z"),
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
        return _starOfDavid!!
    }

private var _starOfDavid: ImageVector? = null
