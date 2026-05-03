package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyKzt: ImageVector
    get() {
        if (_currencyKzt != null) return _currencyKzt!!
        _currencyKzt = phosphorFillIcon(
            name = "CurrencyKzt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 176.000 120.000 L 136.000 120.000 L 136.000 192.000 C 136.000 196.418 132.418 200.000 128.000 200.000 C 123.582 200.000 120.000 196.418 120.000 192.000 L 120.000 120.000 L 80.000 120.000 C 75.582 120.000 72.000 116.418 72.000 112.000 C 72.000 107.582 75.582 104.000 80.000 104.000 L 176.000 104.000 C 180.418 104.000 184.000 107.582 184.000 112.000 C 184.000 116.418 180.418 120.000 176.000 120.000 ZM 176.000 88.000 L 80.000 88.000 C 75.582 88.000 72.000 84.418 72.000 80.000 C 72.000 75.582 75.582 72.000 80.000 72.000 L 176.000 72.000 C 180.418 72.000 184.000 75.582 184.000 80.000 C 184.000 84.418 180.418 88.000 176.000 88.000 Z"),
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
        return _currencyKzt!!
    }

private var _currencyKzt: ImageVector? = null
