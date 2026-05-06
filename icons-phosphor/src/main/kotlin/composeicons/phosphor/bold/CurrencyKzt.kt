package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyKzt: ImageVector
    get() {
        if (_currencyKzt != null) return _currencyKzt!!
        _currencyKzt = phosphorBoldIcon(
            name = "CurrencyKzt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 100c0 6.627-5.373 12-12 12h-60v100c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-100h-60c-6.627 0-12-5.373-12-12C44 93.373 49.373 88 56 88h144c6.627 0 12 5.373 12 12ZM56 64h144c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-144C49.373 40 44 45.373 44 52c0 6.627 5.373 12 12 12Z"),
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
