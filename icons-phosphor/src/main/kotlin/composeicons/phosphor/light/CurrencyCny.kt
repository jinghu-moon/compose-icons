package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyCny: ImageVector
    get() {
        if (_currencyCny != null) return _currencyCny!!
        _currencyCny = phosphorLightIcon(
            name = "CurrencyCny",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M58 56c0-3.314 2.686-6 6-6h128c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-128c-3.314 0-6-2.686-6-6ZM216 162c-3.314 0-6 2.686-6 6v18h-34c-9.941 0-18-8.059-18-18v-50h50c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-160c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h50v10c-.039 32.017-25.983 57.961-58 58-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 38.642-.044 69.956-31.358 70-70v-10h36v50c0 16.569 13.431 30 30 30h40c3.314 0 6-2.686 6-6v-24c0-3.314-2.686-6-6-6Z"),
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
        return _currencyCny!!
    }

private var _currencyCny: ImageVector? = null
