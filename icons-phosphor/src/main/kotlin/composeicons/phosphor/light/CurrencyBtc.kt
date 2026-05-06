package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyBtc: ImageVector
    get() {
        if (_currencyBtc != null) return _currencyBtc!!
        _currencyBtc = phosphorLightIcon(
            name = "CurrencyBtc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M174.69 116.41c13.391-11.038 18.614-29.174 13.146-45.644C182.367 54.297 167.333 42.887 150 42.05v-18.05c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v18h-20v-18c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v18h-34c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h10v140h-10c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h34v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h20v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h10c22.531-.002 41.744-16.323 45.39-38.557 3.646-22.234-9.35-43.836-30.7-51.033ZM178 84c0 16.569-13.431 30-30 30h-54v-60h54c16.569 0 30 13.431 30 30ZM160 194h-66v-68h66c18.778 0 34 15.222 34 34 0 18.778-15.222 34-34 34Z"),
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
