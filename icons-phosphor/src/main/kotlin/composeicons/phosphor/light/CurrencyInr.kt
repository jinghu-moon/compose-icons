package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyInr: ImageVector
    get() {
        if (_currencyInr != null) return _currencyInr!!
        _currencyInr = phosphorLightIcon(
            name = "CurrencyInr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M206 80c0 3.314-2.686 6-6 6h-34.31c.205 1.993 .308 3.996 .31 6-.039 32.017-25.983 57.961-58 58h-20.48L164 219.56c2.452 2.231 2.631 6.028 .4 8.48-2.231 2.452-6.028 2.631-8.48 .4l-88-80c-1.841-1.673-2.458-4.308-1.553-6.624 .905-2.316 3.146-3.834 5.633-3.816h36c25.391-.033 45.967-20.609 46-46-.007-2.006-.14-4.01-.4-6h-81.6c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h78.33C143.094 57.037 126.442 46.022 108 46h-36c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h128c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-56.73c9.282 7.126 16.203 16.884 19.86 28h36.87c3.314 0 6 2.686 6 6Z"),
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
        return _currencyInr!!
    }

private var _currencyInr: ImageVector? = null
