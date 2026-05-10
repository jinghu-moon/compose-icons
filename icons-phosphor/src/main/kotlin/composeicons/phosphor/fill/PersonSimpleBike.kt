package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleBike: ImageVector
    get() {
        if (_personSimpleBike != null) return _personSimpleBike!!
        _personSimpleBike = phosphorFillIcon(
            name = "PersonSimpleBike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 52c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28C148.536 80 136 67.464 136 52ZM240 176c0 22.091-17.909 40-40 40-22.091 0-40-17.909-40-40 0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40ZM224 176c0-13.255-10.745-24-24-24-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24ZM200 112c0-4.418-3.582-8-8-8h-36.69L125.66 74.34C124.159 72.838 122.123 71.994 120 71.994c-2.123 0-4.159 .844-5.66 2.346l-32 32c-1.502 1.501-2.346 3.537-2.346 5.66 0 2.123 .844 4.159 2.346 5.66L120 155.31v44.69c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48c.002-2.122-.84-4.158-2.34-5.66L99.31 112 120 91.31l26.34 26.35c1.502 1.5 3.538 2.342 5.66 2.34h40c4.418 0 8-3.582 8-8ZM96 176c0 22.091-17.909 40-40 40C33.909 216 16 198.091 16 176c0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40ZM80 176C80 162.745 69.255 152 56 152c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24Z"),
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
        return _personSimpleBike!!
    }

private var _personSimpleBike: ImageVector? = null
