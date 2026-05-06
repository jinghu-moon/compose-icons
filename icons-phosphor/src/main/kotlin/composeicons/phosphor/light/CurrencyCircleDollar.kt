package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyCircleDollar: ImageVector
    get() {
        if (_currencyCircleDollar != null) return _currencyCircleDollar!!
        _currencyCircleDollar = phosphorLightIcon(
            name = "CurrencyCircleDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM166 148c0 14.359-11.641 26-26 26h-6v10c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-10h-18c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h36c7.732 0 14-6.268 14-14 0-7.732-6.268-14-14-14h-24C101.641 134 90 122.359 90 108 90 93.641 101.641 82 116 82h6v-10c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v10h18c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-36c-7.732 0-14 6.268-14 14 0 7.732 6.268 14 14 14h24c14.359 0 26 11.641 26 26Z"),
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
        return _currencyCircleDollar!!
    }

private var _currencyCircleDollar: ImageVector? = null
