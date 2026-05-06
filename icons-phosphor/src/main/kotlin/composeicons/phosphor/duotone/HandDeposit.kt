package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HandDeposit: ImageVector
    get() {
        if (_handDeposit != null) return _handDeposit!!
        _handDeposit = phosphorDuotoneIcon(
            name = "HandDeposit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 96v106.31L173.32 186c-4.916-8.465-15.237-12.128-24.39-8.656-9.153 3.473-14.447 13.06-12.51 22.656h-80.42v-104c0-4.418 3.582-8 8-8h112c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M128 35.31v92.69c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-92.69L93.66 53.66c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32l32-32C115.841 8.838 117.877 7.994 120 7.994c2.123 0 4.159 .844 5.66 2.346l32 32c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0ZM192 123.62v-27.62c0-8.837-7.163-16-16-16h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v80.4c-9.871-10.084-25.703-11.246-36.942-2.713-11.238 8.533-14.37 24.096-7.308 36.313l.24 .38 22.26 34c2.419 3.698 7.377 4.734 11.075 2.315 3.698-2.419 4.734-7.377 2.315-11.075L145.51 201.83c-3.267-5.769-1.239-13.093 4.53-16.36 5.769-3.267 13.093-1.239 16.36 4.53 .07 .13 .15 .26 .23 .38l10.68 16.31c1.939 2.956 5.588 4.29 8.976 3.28 3.388-1.01 5.711-4.124 5.714-7.66v-58.31c15.243 14.11 23.936 33.919 24 54.69v41.31c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-41.35c-.092-30.089-15.069-58.183-40-75.03ZM80 80h-16C55.163 80 48 87.163 48 96v104c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-104h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _handDeposit!!
    }

private var _handDeposit: ImageVector? = null
