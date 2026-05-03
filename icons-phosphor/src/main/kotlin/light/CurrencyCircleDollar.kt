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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 166.000 148.000 C 166.000 162.359 154.359 174.000 140.000 174.000 L 134.000 174.000 L 134.000 184.000 C 134.000 187.314 131.314 190.000 128.000 190.000 C 124.686 190.000 122.000 187.314 122.000 184.000 L 122.000 174.000 L 104.000 174.000 C 100.686 174.000 98.000 171.314 98.000 168.000 C 98.000 164.686 100.686 162.000 104.000 162.000 L 140.000 162.000 C 147.732 162.000 154.000 155.732 154.000 148.000 C 154.000 140.268 147.732 134.000 140.000 134.000 L 116.000 134.000 C 101.641 134.000 90.000 122.359 90.000 108.000 C 90.000 93.641 101.641 82.000 116.000 82.000 L 122.000 82.000 L 122.000 72.000 C 122.000 68.686 124.686 66.000 128.000 66.000 C 131.314 66.000 134.000 68.686 134.000 72.000 L 134.000 82.000 L 152.000 82.000 C 155.314 82.000 158.000 84.686 158.000 88.000 C 158.000 91.314 155.314 94.000 152.000 94.000 L 116.000 94.000 C 108.268 94.000 102.000 100.268 102.000 108.000 C 102.000 115.732 108.268 122.000 116.000 122.000 L 140.000 122.000 C 154.359 122.000 166.000 133.641 166.000 148.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _currencyCircleDollar!!
    }

private var _currencyCircleDollar: ImageVector? = null
