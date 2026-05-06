package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PersonSimpleBike: ImageVector
    get() {
        if (_personSimpleBike != null) return _personSimpleBike!!
        _personSimpleBike = phosphorRegularIcon(
            name = "PersonSimpleBike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 80c15.464 0 28-12.536 28-28C192 36.536 179.464 24 164 24c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28ZM164 40c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM200 136c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40 0-22.091-17.909-40-40-40ZM200 200c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM56 136c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40C96 153.909 78.091 136 56 136ZM56 200C42.745 200 32 189.255 32 176c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM192 120h-40c-2.122 .002-4.158-.84-5.66-2.34L120 91.31 99.31 112l34.35 34.34c1.5 1.502 2.342 3.538 2.34 5.66v48c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-44.69L82.34 117.66C80.838 116.159 79.994 114.123 79.994 112c0-2.123 .844-4.159 2.346-5.66l32-32c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346L155.31 104h36.69c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
