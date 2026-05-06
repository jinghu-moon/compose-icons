package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MoneyWavy: ImageVector
    get() {
        if (_moneyWavy != null) return _moneyWavy!!
        _moneyWavy = phosphorThinIcon(
            name = "MoneyWavy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M242.12 63.39c-1.172-.732-2.639-.808-3.88-.2-44.37 21.68-75.77 11.64-109 1C96.01 53.55 61.53 42.52 14.24 65.61c-1.374 .673-2.243 2.07-2.24 3.6v120c-.003 1.382 .708 2.668 1.88 3.4 1.172 .732 2.639 .808 3.88 .2 44.37-21.68 75.77-11.64 109-1 18.86 6 38.08 12.19 59.8 12.19 16.61 0 34.69-3.6 55.18-13.61 1.374-.673 2.243-2.07 2.24-3.6v-120c.007-1.378-.696-2.663-1.86-3.4ZM236 184.27c-43.19 20.27-74.1 10.38-106.78-.08-18.86-6-38.08-12.18-59.8-12.18-15 0-31.28 3-49.42 10.94v-111.22C63.19 51.46 94.1 61.35 126.78 71.81 158.7 82 191.67 92.57 236 73.05ZM128 100c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28 0-15.464-12.536-28-28-28ZM128 148c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM52 96v48c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-48c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM204 160v-48c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v48c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4Z"),
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
