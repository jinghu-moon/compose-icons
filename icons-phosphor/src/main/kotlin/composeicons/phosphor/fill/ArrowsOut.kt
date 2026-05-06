package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsOut: ImageVector
    get() {
        if (_arrowsOut != null) return _arrowsOut!!
        _arrowsOut = phosphorFillIcon(
            name = "ArrowsOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M109.66 146.34c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66L83.31 184l18.35 18.34c2.291 2.288 2.976 5.731 1.737 8.722-1.239 2.991-4.159 4.94-7.397 4.938h-48c-4.418 0-8-3.582-8-8v-48c-.003-3.238 1.947-6.158 4.938-7.397 2.991-1.239 6.434-.554 8.722 1.737L72 172.69 98.34 146.34c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346ZM83.31 72 101.66 53.66c2.291-2.288 2.976-5.731 1.737-8.722C102.158 41.947 99.238 39.997 96 40h-48c-4.418 0-8 3.582-8 8v48c-.003 3.238 1.947 6.158 4.938 7.397 2.991 1.239 6.434 .554 8.722-1.737L72 83.31l26.34 26.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32ZM208 40h-48c-3.238-.003-6.158 1.947-7.397 4.938-1.239 2.991-.554 6.434 1.737 8.722L172.69 72 146.34 98.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L184 83.31l18.34 18.35c2.288 2.291 5.731 2.976 8.722 1.737 2.991-1.239 4.94-4.159 4.938-7.397v-48c0-4.418-3.582-8-8-8ZM211.06 152.61c-2.989-1.24-6.431-.557-8.72 1.73L184 172.69 157.66 146.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L172.69 184l-18.35 18.34c-2.291 2.288-2.976 5.731-1.737 8.722 1.239 2.991 4.159 4.94 7.397 4.938h48c4.418 0 8-3.582 8-8v-48c-.001-3.236-1.95-6.152-4.94-7.39Z"),
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
        return _arrowsOut!!
    }

private var _arrowsOut: ImageVector? = null
