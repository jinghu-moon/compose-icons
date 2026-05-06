package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) return _shoppingCart!!
        _shoppingCart = phosphorBoldIcon(
            name = "ShoppingCart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M233.21 56.31C230.931 53.579 227.557 52.001 224 52h-158L60.53 21.85C59.492 16.148 54.526 12.003 48.73 12h-24.73C17.373 12 12 17.373 12 24c0 6.627 5.373 12 12 12h14.71L63.62 173c.669 3.639 2.052 7.109 4.07 10.21-9.862 11.539-10.26 28.418-.954 40.409 9.306 11.991 25.756 15.795 39.381 9.107C119.743 226.037 126.795 210.697 123 196h34c-3.42 13.246 1.959 27.202 13.385 34.726 11.426 7.524 26.371 6.952 37.189-1.423 10.818-8.375 15.115-22.701 10.693-35.647C213.844 180.71 201.681 172.007 188 172h-96.83c-1.93-.002-3.583-1.382-3.93-3.28L84.92 156h111.18c13.535 0 25.133-9.682 27.55-23L235.81 66.14c.633-3.5-.319-7.101-2.6-9.83ZM100 204c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM188 212c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM200 128.72c-.345 1.887-1.982 3.263-3.9 3.28h-115.54L70.38 76h139.24Z"),
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
