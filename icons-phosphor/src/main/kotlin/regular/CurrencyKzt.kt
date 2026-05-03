package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CurrencyKzt: ImageVector
    get() {
        if (_currencyKzt != null) return _currencyKzt!!
        _currencyKzt = phosphorRegularIcon(
            name = "CurrencyKzt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 96.000 C 208.000 100.418 204.418 104.000 200.000 104.000 L 136.000 104.000 L 136.000 216.000 C 136.000 220.418 132.418 224.000 128.000 224.000 C 123.582 224.000 120.000 220.418 120.000 216.000 L 120.000 104.000 L 56.000 104.000 C 51.582 104.000 48.000 100.418 48.000 96.000 C 48.000 91.582 51.582 88.000 56.000 88.000 L 200.000 88.000 C 204.418 88.000 208.000 91.582 208.000 96.000 ZM 56.000 64.000 L 200.000 64.000 C 204.418 64.000 208.000 60.418 208.000 56.000 C 208.000 51.582 204.418 48.000 200.000 48.000 L 56.000 48.000 C 51.582 48.000 48.000 51.582 48.000 56.000 C 48.000 60.418 51.582 64.000 56.000 64.000 Z"),
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
