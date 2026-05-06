package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyEth: ImageVector
    get() {
        if (_currencyEth != null) return _currencyEth!!
        _currencyEth = phosphorLightIcon(
            name = "CurrencyEth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.72 124.29l-88-112C131.583 10.841 129.842 9.994 128 9.994c-1.842 0-3.583 .846-4.72 2.296l-88 112c-1.713 2.177-1.713 5.243 0 7.42l88 112c1.137 1.449 2.878 2.296 4.72 2.296 1.842 0 3.583-.846 4.72-2.296l88-112c1.713-2.177 1.713-5.243 0-7.42ZM134 33.35l72.56 92.35-72.56 33ZM122 158.68 49.44 125.68 122 33.35ZM122 171.86v50.79l-62.08-79ZM134 171.86l62.08-28.21-62.08 79Z"),
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
        return _currencyEth!!
    }

private var _currencyEth: ImageVector? = null
