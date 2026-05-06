package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.IdentificationBadge: ImageVector
    get() {
        if (_identificationBadge != null) return _identificationBadge!!
        _identificationBadge = phosphorThinIcon(
            name = "IdentificationBadge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M146.7 166.75c13.794-8.385 20.32-24.928 15.966-40.472C158.312 110.734 144.143 99.988 128 99.988c-16.143 0-30.312 10.746-34.666 26.29-4.354 15.544 2.172 32.087 15.966 40.472-12.995 3.951-24.384 11.959-32.5 22.85-1.325 1.767-.967 4.275 .8 5.6 1.767 1.325 4.275 .967 5.6-.8C93.776 180.299 110.374 172 128 172c17.626 0 34.224 8.299 44.8 22.4 1.325 1.767 3.833 2.125 5.6 .8 1.767-1.325 2.125-3.833 .8-5.6-8.118-10.889-19.506-18.896-32.5-22.85ZM100 136c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28ZM200 28h-144C49.373 28 44 33.373 44 40v176c0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12v-176c0-6.627-5.373-12-12-12ZM204 216c0 2.209-1.791 4-4 4h-144c-2.209 0-4-1.791-4-4v-176c0-2.209 1.791-4 4-4h144c2.209 0 4 1.791 4 4ZM92 64c0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-64c-2.209 0-4-1.791-4-4Z"),
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
        return _identificationBadge!!
    }

private var _identificationBadge: ImageVector? = null
