package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MoneyWavy: ImageVector
    get() {
        if (_moneyWavy != null) return _moneyWavy!!
        _moneyWavy = phosphorRegularIcon(
            name = "MoneyWavy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244.24 60c-2.341-1.461-5.271-1.612-7.75-.4-42.93 21-73.59 11.16-106 .78C96.49 49.49 61.24 38.24 12.54 62.02 9.763 63.352 7.997 66.16 8 69.24v119.93c-0 2.759 1.421 5.324 3.762 6.786 2.34 1.462 5.269 1.615 7.748 .404 42.93-21 73.59-11.16 106.05-.78 19.24 6.15 38.84 12.42 61 12.42 17.09 0 35.73-3.72 56.91-14.06 2.745-1.34 4.487-4.126 4.49-7.18v-119.93c.025-2.767-1.382-5.35-3.72-6.83ZM232 181.67c-40.6 18.17-70.25 8.69-101.56-1.32-19.24-6.15-38.84-12.42-61-12.42-15.569 .076-30.98 3.131-45.4 9v-102.6C64.64 56.16 94.29 65.64 125.6 75.65 156.91 85.66 189.14 96 232 79.09ZM128 96c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32C160 110.327 145.673 96 128 96ZM128 144c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM56 96v48c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM200 160v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v48c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8Z"),
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
