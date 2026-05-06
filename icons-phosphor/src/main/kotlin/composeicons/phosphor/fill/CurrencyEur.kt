package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyEur: ImageVector
    get() {
        if (_currencyEur != null) return _currencyEur!!
        _currencyEur = phosphorFillIcon(
            name = "CurrencyEur",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 104c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-40v16h24c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-23.19c2.863 14.037 13.014 25.471 26.613 29.976 13.599 4.505 28.569 1.394 39.247-8.156 2.112-2.018 5.156-2.724 7.941-1.843 2.785 .882 4.868 3.211 5.434 6.076 .566 2.866-.474 5.812-2.715 7.686-15.382 13.752-37.079 17.933-56.469 10.879C89.471 189.566 75.53 172.421 72.58 152h-8.58c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h8v-16h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h8.58C75.53 83.579 89.471 66.434 108.861 59.381c19.39-7.054 41.088-2.873 56.469 10.879 2.24 1.874 3.281 4.821 2.715 7.686-.566 2.866-2.649 5.195-5.434 6.076-2.785 .882-5.829 .175-7.941-1.843C143.992 72.629 129.022 69.518 115.423 74.024 101.824 78.529 91.673 89.963 88.81 104Z"),
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
        return _currencyEur!!
    }

private var _currencyEur: ImageVector? = null
