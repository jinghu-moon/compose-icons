package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandWithdraw: ImageVector
    get() {
        if (_handWithdraw != null) return _handWithdraw!!
        _handWithdraw = phosphorFillIcon(
            name = "HandWithdraw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 56h-16v-40c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM192 123.62v-51.62c0-8.837-7.163-16-16-16h-48v60.69L146.34 98.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32l-32 32c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346l-32-32c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L112 116.69v-60.69h-48C55.163 56 48 63.163 48 72v128c0 4.418 3.582 8 8 8h74.7c.32 .67 .67 1.34 1.05 2l.24 .38 22.26 34c2.419 3.698 7.377 4.734 11.075 2.315 3.698-2.419 4.734-7.377 2.315-11.075L145.51 201.83c-3.267-5.769-1.239-13.093 4.53-16.36 5.769-3.267 13.093-1.239 16.36 4.53 .07 .13 .15 .26 .23 .38l10.68 16.31c1.939 2.956 5.588 4.29 8.976 3.28 3.388-1.01 5.711-4.124 5.714-7.66v-58.31c15.243 14.11 23.936 33.919 24 54.69v41.31c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-41.35c-.092-30.089-15.069-58.183-40-75.03Z"),
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
        return _handWithdraw!!
    }

private var _handWithdraw: ImageVector? = null
