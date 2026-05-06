package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CurrencyRub: ImageVector
    get() {
        if (_currencyRub != null) return _currencyRub!!
        _currencyRub = phosphorDuotoneIcon(
            name = "CurrencyRub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 92c0 28.719-23.281 52-52 52h-60v-104h60c28.719 0 52 23.281 52 52Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M148 152c33.137 0 60-26.863 60-60C208 58.863 181.137 32 148 32h-60c-4.418 0-8 3.582-8 8v96h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24v16h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24v32c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-32h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-48v-16ZM96 48h52c24.301 0 44 19.699 44 44 0 24.301-19.699 44-44 44h-52Z"),
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
        return _currencyRub!!
    }

private var _currencyRub: ImageVector? = null
