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
                pathData = parseSvgPathData("M 220.720 124.290 L 132.720 12.290 C 131.583 10.841 129.842 9.994 128.000 9.994 C 126.158 9.994 124.417 10.841 123.280 12.290 L 35.280 124.290 C 33.567 126.467 33.567 129.533 35.280 131.710 L 123.280 243.710 C 124.417 245.159 126.158 246.006 128.000 246.006 C 129.842 246.006 131.583 245.159 132.720 243.710 L 220.720 131.710 C 222.433 129.533 222.433 126.467 220.720 124.290 ZM 134.000 33.350 L 206.560 125.700 L 134.000 158.700 ZM 122.000 158.680 L 49.440 125.680 L 122.000 33.350 ZM 122.000 171.860 L 122.000 222.650 L 59.920 143.650 ZM 134.000 171.860 L 196.080 143.650 L 134.000 222.650 Z"),
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
