package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MoneyWavy: ImageVector
    get() {
        if (_moneyWavy != null) return _moneyWavy!!
        _moneyWavy = phosphorLightIcon(
            name = "MoneyWavy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.18 61.72c-1.755-1.095-3.951-1.208-5.81-.3-43.66 21.32-74.69 11.39-107.54 .88C96.16 51.53 61.35 40.4 13.37 63.84 11.309 64.845 10.001 66.937 10 69.23v120c.001 2.068 1.067 3.99 2.822 5.086 1.754 1.096 3.949 1.211 5.808 .304 43.66-21.32 74.69-11.39 107.54-.88 19 6.09 38.46 12.3 60.42 12.3 16.85 0 35.21-3.66 56-13.84 2.061-1.005 3.369-3.097 3.37-5.39v-120c.009-2.062-1.04-3.984-2.78-5.09ZM234 183c-41.9 19.21-72.17 9.53-104.17-.71C110.78 176.18 91.37 170 69.41 170 54.92 170 39.33 172.7 22 179.92v-106.92c41.9-19.21 72.17-9.53 104.17 .71C157.78 83.84 190.41 94.28 234 76.11ZM128 98c-16.569 0-30 13.431-30 30 0 16.569 13.431 30 30 30 16.569 0 30-13.431 30-30C158 111.431 144.569 98 128 98ZM128 146c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM54 96v48c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-48c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM202 160v-48c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v48c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6Z"),
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
        return _moneyWavy!!
    }

private var _moneyWavy: ImageVector? = null
