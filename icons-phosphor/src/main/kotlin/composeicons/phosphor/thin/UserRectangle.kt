package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserRectangle: ImageVector
    get() {
        if (_userRectangle != null) return _userRectangle!!
        _userRectangle = phosphorThinIcon(
            name = "UserRectangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 44h-176C33.373 44 28 49.373 28 56v144c0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12v-144c0-6.627-5.373-12-12-12ZM66 204c10.986-24.389 35.251-40.072 62-40.072 26.749 0 51.014 15.682 62 40.072ZM220 200c0 2.209-1.791 4-4 4h-17.33c-8.759-22.013-27.261-38.697-50.06-45.14 17.856-9.467 26.967-29.88 22.089-49.493C165.822 89.754 148.21 75.985 128 75.985c-20.21 0-37.822 13.768-42.699 33.381-4.878 19.613 4.233 40.027 22.089 49.493C84.591 165.303 66.089 181.987 57.33 204h-17.33c-2.209 0-4-1.791-4-4v-144c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4ZM128 156C108.118 156 92 139.882 92 120c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36Z"),
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
        return _userRectangle!!
    }

private var _userRectangle: ImageVector? = null
