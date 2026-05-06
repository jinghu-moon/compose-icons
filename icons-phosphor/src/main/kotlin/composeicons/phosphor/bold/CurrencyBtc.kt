package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyBtc: ImageVector
    get() {
        if (_currencyBtc != null) return _currencyBtc!!
        _currencyBtc = phosphorBoldIcon(
            name = "CurrencyBtc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M185.08 114.46c10.403-12.664 13.625-29.761 8.545-45.343C188.546 53.535 175.868 41.621 160 37.52v-13.52c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v12h-16v-12c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v12h-24C65.373 36 60 41.373 60 48c0 6.627 5.373 12 12 12h4v128h-4c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h24v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h16v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12c23.723-.01 44.432-16.075 50.34-39.051 5.908-22.976-4.484-47.037-25.26-58.489ZM172 84c0 13.255-10.745 24-24 24h-48v-48h48c13.255 0 24 10.745 24 24ZM160 188h-60v-56h60c15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28Z"),
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
