package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyNgn: ImageVector
    get() {
        if (_currencyNgn != null) return _currencyNgn!!
        _currencyNgn = phosphorBoldIcon(
            name = "CurrencyNgn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 116h-12v-70c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v70h-46.14L73.46 38.62C70.309 34.582 64.941 32.989 60.098 34.655 55.254 36.321 52.001 40.878 52 46v70h-12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h12v70c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-70h46.14l60.4 77.38c3.151 4.038 8.519 5.631 13.362 3.965 4.844-1.666 8.096-6.223 8.098-11.345v-70h12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM76 116v-35.12L103.41 116ZM180 175.12 152.59 140h27.41Z"),
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
        return _currencyNgn!!
    }

private var _currencyNgn: ImageVector? = null
