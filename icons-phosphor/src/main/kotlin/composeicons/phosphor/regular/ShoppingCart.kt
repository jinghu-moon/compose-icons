package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) return _shoppingCart!!
        _shoppingCart = phosphorRegularIcon(
            name = "ShoppingCart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.14 58.87C228.62 57.051 226.371 56 224 56h-161.32L56.6 22.57C55.909 18.766 52.596 16.001 48.73 16h-24.73c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h18L67.56 172.29c.753 4.161 2.592 8.048 5.33 11.27-10.49 9.798-11.872 25.943-3.198 37.381 8.674 11.438 24.592 14.464 36.857 7.006 12.265-7.458 16.904-22.983 10.741-35.947h45.42c-1.79 3.747-2.716 7.848-2.71 12 0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28 0-15.464-12.536-28-28-28h-96.83c-3.866-.001-7.179-2.766-7.87-6.57L80.13 152h116c11.599-.002 21.537-8.298 23.61-19.71L231.9 65.43c.417-2.34-.228-4.743-1.76-6.56ZM104 204c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM200 204c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM204 129.43c-.693 3.815-4.022 6.584-7.9 6.57h-118.88L65.59 72h148.82Z"),
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
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
