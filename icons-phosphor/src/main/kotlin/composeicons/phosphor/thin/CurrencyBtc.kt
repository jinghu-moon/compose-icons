package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyBtc: ImageVector
    get() {
        if (_currencyBtc != null) return _currencyBtc!!
        _currencyBtc = phosphorThinIcon(
            name = "CurrencyBtc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M170.27 117.21c14.611-9.809 21.094-28.015 15.973-44.851C181.121 55.523 165.598 44.011 148 44v-20c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v20h-24v-20c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v20h-36c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h12v144h-12c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h36v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h24v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h12c22.309 .011 41.096-16.675 43.717-38.829 2.622-22.154-11.752-42.765-33.447-47.961ZM92 52h56c17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32h-56ZM160 196h-68v-72h68c19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36Z"),
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
        return _currencyBtc!!
    }

private var _currencyBtc: ImageVector? = null
